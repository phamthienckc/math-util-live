/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author BAO THIEN
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);//hàm tính đi coi là mấy 
        System.out.println(" expected 5! = 120; actual: " + result);
      
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        
        //MathUtil.getFactorial(-5);//ném ngoại lệ thật rồi, ai biểu đưa cà chớn chi !!!
        
        //Thêm code sau lần đầu đưa code lên server 6:27 24/10/2024
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));
        
        //kĩ thuật kiểm thử phần mềm: Ước lượng xem giá trị trả về của hàm là gì
        //Expected value: 5! =120
        //mày/hàm ai đ1o viết khi chạy thực tế là mấy - actual, giả sử 120
        //if expected == actual, hàm đúng theo mục tiêu ban đầu
    }
    
}
