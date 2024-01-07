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
public class ArrayListEx2 {
    public static void main(String[] args) {
        List <String> monthsList=new ArrayList<>();
        monthsList.add("janary");
        monthsList.add("february");
        monthsList.add("March");
        String s1=monthsList.get(0);
        String s2=monthsList.get(1);
        String s3=monthsList.get(2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);                 
        }
           
    }

