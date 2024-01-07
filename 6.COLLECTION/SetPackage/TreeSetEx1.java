/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<String>st=new TreeSet<>();
        st.add("A");
        st.add("D");
        st.add("C");
        st.add("F");
        st.add("J");
        st.add("K");
        st.add("L");
        System.out.println(st);
        System.out.println("*******************Using Iterator**********************");
        Iterator<String>it=st.iterator();
        while(it.hasNext()){
        String s=it.next();
            System.out.println(s);
        }
               
    }
    
}
