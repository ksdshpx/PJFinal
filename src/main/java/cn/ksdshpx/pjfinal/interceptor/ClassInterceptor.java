package cn.ksdshpx.pjfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * @author peng.x
 * @date 2018年11月9日 上午10:14:59
 */
public class ClassInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		System.out.println("ClassInterceptor...");
		inv.invoke();
	}

}
