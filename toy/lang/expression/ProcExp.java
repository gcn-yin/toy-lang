package lang.expression;

import lang.expval.*;

import java.util.Map;

public class ProcExp implements Expression {
    private String var;
    private Expression body;

    public ProcExp(String var, Expression body) {
        this.var = var;
        this.body = body;
    }

    @Override
    public ProcVal value(Map<String, Expression> env) {
        return new ProcVal(var, body, env);
    }
}
