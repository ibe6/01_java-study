package com.minkook.practice2.run;

import com.minkook.practice2.dto.Circle;
import com.minkook.practice2.dto.Point;
import com.minkook.practice2.dto.Rectangle;

public class Application{
    public static void main(String[] args) {


        // 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
        // 위의 사용 데이터를 참고하여 각각 초기화
        Circle [] circles = new Circle[2];
        circles[0] = new Circle(1,2,3);
        circles[1] = new Circle(3,3,4);

        Rectangle [] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(-1,-2,5,2);
        rectangles[1] = new Rectangle(-2,5,2,8);

        System.out.println("===== circle =====");
        for(Circle c : circles){
            c.draw();
        }

        System.out.println("===== rectangle =====");
        for(Rectangle r : rectangles){
            r.draw();
        }






        // 각 도형의 draw 메소드 실행	    		 --> 향상된 for문 이용해서
    }
}
