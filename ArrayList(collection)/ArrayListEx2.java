/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectioncodes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCALive
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        List<String>monthsList=new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
       String s1=monthsList.get(0);
        System.out.println(s1);
       String s2=monthsList.get(1);
        System.out.println(s2);
       String s3=monthsList.get(2);
        System.out.println(s3);
         
       
        
    }
}
