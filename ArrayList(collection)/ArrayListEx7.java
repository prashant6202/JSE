/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectioncodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SCALive
 */
public class ArrayListEx7 {
    public static void main(String[] args) {
        List <String>movieList=new ArrayList<>(5);
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter movie name:");
            String name=kb.nextLine();
            name=name.toUpperCase();
            movieList.add(name);
        }
        System.out.println("Enter mpvie name to search:");
        String searchMovie=kb.nextLine();
        searchMovie=searchMovie.toUpperCase();
        int index=movieList.indexOf(searchMovie);
        if(index==-1){
            System.out.println(searchMovie +" not found in top 5 movies");
        }else{
            System.out.println(searchMovie +" is at rank "+(index+1));
        }
        
        
    }
    
}
