package proxy;

import java.lang.reflect.Method;

public interface Advice {

	void beforeMethod(Method method);

	void afterMethod(Method method);

}