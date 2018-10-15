package org.spring.springboot.base.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by mongoding on 2016/4/18.
 * java RMI 的局限性是只能在java环境使用，另外依赖ip/port
 */
public class Server {

    public static void main(String[] args) throws Exception {
        UserService userService = new UserServiceImpl();
        LocateRegistry.createRegistry(8899);
        Naming.rebind("rmi://127.0.0.1:8899/userService", userService);
    }
}
