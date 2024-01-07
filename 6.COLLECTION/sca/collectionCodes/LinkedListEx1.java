/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectionCodes;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author HP
 */
public class LinkedListEx1 {
    public static void main(String[] args) {
        List<String>monthList=new LinkedList<>();
        System.out.println("January is added ?"+monthList.add("January"));
        System.out.println("February is added ?"+monthList.add("February"));
        System.out.println("March is added ?"+monthList.add("March"));
        System.out.println("April is added ?"+monthList.add("April"));
       for(int i=0;i<monthList.size();i++){
           System.out.println(monthList.get(i));
       }
    }
}
