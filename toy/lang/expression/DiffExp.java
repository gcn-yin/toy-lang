package lang.expression;

import lang.expval.*;

import java.util.Map;

public class DiffExp implements Expression {
    private Expression exp1;
    private Expression exp2;

    public DiffExp(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public NumVal value(Map<String, Expression> env) {
        ExpVal val1 = exp1.value(env);
        ExpVal val2 = exp2.value(env);
        int num1 = ExpValHelp.toInt((NumVal) val1);
        int num2 = ExpValHelp.toInt((NumVal) val2);
        System.out.println("num1:" + num1 + " - num2:" + num2 + " = " + (num1 - num2));
        return new NumVal(num1 - num2);
    }

    @Override
    public String toString() {
        return "DiffExp{" +
                "exp1=" + exp1 +
                ", exp2=" + exp2 +
                '}';
    }
}
