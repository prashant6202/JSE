/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectionCodes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ArrayListSearching {
    public static void main(String[] args) {
        List<String>monthsList=new ArrayList<>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        System.out.println("*************Before Searching************** ");
    for(String month:monthsList){
        System.out.println(month);
    }
        System.out.println("****************After Searching********************");
        System.out.println("Is March is present :"+monthsList.contains("March"));
        System.out.println("Is January is present :"+monthsList.contains("January"));
        System.out.println("Is may is present :"+monthsList.contains("may"));
        System.out.println("Is December is present :"+monthsList.contains("December"));



       
        
        
    }
    
    
}

