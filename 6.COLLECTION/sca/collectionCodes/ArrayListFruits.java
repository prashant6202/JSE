/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectionCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArrayListFruits {
    public static void main(String[] args) {
        List<String>fruitsList=new ArrayList<>(5);
        Scanner kb=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter fruit name: ");
            String fruitName=kb.nextLine();
            fruitName=fruitName.toUpperCase();
            fruitsList.add(fruitName);
        }
        System.out.println("Enter fruit name to be remove");
        String removeFruit=kb.nextLine();
        removeFruit=removeFruit.toUpperCase();
        System.out.println("************Before removing fruit**********");
        for(String name:fruitsList){
            System.out.println(name);
        }
        System.out.println("********After removing fruit************");
        if(fruitsList.remove(removeFruit)){
        for(String name:fruitsList){
            System.out.println(name);
        }
        }
        else{
            System.out.println("Fruit not FOUND!");
        }
    }
    
}
