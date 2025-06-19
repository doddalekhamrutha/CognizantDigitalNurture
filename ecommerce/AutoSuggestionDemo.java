package ecommerce;

import java.util.List;
import java.util.Scanner;

public class AutoSuggestionDemo {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- E-Commerce Search Auto-Suggestion ----");
        while (true) {
            System.out.print("\nEnter search keyword (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting search...");
                break;
            }

            List<String> suggestions = catalog.search(input);

            if (suggestions.isEmpty()) {
                System.out.println("No products found for: " + input);
            } else {
                System.out.println("Suggestions:");
                for (String suggestion : suggestions) {
                    System.out.println("- " + suggestion);
                }
            }
        }
        scanner.close();
    }
}

