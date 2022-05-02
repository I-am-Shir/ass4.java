import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Var implements Expression {
String var;
    /**
     * constructor.
     */
    public Var(String var){
        this.var=var;
    }

    @Override
    public Boolean evaluate(Map<String, Boolean> assignment) throws Exception {
        if(assignment.containsKey(var)){
            return assignment.get(var);
        }
        throw new Exception("DOES NOT COMPUTE- could not find the key");
    }

    @Override
    public Boolean evaluate() throws Exception {
        return evaluate(Collections.emptyMap());
    }

    @Override
    public String toString(){
     return var;
    }

    @Override
    public List<String> getVariables() {
        List<String> vars = new ArrayList<String>();
        vars.add(var);
        return vars;
    }

    @Override
    public Expression assign(String var, Expression expression) {
        if (this.var.equals(var)) {
            return expression;
        }
        return this;
    }
}
