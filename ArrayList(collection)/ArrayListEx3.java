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
public class ArrayListEx3 {
    public static void main(String[] args) {
         List<String>monthsList=new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        for(int i=0;i<=monthsList.size()-1;i++){
            String str=monthsList.get(i);
            System.out.println(str);
        }
    }
    
}
