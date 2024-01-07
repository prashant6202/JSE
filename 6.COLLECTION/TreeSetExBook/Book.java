/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSetExBook;

/**
 *
 * @author HP
 */
public class Book implements Comparable<Book>{
   private String bookName;
   private String authorName;
   private Double price;
    public Book(String bookName, String authorName, Double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
   public String toString() {
     return "Book{" + "bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + '}';
  }
    

   
    public int compareTo(Book t) {
        
     return this.price.compareTo(t.price);
    
    }
    
    
}
