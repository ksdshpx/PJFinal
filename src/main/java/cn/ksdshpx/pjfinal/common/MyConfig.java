package cn.ksdshpx.pjfinal.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

import cn.ksdshpx.pjfinal.route.AdminRoute;
import cn.ksdshpx.pjfinal.route.FrontRoute;

/**
 * @author peng.x
 * @date 2018年11月5日 下午3:35:07
 */
public class MyConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	@Override
	public void configRoute(Routes me) {
		//me.add("/", IndexController.class);
		//me.add("/index", IndexController.class, "/abc");
		me.add(new FrontRoute());
		me.add(new AdminRoute());
	}

	@Override
	public void configEngine(Engine me) {
	}

	@Override
	public void configPlugin(Plugins me) {

	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configHandler(Handlers me) {

	}

	@Override
	public void afterJFinalStart() {
		System.out.println("afterJFinalStart()...");
	}

	@Override
	public void beforeJFinalStop() {
		System.out.println("beforeJFinalStop()...");
	}

	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 8088, "/", 5);
	}
}
