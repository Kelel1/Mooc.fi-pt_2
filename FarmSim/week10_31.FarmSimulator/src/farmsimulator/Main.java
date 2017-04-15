package farmsimulator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Test your program here
//        Cow cow = new Cow();
//System.out.println(cow);
//
//
//Alive livingCow = cow;
//livingCow.liveHour();
//livingCow.liveHour();
//livingCow.liveHour();
//livingCow.liveHour();
//
//System.out.println(cow);
//
//Milkable milkingCow = cow;
//milkingCow.milk();
//
//System.out.println(cow);
//System.out.println("");
//
//cow = new Cow("Ammu");
//System.out.println(cow);
//cow.liveHour();
//cow.liveHour();
//System.out.println(cow);
//cow.milk();
//System.out.println(cow);
        
        
//  MilkingRobot r = new MilkingRobot();
//r.setBulkTank( new BulkTank(100.0) );
//Cow cow = new Cow();
//cow.liveHour();
//
//r.milk(cow);
//        System.out.println(cow.getAmount());
//        
//        Barn barn = new Barn(new BulkTank());
//System.out.println("Barn: " + barn);
//
//MilkingRobot robot = new MilkingRobot();
//barn.installMilkingRobot(robot);
//
//Cow ammu = new Cow();
//ammu.liveHour();
//ammu.liveHour();
//
//barn.takeCareOf(ammu);
//System.out.println("Barn: " + barn);
//
//LinkedList<Cow> cowList = new LinkedList<Cow>();
//cowList.add(ammu);
//cowList.add(new Cow());
//
//for(Cow cow: cowList) {
//    cow.liveHour();
//    cow.liveHour();
//}
//
//barn.takeCareOf(cowList);
//System.out.println("Barn: " + barn);
        
       Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());


        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);

    }
}
