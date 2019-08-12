package lang.expression;

import lang.expval.*;

import java.util.Map;

public class ZeroOrNotExp implements Expression {
    private Expression exp1;

    public ZeroOrNotExp(Expression exp1) {
        this.exp1 = exp1;
    }

    @Override
    public BoolVal value(Map<String, Expression> env) {
        NumVal numVal = (NumVal) exp1.value(env);
        int num = numVal.getNum();
        if (num == 0) {
            return new BoolVal(true);
        } else {
            return new BoolVal(false);
        }
    }

    @Override
    public String toString() {
        return "ZeroOrNotExp{" +
                "exp1=" + exp1 +
                '}';
    }

}
