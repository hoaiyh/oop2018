package week7.task1;

public class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Subtraction(Expression s1, Expression n2) {
        left = s1;
        right = n2;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left+"-"+right;
    }

    @Override
    public int envaluate() {
        return left.envaluate()- right.envaluate();
    }
}
