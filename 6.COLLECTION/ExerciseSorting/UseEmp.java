/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class UseEmp {
    public static void main(String[] args) {
        List<Emp>empList=new ArrayList<>();
        Emp e1=new Emp(20,"Prashant",900000);
        Emp e2=new Emp(21,"Karuna",800000);
        Emp e3=new Emp(25,"Raja",600000);
        Emp e4=new Emp(23,"Pankaj",700000);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        for(Emp e:empList){
            System.out.println(e);
        }
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter age,name and salary of the employee to remove ");
        int age=kb.nextInt();
        String name=kb.next();       
        double sal=kb.nextDouble();
        Emp x=new Emp(age,name,sal);
        boolean result=empList.remove(x);
        if(result){
         System.out.println("Employee removed...");       
        }
       else{
            System.out.println("Employee not FOUND!"); 
        }
        System.out.println("*************After removing Employee from company***********");
        for(Emp e:empList){
            System.out.println(e);
        }
       Collections.sort(empList);
        System.out.println("**************After Sorting***********");
       for(Emp e:empList)
        {
            System.out.println(e);
        }
    }
}
