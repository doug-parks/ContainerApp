package kata.exercises.ContainerReturns.Container;

import java.util.ArrayList;

/**
 * Created by djp4830 on 8/15/17.
 */
public class Receiver {


    public static void main(String[] args) {

        ArrayList<Bin> bins = new ArrayList<>();  //creates an ArrayList for storing bins
        ArrayList<Container> containers = new ArrayList<>();  //creates an ArrayList for storing containers

        bins.add(new Bin("round", 5));
        bins.add(new Bin("square", 5));
        bins.add(new Bin("triangle", 5));


        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("round", true));
        containers.add(new Container("square", true));
        containers.add(new Container("square", true));
        containers.add(new Container("square", true));
        containers.add(new Container("square", true));
        containers.add(new Container("square", true));
        containers.add(new Container("triangle", true));
        containers.add(new Container("triangle", true));
        containers.add(new Container("triangle", true));

        System.out.println("Beginning sorting process: \n");

        //loop each container through each bin
        for (int x = 0; x < containers.size(); x++) {
            for (int y = 0; y < bins.size(); y++) {
                System.out.print("Parsing container # " + x + " (" + containers.get(x).getShape() + ") bin # " +
                        y + "(" + bins.get(y).getAcceptableShape() + ")\n");
                //send container to the bin for accept/reject
                bins.get(y).acceptItem(containers.get(x));
            }
        }

        System.out.println("\nSorting process complete. Here's the status of the bins: ");

        for (int y = 0; y < bins.size(); y++) {
            System.out.print("\t" + bins.get(y).getAcceptableShape() + " bin has " + bins.get(y).getItemCount() +
                    " accepted and " + bins.get(y).getRejectCount() + " rejected \n");

        }

    }
}