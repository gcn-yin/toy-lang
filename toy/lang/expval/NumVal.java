package lang.expval;

public class NumVal implements ExpVal {
    private int num;

    public NumVal(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "NumVal{" +
                "num=" + num +
                '}';
    }
}
