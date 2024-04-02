import java.util.Scanner;

class Publisher {
    protected String publisherName;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    protected String bookTitle;
    protected double price;

    public Book(String publisherName, String bookTitle, double price) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: $" + price);
    }
}

class Literature extends Book {
    public Literature(String publisherName, String bookTitle, double price) {
        super(publisherName, bookTitle, price);
    }
}

class Fiction extends Book {
    public Fiction(String publisherName, String bookTitle, double price) {
        super(publisherName, bookTitle, price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the category of the book (Literature/Fiction): ");
        String category = scanner.nextLine();

        if (category.equalsIgnoreCase("Literature")) {
            System.out.print("Enter Publisher Name: ");
            String publisherName = scanner.nextLine();
            System.out.print("Enter Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            Literature literature = new Literature(publisherName, bookTitle, price);
            literature.displayDetails();
        } else if (category.equalsIgnoreCase("Fiction")) {
            System.out.print("Enter Publisher Name: ");
            String publisherName = scanner.nextLine();
            System.out.print("Enter Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            Fiction fiction = new Fiction(publisherName, bookTitle, price);
            fiction.displayDetails();
        } else {
            System.out.println("Invalid category entered.");
        }

        scanner.close();
    }
}
