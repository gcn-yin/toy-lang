package lang.expression;

import lang.expval.NumVal;

import java.util.Map;

public class VarExp implements Expression{
    private String var;

    public VarExp(String var) {
        this.var = var;
    }

    @Override
    public NumVal value(Map<String, Expression> env) {
        ConstExp expression =(ConstExp) env.get(var);
        return expression.value(env);
    }

    @Override
    public String toString() {
        return "VarExp{" +
                "var='" + var + '\'' +
                '}';
    }
}
