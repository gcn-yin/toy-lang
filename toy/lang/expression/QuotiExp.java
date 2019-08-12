package lang.expression;

import lang.expval.ExpVal;
import lang.expval.ExpValHelp;
import lang.expval.NumVal;

import java.util.Map;

public class QuotiExp implements Expression {
    private Expression exp1;
    private Expression exp2;

    public QuotiExp(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public NumVal value(Map<String, Expression> env) {
        ExpVal val1 = exp1.value(env);
        ExpVal val2 = exp2.value(env);
        int num1 = ExpValHelp.toInt((NumVal) val1);
        int num2 = ExpValHelp.toInt((NumVal) val2);
        return new NumVal(num2 / num1);
    }

    @Override
    public String toString() {
        return "QuotiExp{" +
                "exp1=" + exp1 +
                ", exp2=" + exp2 +
                '}';
    }
}
