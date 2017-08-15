package kata.exercises.ContainerReturns.Container;
import java.lang.IllegalArgumentException;

/**
 * Created by djp4830 on 8/9/17.
 */
public class Container {

    private String shape;
    private boolean empty;

    //Constructor
    public Container(String containerShape, boolean containerIsEmpty){

        if (containerShape == null){
            throw new IllegalArgumentException("A container shape must be declared");
        }

        if (containerShape.isEmpty()){
            throw new IllegalArgumentException("A container shape can not be blank");
        }

        shape = containerShape;
        empty = containerIsEmpty;

    }

    public String getShape(){
        return shape;
    }

    public boolean isEmpty(){
        return empty;
    }

//    public String toString(){
//        return ("shape = " + shape);

}
