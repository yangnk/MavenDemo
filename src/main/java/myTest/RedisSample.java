package myTest;

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
//        System.out.println(jedis.ping());
        jedis.set("1", "beijing");
        System.out.println(jedis.get("1"));
    }
}

//import redis.clients.jedis.Jedis;
//
//public class RedisJava {
//    public static void main(String[] args) {
//        //连接本地的 Redis 服务
//        Jedis jedis = new Jedis("localhost");
//        System.out.println("连接成功");
//        //查看服务是否运行
//        System.out.println("服务正在运行: "+jedis.ping());
//    }
//}