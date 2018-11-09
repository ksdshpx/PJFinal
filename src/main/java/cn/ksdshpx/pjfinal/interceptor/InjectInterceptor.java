package cn.ksdshpx.pjfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * @author peng.x
 * @date 2018年11月9日 下午2:11:03
 */
public class InjectInterceptor implements Interceptor{

	public void intercept(Invocation inv) {
		System.out.println("InjectInterceptor...");
		inv.invoke();
	}

}
