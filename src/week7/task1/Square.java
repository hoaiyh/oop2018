package week7.task1;

public class Square extends Expression {
    private Expression expression;
    public Square(Expression e)
    {
        expression = e;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int envaluate() {
        int a = expression.envaluate()*expression.envaluate();
        return a;
    }
}
