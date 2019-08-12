package lang.expression;

import lang.expval.*;

import java.util.Map;

public class ConstExp implements Expression {
    private int num;

    public ConstExp(int num) {
        this.num = num;
    }

    @Override
    public NumVal value(Map<String, Expression> env) {
        return new NumVal(this.num);
    }

    @Override
    public String toString() {
        return "ConstExp{" +
                "num=" + num +
                '}';
    }
}
