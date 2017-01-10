public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService hello = new CivilService();
        hello.work();
       
        //System.out.println(hello.getDaysLeft());
       MilitaryService bye = new MilitaryService(300);
       bye.work();
       // System.out.println(bye.getDaysLeft());
        
    }
}
