package HW3;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//inventory 1 sorts with bubble sort, 2 sorts with quicksort, and 3 sorts with insertion sort
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        // creating various types of inventories
        Inventory type1 = new Inventory1();
        Inventory type2 = new Inventory2();
        Inventory type3 = new Inventory3();

        System.out.println("Welcome! sorting all inventories with a default sort...");
        // this is just stylistic and makes the program feel more alive
        type1.sort();
        TimeUnit.SECONDS.sleep(1);
        type2.sort();
        TimeUnit.SECONDS.sleep(1);
        type3.sort();
        TimeUnit.SECONDS.sleep(1);


        System.out.println("All inventories sorted, would you like to sort a different way?");
        System.out.println("Choose between 1 and 3 for the specialized sorting methods, or 4 to exit");
        System.out.println("1. Bubblesort");
        System.out.println("2. Quicksort");
        System.out.println("3. Insertion sort");
        System.out.println("4. Exit Program");

        Scanner userInput = new Scanner(System.in);

        int userChoice = userInput.nextInt();
        // based on what the user chooses, this will determine which setSortStrategy to use
        if (userChoice == 1){
            type1.setSortStrategy();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Success!");
        }
        else if (userChoice == 2){
            type2.setSortStrategy();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Success!");
        }
        else if (userChoice == 3){
            type3.setSortStrategy();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Success!");
        }
        else{
            System.out.println("Thank you!");
            return;
        }
        // this section is for reverting back to the original default sort
        System.out.println("Would you like to revert to the default sorting method?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner userInput2 = new Scanner(System.in);
        int userChoice2 = userInput2.nextInt();

        if (userChoice2 == 1){
            if (userChoice == 1){
                type1.sort();
            }
            else if (userChoice == 2){
                type2.sort();
            }
            else if (userChoice == 3){
                type3.sort();
            }
        }
        else{
            System.out.println("Thank you");
        }

    }

}
