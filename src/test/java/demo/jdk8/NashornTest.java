package demo.jdk8;

import static org.fest.assertions.api.Assertions.*;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptException;

import org.fest.util.Strings;
import org.junit.Test;

import demo.jdk8.Nashorn;

public class NashornTest {
	@Test
	public void testAddition() throws ScriptException {
		Object actual = Nashorn.INSTANCE.executeJavaScript("3 + 2");
		assertThat(actual).isEqualTo(5);
	}

	@Test
	public void testFactorial() throws ScriptException {
		String script = Strings.join(
				"var fact = function(n) {",
				"	return n == 1 ? 1 : n * fact(n-1);",
				"};",
				"fact(5)"
				).with("\n");
		Object actual = Nashorn.INSTANCE.executeJavaScript(script);
		assertThat(actual).isEqualTo(120.);
	}

	@Test
	public void testExecuteFile() throws ScriptException, FileNotFoundException {
		Object actual = Nashorn.INSTANCE.executeJavaScript(new FileReader("src/test/resources/testScript.js"));
		assertThat(actual).isEqualTo(6.);
	}
	
	@Test
	public void testJSMethodCall() throws Exception {
		String script = Strings.join(
				"var fact = function(n) {",
				"	return n == 1 ? 1 : n * fact(n-1);",
				"};"
				).with("\n");
		Nashorn.INSTANCE.executeJavaScript(script);
		Object actual = Nashorn.INSTANCE.invokeFunction("fact", 7);
		assertThat(actual).isEqualTo(5040.);
	}
	
	@Test
	public void testJavaCallFromJS() {
	}
}
