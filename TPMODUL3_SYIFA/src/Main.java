import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant resto = new Restaurant();
            int customer_ID, order_Qty;
            try{

                System.out.println("Enter Customer ID:");
                customer_ID = input.nextInt();

                System.out.println("Enter how much food to made : ");
                order_Qty = input.nextInt();

                Thread t1 = new Thread(resto);
                Waiters waiters = new Waiters(order_Qty, customer_ID);
                Thread t2 = new Thread(waiters);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            }catch(Exception e){
                System.out.println("Input must be integer");
            }
        }

    }

}