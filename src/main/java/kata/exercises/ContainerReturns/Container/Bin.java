package kata.exercises.ContainerReturns.Container;

/**
 * Created by djp4830 on 8/10/17.
 */
public class Bin {

    private int capacity;



    private int itemCount;
    private int rejectCount;
    private String acceptableShape;
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getAcceptableShape() {
        return acceptableShape;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getRejectCount() {
        return rejectCount;
    }

    public Bin(String shape, int maxItems) {
        capacity = maxItems;
        itemCount = 0;
        rejectCount = 0;
        acceptableShape = shape;
    }

    public boolean isBinFull() {
        return itemCount >= capacity;
    }

    public boolean acceptItem(Container item) {
        //is appropriate shape
        if (acceptableShape.equals(item.getShape()) == false) {
            return false;
        }

        //is bin not full
        if (isBinFull()) {
            rejectCount++;
            System.out.println(ANSI_RED + "\t" + item.getShape() + " item REJECTED! New rejected item count " + rejectCount + ANSI_RESET);
            return false;
        }

        //is item empty
        if (item.isEmpty() == false) {
            return false;
        }

        itemCount++;
        System.out.println(ANSI_GREEN + "\t" + item.getShape() + "item accepted! New item count " + itemCount + " Capacity: " + capacity + ANSI_RESET);
        return true;
    }

    public String toString() {
        return ("acceptableShape = " + acceptableShape);
    }

}
