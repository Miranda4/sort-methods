import java.util.Arrays;
import java.util.Scanner;


public class SortUI {

    private Scanner scanner;
    private Sort sort;

    public SortUI(Sort sort){
        this.sort = sort;
        scanner = new Scanner(System.in);
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public void start(){
        boolean running = true;
        while(running){
            System.out.println("--Chose sort method");
            System.out.println("1-. Bubble sort");
            System.out.println("7-. Exit");
            int choice = scanner.nextInt();
            clearScreen();
            switch(choice){
                case 1:
                    System.out.println(Arrays.toString(sort.bubbleSort(new int[]{3,2,1})));
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option :C");
                    break;
            }
        }
    }
}
