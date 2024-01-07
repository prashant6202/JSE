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
public class ArrayListRemove {
    public static void main(String[] args) {
    List<Integer>numbersList=new ArrayList<>();
    numbersList.add(1);
    numbersList.add(2);
    numbersList.add(3);
    numbersList.add(4);
    numbersList.add(5);
    numbersList.add(6);
    numbersList.add(7);
        System.out.println("*********Before removing********");
    for(int number:numbersList){
        System.out.println(number);
    }
        System.out.println("************After removing index************");
        numbersList.remove(1);
        for(int number:numbersList){
            System.out.println(number);
                }
      
    
    }
    
}
