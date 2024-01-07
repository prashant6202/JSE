/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author HP
 */
public class UseStudentHashSet {
    public static void main(String[] args) {
       Set<Student>hs=new HashSet<>(); 
       Student s1=new Student("Amit");
       Student s2=new Student("Sumit");
       Student s3=new Student("Amit");
       hs.add(s1);
       hs.add(s2);
       hs.add(s3);
        System.out.println("Student are :"+hs.size());
        System.out.println("Hascode of s1 is "+s1.hashCode());
        System.out.println("Hascode of s2 is "+s2.hashCode());
        System.out.println("Hascode of s3 is "+s3.hashCode());
      System.out.println(hs);      //if we print all data by refrence than we must overrite toString() method.
      System.out.println("******************Display STUDENT name in vetical order**********");
      Iterator<Student>it=hs.iterator();
      while(it.hasNext()){
        Student s=it.next();
          System.out.println(s);
      }
    }
    
}
