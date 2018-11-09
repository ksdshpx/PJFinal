package cn.ksdshpx.pjfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * @author peng.x
 * @date 2018年11月9日 上午10:51:53
 */
public class GlobalInterceptor implements Interceptor{

	public void intercept(Invocation inv) {
		System.out.println("GlobalInterceptor...");
		inv.invoke();
	}

}
