file :
  js : "src/main/resources/js/aes.js"

file :
  js : "WEB-INF/classes/js/aes.js"

// 스크립트 엔진 호출
ScriptEngineManager sem = new ScriptEngineManager();
ScriptEngine se = sem.getEngineByName("JavaScript");

// js 파일 호출
URL resourceUrl = this.getClass().getClassLoader().getResource("js/aes.js");
String fileLocation = resourceUrl.getFile();

// evel 메소드를 사용하여 컴파일
try {
	se.eval(new FileReader(fileLocation));
} catch (FileNotFoundException | ScriptException e) {
	e.printStackTrace();
}

String aesKey = "test";
String ob = null;
// 자바스크립트의 함수를 실행하게 해주는 Invocable
Invocable inv = (Invocable) se;

// invokeFunction을 통한 특정 함수 호출
try {
	ob = (String) inv.invokeFunction("decrypt", input, aesKey, 256);
} catch (NoSuchMethodException | ScriptException e) {
	e.printStackTrace();
}