package cn.ksdshpx.pjfinal.service;

import com.jfinal.aop.Before;

import cn.ksdshpx.pjfinal.interceptor.InjectInterceptor;

/**
 * @author peng.x
 * @date 2018年11月9日 下午2:10:32
 */
//@Before(InjectInterceptor.class)
public class OrderServiceImpl {
	public void testInject() {
		System.out.println("testInject...");
	}
}
