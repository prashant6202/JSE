/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetLibraryExercies;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
public class Library {
    private Set<Book>bookSet=new HashSet<>();
    public boolean addBook(Book b){
    return bookSet.add(b);
    }
    public int getBookCount(){
    return bookSet.size();
    }
    public Set<Book> getAllBooks(){
    return bookSet;
    }
}
