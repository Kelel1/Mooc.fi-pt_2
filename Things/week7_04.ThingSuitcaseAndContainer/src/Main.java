
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        int kg = 1;
        Thing thing = new Thing("Brick", kg);
        Suitcase suitcase = new Suitcase(100);        
        int i = 100;
        while(i > 0){
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
            i--;
            kg++;
        }
        
    }
    }


