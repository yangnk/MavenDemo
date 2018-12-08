package com.yangnk.spring.springMVCDemo.controller;

import com.yangnk.spring.springMVCDemo.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * java类简单作用描述
 *
 * @ProjectName: SpingDemo
 * @Package: com.yangnk.spring.springMVCDemo.controller
 * @ClassName: ${TYPE_NAME}
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2018/5/9 下午6:04
 * @UpdateUser:
 * @UpdateDate: 2018/5/9 下午6:04
 * @UpdateRemark: The modified content
 * @Version: <p>Copyright: Copyright (c) 2018</p>
 */
public class UserController {
    @RequestMapping(value = "/")
    public String save() {
        return "save";
    }

    @RequestMapping(value = "save", method = POST)
    public String save(@ModelAttribute("form") User user, Model model) {
        model.addAttribute("user", user);
        return "detail";
    }
}
