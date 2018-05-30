package com.data.base;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author dk
 * @date 2016/3/9
 */
public class TestScript1 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");
        String exp = "2*6-(6+5)";
        Object result = scriptEngine.eval(exp);
        System.out.println(exp+"="+result);
    }
}
