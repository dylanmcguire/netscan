package test;

import status.checker.NetScanner;
import status.checker.StatusChecker;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: mcgui230
 * Date: 4/25/14
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestDriver {

    public static void main(String[] args) {
        if(args[0].equals("Remote")) {
            StatusChecker statusChecker = new testStatusChecker();
            String gatewayIP = args[1];
            NetScanner netScanner = new NetScanner(gatewayIP, statusChecker);
            Thread thread = new Thread(netScanner);
            thread.start();
        }
        else {
            try {
                new DummyServer().run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
