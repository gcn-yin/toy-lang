package lang.expression;

import lang.expval.NumVal;

import java.util.Map;

public class MinusExp implements Expression{
    private int num;

    public MinusExp(int num) {
        this.num = -num;
    }

    @Override
    public NumVal value(Map<String, Expression> env) {
        return new NumVal(this.num);
    }

    @Override
    public String toString() {
        return "MinusExp{" +
                "num=" + num +
                '}';
    }
}
