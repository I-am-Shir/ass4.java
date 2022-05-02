import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Val implements Expression {
    boolean value;

    /**
     * constructor.
     */
    public Val(boolean value){
        this.value=value;
    }

    @Override
    public Boolean evaluate(Map<String, Boolean> assignment) throws Exception {
        return value;
    }

    @Override
    public Boolean evaluate() throws Exception {
        return value;
    }

    @Override
    public String toString(){
        if (value){
            return "T";
        }
        return "F";
    }

    @Override
    public List<String> getVariables() {
        List<String> string = new ArrayList<String>();
        string.add(this.toString());
        return string;
    }

    @Override
    public Expression assign(String var, Expression expression) {
        return this;
    }
}
