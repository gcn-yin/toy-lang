package lang.expval;

public class StrVal implements ExpVal {
    private String str;

    public StrVal(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
