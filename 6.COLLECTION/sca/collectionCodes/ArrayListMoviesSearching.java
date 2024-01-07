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
public class ArrayListMoviesSearching {
    public static void main(String[] args) {
        List<String>moviesList=new ArrayList<>(5);
        Scanner kb=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter movies name: ");
            String movieName=kb.nextLine();
            movieName=movieName.toUpperCase();
            moviesList.add(movieName);
        }
        System.out.println("Enter movie name to search: ");
        String searchMovie=kb.nextLine();
        searchMovie=searchMovie.toUpperCase(); 
        int index=moviesList.indexOf(searchMovie);
        if(index==-1){
            System.out.println(searchMovie+" is not FOUND! in the top 5 movies");
        }else{
            System.out.println(searchMovie+" is at RANK -> "+(1+index));
        }
        
    }
    
}
