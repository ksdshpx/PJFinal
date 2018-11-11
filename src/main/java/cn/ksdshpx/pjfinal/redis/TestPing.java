package cn.ksdshpx.pjfinal.redis;

import redis.clients.jedis.Jedis;

/**
 * @author peng.x
 * @date 2018年11月11日 下午5:13:07
 */
public class TestPing {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.190.135", 6379);
		System.out.println(jedis.ping());
	}
}
