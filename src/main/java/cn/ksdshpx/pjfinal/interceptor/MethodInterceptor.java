package cn.ksdshpx.pjfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * @author peng.x
 * @date 2018年11月9日 上午10:04:47
 */
public class MethodInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		System.out.println("MethodInterceptor...");
		inv.invoke();
	}

}
