public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        System.out.println(book1.toString());   
        
    }   
    
    public static class Book {
    
        String title = "";
        String author = "";
        int yearPublished = 0;
        double price= 0;

        public Book(String title, String author, int yearPublished, double price){
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }

        @Override
        public String toString() {
        return "Title: \"" + title + "\"\n"
             + "Author: \"" + author + "\"\n"
             + "Year Published: " + yearPublished + "\n"
             + "Price: $" + price;
        }
        
    }
}

