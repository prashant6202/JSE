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
public class ArrayListIndexOf {
    public static void main(String[] args) {
        List<String>monthsList=new ArrayList<>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        System.out.println("index of March is :"+monthsList.indexOf("March"));
        System.out.println("Position of March is :"+(1+monthsList.indexOf("March")));
    }
    
}
