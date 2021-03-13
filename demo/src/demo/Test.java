package demo;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Test {
  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("Nashorn");
    String foo = "1+2+3-2";
    System.out.println(engine.eval(foo));
    } 
}
