public class BinaryExpression extends BaseExpression{
Expression expression2;
    /**
     * constructor.
     *
     * @param baseExpress
     */
    public BinaryExpression(Expression baseExpress,Expression twoExpression) {
        super(baseExpress);
        this.expression2 = twoExpression;
    }


}
