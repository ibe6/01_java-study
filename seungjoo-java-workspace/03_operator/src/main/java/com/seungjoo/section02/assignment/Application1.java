package com.seungjoo.section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        
    
    /*
    ##복합 대입 연산자
    1. 산술연산자와 대입연산자가 결합되어 있는 형태
    2. 연산처리 속도가 빨라지므로 사용하는걸 권장
    3. 종류
        1) +=
        2) -=
        3) *=
        4) /=
        5) %=
     */

        int num = 12;

        System.out.println("num = " + num);
        
        num = num + 3;
        System.out.println("num = " + num);
        
        num += 3;
        System.out.println("num = " + num);
        
        num -= 5;
        System.out.println("num = " + num);
        
        num *= 6;
        System.out.println("num = " + num);
        
        num %= 4;
        System.out.println("num = " + num);
        
        String str = "Hello";
        
        str += "World";
        System.out.println("str = " + str);
                
    }
    
}
