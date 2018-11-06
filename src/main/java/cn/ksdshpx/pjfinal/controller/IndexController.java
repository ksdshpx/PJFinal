package cn.ksdshpx.pjfinal.controller;

import com.jfinal.core.Controller;

/**
 * @author peng.x
 * @date 2018年11月5日 下午3:39:11
 */
public class IndexController extends Controller{
	public void index() {
		setAttr("msg", "hello,jfinal3.0!");
		renderTemplate("index.html");
	}
}
