package redis.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-25 下午5:56
 **/
public class RedisMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        RedisUtil redisUtil = (RedisUtil) applicationContext.getBean("redisUtil");
        redisUtil.set("city", "beijing0626");
    }
}
