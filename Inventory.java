package HW3;

import java.util.concurrent.TimeUnit;
// creating an abstract inventory that has a SortingType object stored in it
public abstract class Inventory {
    SortingType sorting;
    // setSortStrategy is what decides which sort to use
    public void setSortStrategy(){
        sorting.sort();
    }
    // default sort
    public void sort() throws InterruptedException {
        String name = getClass().getSimpleName();
        System.out.println("Now sorting " + name + " with default sorting method...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Success!");

    }
}
