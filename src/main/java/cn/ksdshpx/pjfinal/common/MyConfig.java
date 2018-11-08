package cn.ksdshpx.pjfinal.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

import cn.ksdshpx.pjfinal.controller.IndexController;
import cn.ksdshpx.pjfinal.model.Blog;
import cn.ksdshpx.pjfinal.route.AdminRoute;
import cn.ksdshpx.pjfinal.route.FrontRoute;

/**
 * @author peng.x
 * @date 2018年11月5日 下午3:35:07
 */
public class MyConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// 加载系统配置，之后可以通过PropKit.get(...)获取
		PropKit.use("systemconfig.properties");
		me.setDevMode(PropKit.getBoolean("devMode"));
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/index", IndexController.class,"");
		// me.add("/index", IndexController.class, "/abc");
		me.add(new FrontRoute());
		me.add(new AdminRoute());
	}

	@Override
	public void configEngine(Engine me) {
	}

	@Override
	public void configPlugin(Plugins me) {
		// 配置druid连接池插件
		DruidPlugin druidPlugin = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"));
		me.add(druidPlugin);
		// 配置ActiveRecordPlugin插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		arp.addMapping("t_blog", Blog.class);
		me.add(arp);
	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configHandler(Handlers me) {
		me.add(new ContextPathHandler("ctx"));
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
