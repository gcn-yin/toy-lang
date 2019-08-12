package lang.expression;

import lang.expval.*;

import java.util.Map;

public class IfExp implements Expression {
    private Expression exp1;
    private Expression exp2;
    private Expression exp3;

    public IfExp(Expression exp1, Expression exp2, Expression exp3) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

    @Override
    public NumVal value(Map<String, Expression> env) {
        ExpVal val1 = exp1.value(env);
        boolean bool = ExpValHelp.toBool((BoolVal) val1);
        if (bool) {
            return (NumVal) exp2.value(env);
        } else {
            return (NumVal) exp3.value(env);
        }
    }

    @Override
    public String toString() {
        return "IfExp{" +
                "exp1=" + exp1 +
                ", exp2=" + exp2 +
                ", exp3=" + exp3 +
                '}';
    }
}
