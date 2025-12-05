import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class VetReception {
    public static void main (String [] args ){
        Queue<String> queue = new LinkedList<>();
        boolean running = true ;
        Scanner scanner = new Scanner(System.in);
        while(running) {
            System.out.println("Vet Reception Menu: ");
            System.out.println("Press 1 to view the patients who have arrived. ");
            System.out.println("Press 2 if you would like to print out a list of patients waiting.");
            System.out.println("Press 3 if you would like to see which patient is to be called next");
            System.out.println("Press 4 to clear a patient from the list, who has been seen by a vet.");
            System.out.println("Press 5 to to exit the app.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    queue.offer("Patient1");
                    queue.offer("Patient2");
                    queue.offer("Patient3");
                    queue.offer("Patient4");
                    System.out.println("Current list of patients arrived: " + queue);
                    break;
                case 2:
                    System.out.println("Current list of patients waiting: " + queue);
                    break;
                case 3:
                    String head = queue.peek();
                    System.out.println("Patient who is next to be visited: " + head);
                    break;
                case 4:
                    String removed = queue.poll();
                    System.out.println(removed);
                    System.out.println(queue);
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1–5.");
            }
        }
        scanner.close();
    }
}
