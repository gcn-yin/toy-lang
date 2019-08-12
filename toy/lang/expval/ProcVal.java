package lang.expval;

import lang.expression.ConstExp;
import lang.expression.Expression;

import java.util.HashMap;
import java.util.Map;

public class ProcVal implements ExpVal{
    private String var;
    private Expression body;
    private Map<String, Expression> env;

    public ProcVal(String var, Expression body, Map<String, Expression> env) {
        this.var = var;
        this.body = body;
        this.env = new HashMap<>(env);
    }

    public ExpVal call(int var) {
        Map<String, Expression> newEnv = new HashMap<>(env);
        newEnv.put(this.var, new ConstExp(var));
        return body.value(newEnv);
    }

    public String getVar() {
        return var;
    }

    public Expression getBody() {
        return body;
    }

    public Map<String, Expression> getEnv() {
        return env;
    }

    @Override
    public String toString() {
        return "ProcVal{" +
                "var='" + var + '\'' +
                ", body=" + body +
                ", env=" + env +
                '}';
    }
}
