

import java.io.InputStream;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calc {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if(args.length>0) inputFile = args[0];
        InputStream is = System.in;
        if(inputFile != null) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);


        System.out.println("ഇപ്പോള്‍ run ചെയ്യുന്ന പ്രോഗ്രാം" + args[0]);

        BasicLangLexer lexer = new BasicLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasicLangParser parser = new BasicLangParser(tokens);
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}