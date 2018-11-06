package cn.ksdshpx.pjfinal.route;

import com.jfinal.config.Routes;

import cn.ksdshpx.pjfinal.controller.FrontController;

/**
 * @author peng.x
 * @date 2018年11月6日 上午10:47:50 前端路由
 */
public class FrontRoute extends Routes {

	@Override
	public void config() {
		setBaseViewPath("/front");
		add("/", FrontController.class);
	}
}
