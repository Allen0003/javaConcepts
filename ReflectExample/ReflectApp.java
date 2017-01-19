package Reflect;

import java.lang.reflect.Method;

public class ReflectApp {
	public static void main(String[] args) {
		try {
			// load the AppTest at runtime
			Class<?> cls = Class.forName(AppTest.class.getName());
			Object obj = cls.newInstance();
			// call the printIt method
			Method method = cls.getDeclaredMethod("printIt", null);
			method.invoke(obj, null);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
