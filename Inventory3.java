package HW3;
//inventory 3 items always sort with insertion sort
public class Inventory3 extends Inventory {
    // this inventory child uses sort for InsertionSort
    public Inventory3(){
        sorting = new InsertionSort();
    }
}
