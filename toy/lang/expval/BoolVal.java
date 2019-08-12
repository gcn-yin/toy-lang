package lang.expval;

public class BoolVal implements ExpVal{
    private boolean bool;

    public BoolVal(boolean bool) {
        this.bool = bool;
    }

    public boolean isBool() {
        return bool;
    }

    @Override
    public String toString() {
        return "BoolVal{" +
                "bool=" + bool +
                '}';
    }
}
