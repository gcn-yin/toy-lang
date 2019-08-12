package lang.expression;

import lang.expval.*;

import java.util.HashMap;
import java.util.Map;

public class LetExp implements Expression{
    private String var;
    private Expression exp1;
    private Expression body;

    public LetExp(String var, Expression exp1, Expression body) {
        this.var = var;
        this.exp1 = exp1;
        this.body = body;
    }

    @Override
    public ExpVal value(Map<String, Expression> env) {
        ExpVal val1 = exp1.value(env);
        Map<String, Expression> newEnv = new HashMap<>(env);
        newEnv.put(var, exp1);
        return body.value(newEnv);
    }

    @Override
    public String toString() {
        return "LetExp{" +
                "var='" + var + '\'' +
                ", exp1=" + exp1 +
                ", body=" + body +
                '}';
    }
}
