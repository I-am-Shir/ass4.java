import java.util.Map;

public class Not extends UnaryExpression{

    /**
     * constructor.
     *
     * @param baseExpress
     */
    public Not(Expression baseExpress) {
        super(baseExpress);
    }

    @Override
    public Boolean evaluate(Map<String, Boolean> assignment) throws Exception{
        return !baseExpress.evaluate(assignment);
    }

    @Override
    public String toString(){
        return "~"+baseExpress.toString();
    }
}
