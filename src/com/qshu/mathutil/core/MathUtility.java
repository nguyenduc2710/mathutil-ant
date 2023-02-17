/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qshu.mathutil.core;

/**
 *
 * @author thaiq
 */
public class MathUtility {
    
    public static final double PI =3.1415;
    
    //Ham tinh n giai thua
    //quy uoc n! = 1*2*3*...*n
    //trong do 0! = 1! = 1
    //khong co giai thua so 0
    //ham khong tinh giai thua am neu dua so am ! throw exeption
    //ham khong tinh giai thua qua to (> 21) vi kieu Long chi co toi da 18 con so 0 ma 21! thi lon hon 18 so 0
    //QC phai kiem tra xem ham co hanh su dung nhu thiet ke hay khong , thu nghiem cac tinh huong xay ra test case
    //
    public static long getFactorial(int n){
        
        if(n < 0 || n > 21){
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        }
        
        if(n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}
