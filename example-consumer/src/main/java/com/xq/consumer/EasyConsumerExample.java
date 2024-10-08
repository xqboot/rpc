package com.xq.consumer;

import com.xq.common.mode.User;
import com.xq.common.service.UserService;
import com.xq.core.proxy.ServiceProxyFactory;

/**
 * @author xq
 * @create 2024/8/5 10:39
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // todo 需要获取 UserService 实现类对象
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("tom");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null){
            System.out.println(newUser.getName());
        }else {
            System.out.println("user = null");
        }
    }
}
