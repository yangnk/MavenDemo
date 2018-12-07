package redis;

import redis.clients.jedis.Jedis;
/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-14 下午9:45
 **/
public class RedisSample {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("city", "beijing");
        System.out.println(jedis.get("city"));
    }
}
