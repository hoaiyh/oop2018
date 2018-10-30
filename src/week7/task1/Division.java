package week7.task1;

public class Division extends BinaryExpression {
    private Expression left;
    private Expression right;

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
        return left + "/" + right;
    }

    @Override
    public int envaluate() {
        /*
        try{

        }catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
    }
    */
        return left.envaluate() / right.envaluate();
    }
}
