/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetLibraryExercies;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Book {
    private String booknName;
    private String authorName;
    private double price;

    public Book(String booknName, String authorName, double price) {
        this.booknName = booknName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.booknName);
        hash = 59 * hash + Objects.hashCode(this.authorName);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.booknName, other.booknName)) {
            return false;
        }
        if (!Objects.equals(this.authorName, other.authorName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "booknName=" + booknName + ", authorName=" + authorName + ", price=" + price + '}';
    }
    
    
    
}
