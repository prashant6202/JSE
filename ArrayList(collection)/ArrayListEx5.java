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
public class ArrayListEx5 {
    public static void main(String[] args) {
        List<String>monthsList=new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        System.out.println("Is Jan present ?"+monthsList.contains("Jan"));
        System.out.println("Is May present ?"+monthsList.contains("May"));
        System.out.println("Is feb present ?"+monthsList.contains("feb")); 
    }
    
}
