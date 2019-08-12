package lang.expression;

import java.util.Map;
import lang.expval.*;

public interface Expression {
    ExpVal value(Map<String, Expression> env);
}
