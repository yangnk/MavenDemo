package com.yangnk.spring.springDIDemo;

/**
 * ${helloworld bean类}
 *
 * @author yangningkai
 * @create 2018-09-16 下午4:00
 **/
public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = "your message:" + message;
    }
}
