package cn.ksdshpx.pjfinal.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @author peng.x
 * @date 2018年11月11日 下午6:11:16
 */
public class TestTx {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.190.135", 6379);
		Transaction transaction = jedis.multi();
		transaction.set("k4", "v44");
		transaction.set("k5", "v55");
		//transaction.exec();
		transaction.discard();
	}
}
