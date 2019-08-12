package lang.expval;

public class ExpValHelp {
    public static int toInt(NumVal numVal) {
        return numVal.getNum();
    }

    public static boolean toBool(BoolVal boolVal) {
        return boolVal.isBool();
    }

    public static ProcVal toProc(ProcVal procVal) {
        return procVal;
    }

    public static String toStr(StrVal strVal) {
        return strVal.getStr();
    }
}
