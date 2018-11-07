package cn.ksdshpx.pjfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * @author peng.x
 * @date 2018年11月7日 上午11:28:49
 */
public class AdminInterceptor implements Interceptor {

	public void intercept(Invocation inv) {
		System.out.println("AdminInterceptor...");
		inv.invoke();
	}

}
