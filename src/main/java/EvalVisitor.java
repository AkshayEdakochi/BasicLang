

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class EvalVisitor extends BasicLangBaseVisitor<Value> {

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();
    //For break statement
    Boolean breakOn = false;
    Scanner sc = new Scanner(System.in);
   /*
    @Override
    public Value visitAssignment(BasicLangParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }*/
    @Override
    public Value visitVariableAssignment(BasicLangParser.VariableAssignmentContext ctx) { 
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value); 
        }
    @Override 
    public Value visitShreniInitialisation(BasicLangParser.ShreniInitialisationContext ctx) { 
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.elementList());
        return memory.put(id,value);
        }
    //Overrides ShreniIndexed returns the value stored at that Index
    @Override 
    public Value visitShreniIndexed(BasicLangParser.ShreniIndexedContext ctx) { 
        
        String id = ctx.identifier().ID().getText();
        Value index = visit(ctx.indexingExpr().expr());
        //System.out.println(id +"yoyo" +index); 
        Value listAsValue = memory.get(id);
        Value value;
        if(listAsValue == null){
            throw new RuntimeException ("no such variable: " +id);
        }
        else if(!listAsValue.isList()){
            throw new RuntimeException ("no such List: " +id);
        }
        else{
            value = listAsValue.asList().get(index.asInteger());
        }
        //System.out.println("val is :" + value);
        //System.out.println("isInteger :" + value.isInteger());
        return value; }
    
    //Overrides shreniIndexed expr - recivec a value from shreniIndexed
    @Override 
    public Value visitShreniIndexedExpr(BasicLangParser.ShreniIndexedExprContext ctx) { 
        
        Value value = visit(ctx.shreniIndexed());
        //System.out.println("Inside shreniIndexedExpr: isiteger:"+value.isInteger());
        return value; }

    //Overrides shreniMultipleIndexed as
    @Override
    public Value visitShreniMultipleIndexed(BasicLangParser.ShreniMultipleIndexedContext ctx) { 
        Value list = visit(ctx.shreniIndexed());
        List<BasicLangParser.IndexingExprContext> exprContexts = ctx.indexingExpr();
        Value value = list;
        for (BasicLangParser.IndexingExprContext exprContext : exprContexts){
            Value index = visit(exprContext.expr());
            if(value.isList())
                value = value.asList().get(index.asInteger());
            else
                throw new RuntimeException(list + " is not a list"); 
        }

        return value; }



    /*
    @Override
    public Value visitIdAtom(BasicLangParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }*/
    @Override 
    public Value visitIdentifier(BasicLangParser.IdentifierContext ctx) { 
        String id = ctx.ID().getText();
        Value value = memory.get(id);
        if (value == null){
            throw new RuntimeException ("no such variable: " +id);
        }
        return value; }
    
    //overrides visitElementList. returns a list of atom elements as Value object
    @Override public Value visitShreniElements(BasicLangParser.ShreniElementsContext ctx) { 
        List<BasicLangParser.ShreniElementContext> elementContexts = ctx.shreniElement();
        List<Value> list = new ArrayList<Value>();
        Value element;
        for (BasicLangParser.ShreniElementContext elementContext: elementContexts){
            if(elementContext != null){
                element = visit(elementContext);
                //System.out.println(element);
                list.add(element);
            }
            
        }
        /*System.out.println(list);
        System.out.println(list.get(0).isInteger());
        System.out.println(list.get(1).isInteger());
        System.out.println(list.get(2).isInteger());*/
        Value listAsValue = new Value(list);
        return listAsValue; 
    }

    //overrides elementList. receives listAsValue from ShreniElements and returns it
    @Override 
    public Value visitElementList(BasicLangParser.ElementListContext ctx) { 
        Value listAsValue = visit(ctx.shreniElements());
        return listAsValue; 
    }

    @Override public Value visitShreniElementAssignment(BasicLangParser.ShreniElementAssignmentContext ctx) {
        Value value = visit(ctx.expr());
        List<BasicLangParser.IndexingExprContext> indexExprs = ctx.indexingExpr();
        int[] indexes = new int[20];
        int len = 0;
        String id = ctx.identifier().ID().getText();
        Value listElement = memory.get(id);
        for (BasicLangParser.IndexingExprContext indexExpr : indexExprs){
            Value index = visit(indexExpr.expr());
            indexes[len] = index.asInteger();
            len++;
        }
        for (int i=0; i<len-2;i++){
            listElement = listElement.asList().get(indexes[i]);
        }
        listElement.asList().set(indexes[len-1],value);
        //System.out.println(memory);
        return value; }



    // atom overrides
    /*
    @Override
    public Value visitStringAtom(BasicLangParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }*/
    @Override 
    public Value visitString(BasicLangParser.StringContext ctx) { 
        String str = ctx.STRING().getText();
        //strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str); 
        }

    /*
    @Override
    public Value visitIntAtom(BasicLangParser.IntAtomContext ctx){
        return new Value(Integer.valueOf(ctx.getText()));
    }*/
    @Override 
    public Value visitIntegerAtom(BasicLangParser.IntegerAtomContext ctx) { 
        return new Value(Integer.valueOf(ctx.INT().getText())); }
    /*
    @Override
    public Value visitFloatAtom(BasicLangParser.FloatAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }*/

    /*
    @Override
    public Value visitNumberAtom(BasicLangParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }
    */
    @Override 
    public Value visitFloatAtom(BasicLangParser.FloatAtomContext ctx) { 
        
        return new Value(Double.valueOf(ctx.FLOAT().getText())); }


    @Override
    public Value visitBooleanAtom(BasicLangParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    /*
    @Override
    public Value visitNilAtom(BasicLangParser.NilAtomContext ctx) {
        return new Value(null);
    }*/
    @Override 
    public Value visitNil(BasicLangParser.NilContext ctx) { 
        return new Value(null); }


    /*// expr overrides
    @Override
    public Value visitParExpr(BasicLangParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }*/

    @Override 
    public Value visitParathesisedExpr(BasicLangParser.ParathesisedExprContext ctx) { 
        return this.visit(ctx.expr()); }



    @Override
    public Value visitUnaryMinusExpr(BasicLangParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(BasicLangParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(@NotNull BasicLangParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case BasicLangParser.MULT:
                if (left.isInteger() && right.isInteger())
                    return new Value(left.asInteger() * right.asInteger());
                else
                    return  new Value (left.asDouble()*right.asDouble());
            case BasicLangParser.DIV:
                if (left.isInteger() && right.isInteger())
                    return new Value(left.asInteger() / right.asInteger());
                else
                    return  new Value (left.asDouble() / right.asDouble());
            case BasicLangParser.MOD:
                if (left.isInteger() && right.isInteger())
                    return new Value(left.asInteger() % right.asInteger());
                else
                    return  new Value (left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + BasicLangParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAdditiveExpr(@NotNull BasicLangParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case BasicLangParser.PLUS:
                /*return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());*/
                if (left.isInteger() && right.isInteger())
                    return new Value(left.asInteger() + right.asInteger());
                else if ((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isInteger()))
                    return new Value(left.asDouble() + right.asDouble());
                else
                    return new Value(left.asString() + right.asString());   
                
            case BasicLangParser.MINUS:
                if (left.isInteger() && right.isInteger())
                    return new Value(left.asInteger() - right.asInteger());
                else
                    return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + BasicLangParser.tokenNames[ctx.op.getType()]);
        }
    }
    @Override 
    public Value visitSweekarikkukaExpr(BasicLangParser.SweekarikkukaExprContext ctx) { 
        if(ctx.expr() != null){
                Value val = this.visit(ctx.expr());
                System.out.println(val);
            }
        String input = sc.nextLine();
        Value value = new Value(input);
        return value; 
        }


    @Override
    public Value visitSweekarikkukaStatement(BasicLangParser.SweekarikkukaStatementContext ctx){ 
        Value value = this.visit(ctx.sweekarikkukaExpr());
        
        String id = ctx.ID().getText();
        return memory.put(id,value);
        
        }
    	
    @Override
    public Value visitSamkhyaFunction(BasicLangParser.SamkhyaFunctionContext ctx) { 
        Value value = this.visit(ctx.samkhyaExpr());
        //Value value = new Value(val);
        return value;
        }
    
	@Override 
    public Value visitDirectSamkhyaCall(BasicLangParser.DirectSamkhyaCallContext ctx) {
            int val =0;
            String str;
            if(ctx.expr() != null) 
                {str = this.visit(ctx.expr()).asString();
                //System.out.println(str);
                }
            else str = this.visit(ctx.identifier()).asString(); 
        if (ctx.integerAtom() != null){
            String radix_str = this.visit(ctx.integerAtom()).asString(); 
            int radix = Integer.parseInt(radix_str);
            val = Integer.parseInt(str,radix);
        }
        else
            val = Integer.parseInt(str);
        return new Value(val);
        }

    @Override
    public Value visitSamkhyaSweekarikkuka(BasicLangParser.SamkhyaSweekarikkukaContext ctx) { 
        
        Value input =  this.visit(ctx.sweekarikkukaExpr());
        int intInput =0;
        /*
        //try-catch for NumberFromat Exception
        try{ 
            intInput = Integer.parseInt(input.asString());
            }
        catch(NumberFormatException e){
            System.out.println("Error:Expecting a number");
            Runtime.getRuntime().halt(0);
            }
        //try-catch for NumberFormatException ends
        */
        intInput = Integer.parseInt(input.asString());
        return new Value(intInput);
        }
    

    @Override
    public Value visitRelationalExpr(@NotNull BasicLangParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case BasicLangParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case BasicLangParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case BasicLangParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case BasicLangParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + BasicLangParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(@NotNull BasicLangParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case BasicLangParser.EQ:
                /*return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));*/
                if (left.isNumeric() && right.isNumeric()) {
                    double l = left.asDouble().doubleValue();
                    double r = right.asDouble().doubleValue();
                    return new Value(l == r) ;
                }
                else if (left.isString() && right.isString()){
                    String l = left.asString();
                    String r = right.asString();
                    return  new Value(l.equals(r));
                }
                else if (left.isBoolean() && right.isBoolean()){
                    Boolean l = left.asBoolean();
                    Boolean r = right.asBoolean();
                    return new Value(l == r);
                }
                else{
                    //System.out.println(left.equals(right));
                    //System.out.println(left.isBoolean());
                    //System.out.println(right.isBoolean());
                    return new Value (left.equals(right));
                }
                //break;
            case BasicLangParser.NEQ:
                /*
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));*/
                if (left.isNumeric() && right.isNumeric()) {
                    double l = left.asDouble().doubleValue();
                    double r = right.asDouble().doubleValue();
                    return new Value(l != r) ;
                }
                else if (left.isString() && right.isString()){
                    String l = left.asString();
                    String r = right.asString();
                    return  new Value(!l.equals(r));
                }
                //break;
            default:
                throw new RuntimeException("unknown operator: " + BasicLangParser.tokenNames[ctx.op.getType()]);
                //return new Value("");
        }
    }

    @Override
    public Value visitAndExpr(BasicLangParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(BasicLangParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    // log override
    @Override
    public Value visitLog(BasicLangParser.LogContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(BasicLangParser.If_statContext ctx) {

        List<BasicLangParser.AthavaBlockContext> conditions =  ctx.athavaBlock()    ;

        boolean evaluatedBlock = false;
        Value evaluateif =  this.visit(ctx.expr());
        if(evaluateif.asBoolean()){
            evaluatedBlock = true;
            this.visit(ctx.block());
        }
        if(!evaluatedBlock){

            for(BasicLangParser.AthavaBlockContext condition : conditions) {

                Value evaluated = this.visit(condition.expr());

                if(evaluated.asBoolean()) {
                    evaluatedBlock = true;
                    // evaluate this block whose expr==true
                    this.visit(condition.block());
                    break;
                }
            }
        }

        if(!evaluatedBlock && ctx.allenkilBlock() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.allenkilBlock().block());
        }

        return Value.VOID;
    }

    //Overrides kadakkupurath
    @Override 
    public Value visitKadakkuPurath(BasicLangParser.KadakkuPurathContext ctx) { 
        breakOn = true;
        return new Value(true);
        }


    // while override
    @Override
    public Value visitWhile_stat(BasicLangParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {
            if(breakOn){
                breakOn = false;
                break;
            }

            // evaluate the code block
            this.visit(ctx.block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }
}