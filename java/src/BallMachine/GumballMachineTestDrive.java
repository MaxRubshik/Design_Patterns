package src.BallMachine;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {

//        GumballMachine gumballMachine = new GumballMachine("Boston", 5);
//        System.out.println(gumballMachine);
//
//
//        GumballMonitor monitor = new GumballMonitor(gumballMachine);
//        monitor.report();
//        System.out.println();
//
//        gumballMachine.insertQuarter();
//        monitor.report();
//        System.out.println();
//
//        gumballMachine.turnCrank();
//        monitor.report();

        GumballMachineRemote gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
