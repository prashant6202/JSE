/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectioncodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author SCALive
 */
public class ArrayListEx10 {
    public static void main(String[] args) {
         List<Integer>marksList=new ArrayList<>();
        marksList.add(45);
        marksList.add(35);
        marksList.add(80);
        marksList.add(26);
        Collections.sort(marksList);
        
        for(Integer m:marksList){
            System.out.println(m);
        }
    }
    
}
