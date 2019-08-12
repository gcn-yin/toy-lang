package lang;

import lang.expression.*;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Expression expression = new LetExp(
            "x",
                new ConstExp(200),
                new LetExp(
                        "f",
                        new ProcExp(
                                "z",
                                new DiffExp(
                                        new StrExp("z"),
                                        new StrExp("x")
                                )
                        ),
                        new LetExp(
                                "x",
                                new ConstExp(100),
                                new LetExp(
                                        "g",
                                        new ProcExp(
                                                "z",
                                                new DiffExp(
                                                        new StrExp("z"),
                                                        new StrExp("x")
                                                )
                                        ),
                                        new DiffExp(
                                                new CallExp(
                                                        new StrExp("f"),
                                                        new ConstExp(1)
                                                ),
                                                new CallExp(
                                                        new StrExp("g"),
                                                        new ConstExp(1)
                                                )
                                        )
                                )
                        )
                )
        );
        System.out.println(expression.value(new HashMap<>()));
    }
}
