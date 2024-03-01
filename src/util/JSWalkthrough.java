package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSWalkthrough
{
	public JSWalkthrough()
	{
		StringBuilder js_content = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader("walkthrough.js")))
		{
			String line = null;
			while ((line = br.readLine()) != null)
				js_content.append(line).append("\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		String js = js_content.toString();
		

		try
		{
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("nashorn");
			Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
//			engine.put("vars",  vars);
//			Bindings bindings = engine.createBindings();
			engine.eval(js);
		    Invocable inv = (Invocable) engine;
		    Object[] params = new Object[0];
		    Object result = inv.invokeFunction("get_next_action", params);
		}
		catch (ScriptException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
