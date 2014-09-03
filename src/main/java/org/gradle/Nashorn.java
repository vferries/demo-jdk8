package org.gradle;

import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public enum Nashorn {
	INSTANCE;

	private ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

	public Object executeJavaScript(String js) throws ScriptException {
		return engine.eval(js);
	}

	public Object executeJavaScript(Reader reader) throws ScriptException {
		return engine.eval(reader);
	}
}
