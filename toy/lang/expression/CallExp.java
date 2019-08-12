package lang.expression;

import lang.expval.*;

import java.util.Map;
import java.util.stream.Stream;

public class CallExp implements Expression {
    private Expression rator;
    private Expression rand;

    public CallExp(Expression rator, Expression rand) {
        this.rator = rator;
        this.rand = rand;
    }

    @Override
    public ExpVal value(Map<String, Expression> env) {
        ExpVal expVal = rator.value(env);
        ProcVal proc;
        if (expVal.getClass() == StrVal.class) {
            StrVal strVal = (StrVal) expVal;
            Expression expression = env.get(strVal.getStr());
            proc = (ProcVal) expression.value(env);
        } else if (expVal.getClass() == ProcVal.class) {
            proc = (ProcVal) expVal;
        } else proc = null;  // maybe NullPointException
        NumVal arg = (NumVal) rand.value(env);
        int intArg = arg.getNum();
        return proc.call(intArg);
    }

    @Override
    public String toString() {
        return "CallExp{" +
                "rator=" + rator +
                ", rand=" + rand +
                '}';
    }
}
