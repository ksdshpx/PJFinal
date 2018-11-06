package cn.ksdshpx.pjfinal.controller;

import com.jfinal.core.Controller;

/**
 * @author peng.x
 * @date 2018年11月6日 上午10:49:40
 */
public class FrontController extends Controller{
	public void frontMethod() {
		setAttr("front", "我是前端页面");
		render("front.html");
	}
}
