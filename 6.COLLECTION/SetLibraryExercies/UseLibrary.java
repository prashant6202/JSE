/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetLibraryExercies;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author HP
 */
public class UseLibrary {
    public static void main(String[] args) {
       Library lib=new Library();
       Book b1=new Book("Mastering c","Srivastava",450.0);
       Book b2=new Book("Mastering c++","Mathhew",650.0);
       Book b3=new Book("Learning Java","Karlson",350.0);
       Book b4=new Book("Mastering c","Srivastava",450.0);
       System.out.println("b1 added ? "+lib.addBook(b1));
       System.out.println("b2 added ? "+lib.addBook(b2));
       System.out.println("b3 added ? "+lib.addBook(b3));
       System.out.println("b4 added ? "+lib.addBook(b4));
       System.out.println("Total book in LIBRARY :"+lib.getBookCount());
       Set<Book>mySet=lib.getAllBooks();
       Iterator<Book>it=mySet.iterator();
       while(it.hasNext()){
       Book b=it.next();
           System.out.println(b);
       
       }
       
        
    }
    
}
