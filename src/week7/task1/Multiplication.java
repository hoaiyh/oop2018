package week7.task1;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;
    public Multiplication(Expression left,Expression right){
        this.left = left;
        this.right = right;

    }
    @Override
    public Expression left() {
        return left();
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left+"*"+right;
    }

    @Override
    public int envaluate() {
        return left.envaluate()*right.envaluate();
    }
}
