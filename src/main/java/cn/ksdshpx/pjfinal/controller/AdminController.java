package cn.ksdshpx.pjfinal.controller;

import com.jfinal.core.Controller;

/**
 * @author peng.x
 * @date 2018年11月6日 上午11:00:14
 */
public class AdminController extends Controller{
	public void adminMethod() {
		setAttr("admin", "我是后端页面");
		render("index.html");
	}
}
