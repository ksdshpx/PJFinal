package cn.ksdshpx.pjfinal.route;

import com.jfinal.config.Routes;

import cn.ksdshpx.pjfinal.controller.AdminController;

/**
 * @author peng.x
 * @date 2018年11月6日 上午10:58:55
 */
public class AdminRoute extends Routes{

	@Override
	public void config() {
		setBaseViewPath("/WEB-INF/admin");
		add("/admin", AdminController.class,"");
	}

}
