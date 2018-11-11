package cn.ksdshpx.pjfinal.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author peng.x
 * @date 2018年11月11日 下午7:03:21
 */
public class TestJedisPool {
	public static void main(String[] args) {
		JedisPool jedisPool = null;
		Jedis jedis = null;
		try {
			jedisPool = JedisPoolUtil.getJedisPoolInstance();
			jedis = jedisPool.getResource();
			jedis.set("aa", "bb");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JedisPoolUtil.release(jedisPool, jedis);
		}
	}
}
