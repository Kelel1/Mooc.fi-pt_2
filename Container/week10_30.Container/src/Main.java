import containers.ProductContainer;
import containers.ContainerHistory;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        ContainerHistory mh = new ContainerHistory();
            mh.add(2.0);
            mh.add(5.0);
            mh.add(10.0);
            mh.add(12.0);
            mh.add(8.0);
            mh.add(14.0);
            mh.add(11.0);
            mh.add(10.0);
            mh.add(-2.0);
            mh.add(-3.0);
            mh.add(7.0);
            mh.add(7.0);
            mh.add(-3.0);
            System.out.println(mh.greatestFluctuation());
 // the well known way:
//ProductContainerRecorder mtv = new ProductContainerRecorder("kahvi", 10, 2);
//mtv.addToTheContainer(4);
//mtv.takeFromTheContainer(2);
//mtv.printAnalysis();

            //2.0, -3.0, 1.0, 15.0, 11.0, 2.0, 7.0, 5.0, -4.0
           // 2.0, 5.0, 10.0, 12.0, 8.0, 14.0, 11.0, 10.0, -2.0, -3.0, 7.0, 7.0, -3.0]
    }

}
