/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca.collectioncodes.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SCALive
 */
public class UseEmp {
    public static void main(String[] args) {
        List <Emp> empList=new ArrayList<>();
        Emp e1=new Emp(23,"Alok",45000.0);
        Emp e2=new Emp(28,"Neeraj",55000.0);
        Emp e3=new Emp(26,"Deepak",32000.0);
        Emp e4=new Emp(24,"Sumit",65000.0);
        
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        System.out.println("Before sorting");
        for(Emp e:empList){
            System.out.println(e);
        }
//        Scanner kb=new Scanner(System.in);
//        System.out.println("Enter age,name and sal of the emp to be rem");
//        int age=kb.nextInt();
//        String name=kb.next();
//        double sal=kb.nextDouble();
//        
//        Emp x=new Emp(age,name,sal);
//        boolean result=empList.remove(x);
//        if(result){
//            System.out.println("Emp removed!");
//        }else{
//        System.out.println("Emp not found");
//    }
       Collections.sort(empList);
       System.out.println("After sorting");
        for(Emp e:empList){
            System.out.println(e);
        }
        
        
    }
    
}
