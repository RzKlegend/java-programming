/*Create a Library Book Management program where the book ISBN is declared
as final and cannot be changed once assigned. Display the book's 
ISBN, title, author, and price. */

public class bookmanagement {
    
    // First we declare the ISBN book as final
    final int isbn;

    String title;
    String author;
    int price;

    // Constructor to declare the final variable
    public bookmanagement(int isbn, String title, String author, int price){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void display(){
        System.out.println("ISBN " + isbn);
        System.out.println("Title of the Book:- " + title);
        System.out.println("Author name:- " + author);
        System.out.println("Price of the book:- " + price);
    }

    public static void main(String[] args) {
        
        // Creating new  book object
        bookmanagement myBook = new bookmanagement(900901001, "Chamber of Secrets", "JK Rowling", 899);

        // Displaying the book details
        System.out.println("--Library Book Details");
        myBook.display();
    }
}
