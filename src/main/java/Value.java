import java.util.List;
public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;
    
    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        if (value instanceof Integer){
            int v = (int)value;
            double d = (double) v;
            return Double.valueOf(d);
        }
        return (Double)value;
    }

    public Integer asInteger(){
        if (value instanceof Double){
            double d = (double)value;
            int i = (int) d;
            return Integer.valueOf(i);
        }
        return (Integer)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    // method to convert Value object of list to list
    public List<Value> asList(){
            return (List) value;
    }

    public boolean isBoolean(){
        return value instanceof Boolean;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isInteger(){
        return value instanceof Integer;
    }

    public  boolean isNumeric(){
        return  (this.isDouble() || this.isInteger());
    }
    public boolean isString() {return  value instanceof String; }

    public boolean isList(){
            return value instanceof List;
        
    }



    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}