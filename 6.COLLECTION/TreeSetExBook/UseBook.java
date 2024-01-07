/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSetExBook;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class UseBook {
    public static void main(String[] args) {
        Set<Book>myBooks=new TreeSet<>();
        Book b1 =new Book("Let Us C","Kanetkar",340.0);
        Book b2 =new Book("Master in C++","Prashant",654.0);
        Book b3 =new Book("Programming in Java","Karuna",720.0);
        Book b4 =new Book("Pythan","Sachin",540.0);
       myBooks.add(b1);
       myBooks.add(b2);
       myBooks.add(b3);
       myBooks.add(b4);
       Iterator<Book>it=myBooks.iterator();
       while(it.hasNext()){
           Book b=it.next();
           System.out.println(b);
       }
       

       
                     
       
            
    }
    
}
