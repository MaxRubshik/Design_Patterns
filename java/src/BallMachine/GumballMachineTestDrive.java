package src.BallMachine;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException {
//        int count = 0;
//
//        if(args.length < 2) {
//            System.out.println("Gumball Machine <name> <inventory>");
//            System.exit(1);
//        }

        //count = Integer.parseInt(args[1]);
        //GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMachine gumballMachine = new GumballMachine("Boston",5);
        System.out.println(gumballMachine);


        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
        System.out.println();

        gumballMachine.insertQuarter();
        monitor.report();
        System.out.println();

        gumballMachine.turnCrank();
        monitor.report();



//        GumballMachine gumballMachine = new GumballMachine(5);
//        gumballMachine.refill(10);
//
//        System.out.println(gumballMachine);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
    }
}
