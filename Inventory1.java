package HW3;
//inventory 1 items always sort with bubble sort
public class Inventory1 extends Inventory {
    // this inventory child uses sort for BubbleSort
    public Inventory1(){
        sorting = new BubbleSort();
    }
}
