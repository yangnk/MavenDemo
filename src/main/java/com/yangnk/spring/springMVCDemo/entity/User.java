package com.yangnk.spring.springMVCDemo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * java类简单作用描述
 *
 * @ProjectName: SpingDemo
 * @Package: com.yangnk.spring.springMVCDemo.entity
 * @ClassName: ${TYPE_NAME}
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2018/5/9 下午6:04
 * @UpdateUser:
 * @UpdateDate: 2018/5/9 下午6:04
 * @UpdateRemark: The modified content
 * @Version: <p>Copyright: Copyright (c) 2018</p>
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id; // id
    private String name; // name
    private String pwd; // pwd

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    private Integer age; // age
    private Date creatTime; // creatTime
}
