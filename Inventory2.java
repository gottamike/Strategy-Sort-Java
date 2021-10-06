package HW3;
//inventory 2 items always sort with quicksort
public class Inventory2 extends Inventory {
    // this inventory child uses sort for QuickSort
    public Inventory2(){
        sorting = new QuickSort();
    }
}

