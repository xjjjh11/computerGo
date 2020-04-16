package com.computerGo.controller;

import com.computerGo.pojo.Identity;
import com.computerGo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author Jared
 * @Data 2020/4/16 8:31
 */
@Slf4j
@Controller
public class UserController {

    @Autowired
    UserService userService;
    /**
     * 添加收货地址
     * @param address 地址信息
     * @return
     */
    @GetMapping(value = "addAddress")
    public String addDeliveryAddress(Identity address, HttpSession session){
        //获取登录信息中的uid
//        int uid = (int)session.getAttribute("uid");
        //把uid放入收货地址关联用户
        /*------------1是测试数据-----------------------*/
        address.setUid(1);
        //把收货地址存入session中
        session.setAttribute("address",address);
        int i = userService.insDeliveryAddress(address);
        if (i>0){
            log.info("收货地址填写成功");
            log.info("收货地址信息："+address);
            return "myAddress";
        }else {
            log.info("收货地址填写失败");
            return "error";
        }
    }

    @GetMapping(value = "delAddress")
    @ResponseBody
    public String delAddress(HttpSession session){
        //取出收货地址信息
        Identity address = (Identity) session.getAttribute("address");
        int i = userService.delAddressByUid(address);
        if (i>0){
            log.info("成功删除收货地址");
            return "deleteSuccess";
        }else{
            log.info("没有删除收货地址……");
            return "delError";
        }
    }

    /**
     * 显示收货地址
     * @return
     */
    @GetMapping(value = "showAddress")
    @ResponseBody
    public String showAddress(HttpSession session){
        //获取uid
//        int uid = (int) session.getAttribute("uid");
        /*---------1是测试数据------------*/
        int uid = 1;
        List<Identity> address = userService.selAddressByUid(uid);
        //把地址信息放入session中，方便前端调用
        session.setAttribute("address",address);
        if (address!=null){
            log.info("显示收货地址："+address);
            return "showSuccess";
        }else {
            return "showError";
        }
    }
}
