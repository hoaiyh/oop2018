package week7.task1;

public class Numeral extends Expression {
    public int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public Numeral(int n)
    {
        value = n;
    }
    public Numeral(){}

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int envaluate() {
        return value;
    }
}
