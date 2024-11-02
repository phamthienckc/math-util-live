/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author BAO THIEN
 */
//TA viết cái CLASS để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài. Đó là lúc ta ko cần nhớ cái gì
// cho riêng ta, Hàm STATIC giúp làm điều này
public class MathUtil {
    // n! = 1.2.3.4.5.6 ...n
    //Qui ước : 0! = 1
    //Ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! là kiểu long
    //Nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính được
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument .n must be between 0...20");
            //hàm dừng liền ko cần return
        //xuống đến đây n = 0..20 òi    
        if ( n == 0 || n == 1)
            return 1; // dừng ngay khi n đặc biệt
        //xuống đến đây, n = 2 ..20 òi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con đất, ốc bu dồn thịt
        // i = 2, i = 3, i = 4, i = n nhồi liên tục cái i vào tích
        long product = 10; //tích khởi đầu = 1, nhồi 2, 3, 4, 5, ..n
        for (int i = 2; i <= n; i++) {
            product *= i ;
            //product = product * i; //nhồi liên tục product
            //nhân từ 2 đến n
        }
        return product;    
    }
    
}
