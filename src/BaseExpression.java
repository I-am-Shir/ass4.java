import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BaseExpression implements Expression{
Expression baseExpress;
    /**
     * constructor.
     */
    public BaseExpression(Expression baseExpress){
        this.baseExpress = baseExpress;
    }

    @Override
    public Boolean evaluate(Map<String, Boolean> assignment) throws Exception {
        return baseExpress.evaluate(assignment);
    }

    @Override
    public Boolean evaluate() throws Exception {
        return evaluate(Collections.emptyMap());
    }

    @Override
    public String toString(){
        return baseExpress.toString();
    }

    @Override
    public List<String> getVariables() {
        return baseExpress.getVariables();
    }

    @Override
    public Expression assign(String var, Expression expression) {
        return baseExpress.assign(var,expression);
    }
}
