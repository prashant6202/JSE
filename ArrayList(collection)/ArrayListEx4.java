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
public class ArrayListEx4 {
    public static void main(String[] args) {
         List<String>monthsList=new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        for(String month:monthsList){
            System.out.println(month);
        }
    }
    
}
