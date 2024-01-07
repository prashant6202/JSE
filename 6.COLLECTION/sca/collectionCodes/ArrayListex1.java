//printing ArrayList data by refrence when refrence is passing in println() method than java called toString() method
package sca.collectionCodes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ArrayListex1 {
    public static void main(String[] args) {
        List<String>monthsList=new ArrayList<>();
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        System.out.println(monthsList);  
    }
    
}
