package junitDemo;

import org.apache.log4j.Logger;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-25 下午10:06
 **/
public class Calculator {
    private static Logger logger = Logger.getLogger(Calculator.class);

    public int sum(int a) {
        logger.error("123");
        return (1 + a) * a / 2;
    }
}
