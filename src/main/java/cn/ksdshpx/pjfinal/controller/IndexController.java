package cn.ksdshpx.pjfinal.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

import cn.ksdshpx.pjfinal.interceptor.ClassInterceptor;
import cn.ksdshpx.pjfinal.interceptor.MethodInterceptor;
import cn.ksdshpx.pjfinal.model.Blog;

/**
 * @author peng.x
 * @date 2018年11月5日 下午3:39:11
 */
@Before(ClassInterceptor.class)
public class IndexController extends Controller {
	public void index() {
		setAttr("msg", "hello,jfinal3.0!");
		renderTemplate("index.html");
	}

	public void add() {
		renderTemplate("add.html");
	}

	public void doAdd() {
		System.out.println(getModel(Blog.class));
		renderText("提交成功");
	}

	/**
	 * 测试method级别的Interceptor
	 */
	@Before(MethodInterceptor.class)
	public void testMethod() {
		renderTemplate("index.html");
	}
}
