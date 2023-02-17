/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.qshu.mathutil.main;

import com.qshu.mathutil.core.MathUtility;

/**
 *
 * @author thaiq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnWell();
        
    }
    //Quy tac dat ten ham cho kiem thu phan mem;
    //Cu phap con lac da camelCase Notation
    //Ten ham mang y nghia muc dich
    public static void testFactorialGivenRightArgumentReturnWell(){
        //Test case 1: Tinh Huong Xai ham so 1
        //Expected value: 1
        //kiem thu ham voi 1 tuc la tinh 1! coi gia tri co tra ve 1 hay khong
        int n= 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "! expected: " + expectedValue + " | actual: " + actualValue );
        
        
        //Test case 2: test ham with n = 1;
        //Expected value: 1
        //Kiem tra tin huong xai ham 1! coi co tra ve 1 hay khong
        
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
         System.out.println("Test " + n + "! expected: " + expectedValue + " | actual: " + actualValue );
         
         //Test case 3: test ham with n = 2;
        //Expected value: 2
        //Kiem tra tin huong xai ham 2! coi co tra ve 2 hay khong
        
         System.out.println("Test 2! expected: 2 " + " | actual: " + MathUtility.getFactorial(2));
        
         
         //Test case 3: test ham with n = 5;
        //Expected value: 120
        //Kiem tra tin huong xai ham 2! coi co tra ve 2 hay khong
        
         System.out.println("Test 5! expected: 120 " + " | actual: " + MathUtility.getFactorial(5));
    }
}
