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
public class SetEx1 {
    public static void main(String[] args) {
        Set<String>mySet=new HashSet<>();
        System.out.println(mySet.add("Prashant"));  
        mySet.add("Rahul");
        mySet.add("Karuna");
        mySet.add("Raja yadav");
        System.out.println( mySet.add("Prashant")); 
       Iterator<String>it=mySet.iterator();
   while(it.hasNext()){
       String str=it.next();
       System.out.println(str);
       
   }
    }
}
