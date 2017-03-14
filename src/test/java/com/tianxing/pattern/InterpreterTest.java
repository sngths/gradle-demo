package com.tianxing.pattern;

import com.tianxing.pattern.interpreter.AndExpression;
import com.tianxing.pattern.interpreter.Expression;
import com.tianxing.pattern.interpreter.OrExpression;
import com.tianxing.pattern.interpreter.TerminalExpression;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/14.
 * 解释器模式
 */
public class InterpreterTest {


    private Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }


    private Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }


    @Test
    public void test() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }


}
