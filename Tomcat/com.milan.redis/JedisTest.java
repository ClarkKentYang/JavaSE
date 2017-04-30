import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("192.168.203.131",6379);
		String username = jedis.get("username");
		System.out.println(username);

	}
	/**
	 * 使用jedis的连接池
	 */
	@Test
	public void test2(){
		//创建池子的配置对象
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(100);//最大闲置个数
		config.setMaxTotal(100);//最大连接数
		
		//创建连接池
		JedisPool pool = new JedisPool(config,"192.168.203.131",6379);
		
		//获取连接池的连接资源
		Jedis jedis = pool.getResource();
		
		String username = jedis.get("username");
		System.out.println(username);
		
		jedis.close();
		pool.close();
		
	}
	
}
