package cn.ksdshpx.pjfinal.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * @author peng.x
 * @date 2018年11月11日 下午5:57:56
 */
public class TestRedisAPI {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.190.135",6379);
		jedis.set("k1", "v1");
		jedis.set("k2", "v2");
		jedis.set("k3", "v3");
		System.out.println(jedis.get("k2"));
		Set<String> keySet = jedis.keys("*");
		System.out.println(keySet);
	}
}
