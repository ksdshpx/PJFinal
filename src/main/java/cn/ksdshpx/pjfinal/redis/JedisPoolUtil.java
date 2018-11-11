package cn.ksdshpx.pjfinal.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author peng.x
 * @date 2018年11月11日 下午6:52:58
 */
public class JedisPoolUtil {
	private JedisPoolUtil() {

	}

	private static volatile JedisPool jedisPool = null;

	public static JedisPool getJedisPoolInstance() {
		if (null == jedisPool) {
			synchronized (JedisPoolUtil.class) {
				if (null == jedisPool) {
					GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
					poolConfig.setMaxTotal(1000);
					poolConfig.setMaxIdle(32);
					poolConfig.setMaxWaitMillis(100 * 1000);
					poolConfig.setTestOnBorrow(true);
					jedisPool = new JedisPool(poolConfig, "192.168.190.135", 6379);
				}
			}
		}
		return jedisPool;
	}

	public static void release(JedisPool jedisPool, Jedis jedis) {
		if (null != jedis) {
			jedisPool.returnResourceObject(jedis);
		}
	}

}
