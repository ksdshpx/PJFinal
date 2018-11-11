package cn.ksdshpx.pjfinal.redis;

import redis.clients.jedis.Jedis;

/**
 * @author peng.x
 * @date 2018年11月11日 下午6:33:24
 */
public class TestMasterSlaver {
	public static void main(String[] args) {
		Jedis jedis_Master = new Jedis("192.168.190.135", 6379);
		Jedis jedis_Slave = new Jedis("192.168.190.135", 6380);
		jedis_Slave.slaveof("192.168.190.135", 6379);
		jedis_Master.set("class","1122");
		String value = jedis_Slave.get("class");
		System.out.println(value);
	}
}
