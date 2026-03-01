import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, quantity;
        double total = 0;

        do {
            System.out.println("\n---- Food Menu ----");
            System.out.println("1. Pizza - ₹200");
            System.out.println("2. Burger - ₹100");
            System.out.println("3. Juice - ₹50");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += quantity * 200;
                    break;
                case 2:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += quantity * 100;
                    break;
                case 3:
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    total += quantity * 50;
                    break;
                case 4:
                    System.out.println("Thank you for ordering!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 4);

        System.out.println("Your Total Bill: ₹" + total);
        sc.close();
    }
}