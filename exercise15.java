import java.util.Scanner;

public class exercise15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Number: ");
            String number = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(number, description, quantity, price);
        }

        System.out.println("\nInvoice Amounts:");

        for (int i = 0; i < invoices.length; i++) {
            double amount = invoices[i].getQuantity() * invoices[i].getPrice();
            System.out.println("Invoice " + (i + 1) + ": " + amount);
        }

        scanner.close();
    }
}