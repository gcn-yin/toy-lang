package lang.expression;

import lang.expval.ExpVal;
import lang.expval.NumVal;
import lang.expval.StrVal;

import java.util.Map;

public class StrExp implements Expression {
    private String str;

    public StrExp(String str) {
        this.str = str;
    }

    @Override
    public ExpVal value(Map<String, Expression> env) {
        Expression expression = env.get(str);
        if (expression.getClass() == ProcExp.class) {
            ProcExp procExp = (ProcExp) expression;
            return procExp.value(env);
        } else if (expression.getClass() == ConstExp.class) {
            ConstExp constExp = (ConstExp) expression;
            return constExp.value(env);
        }
        return null;
    }
}
