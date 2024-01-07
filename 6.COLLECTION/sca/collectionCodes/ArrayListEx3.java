//Printing Arraylist data using for loop and for-each loop
package sca.collectionCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx3 {
    public static void main(String[] args) {
       List <String> monthsList=new ArrayList<>();
       monthsList.add("January");
       monthsList.add("Februrary");
       monthsList.add("March");
        for (int i = 0; i < monthsList.size(); i++) {
            System.out.println(monthsList.get(i));    
        }
        for(String month:monthsList){
            System.out.println(month);
        }
       
    }
    
}
