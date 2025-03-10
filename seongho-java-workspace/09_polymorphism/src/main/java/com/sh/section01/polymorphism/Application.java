package com.sh.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        System.out.println("부모타입 레퍼런스로 부모인스턴스 관리");
        Parent p1 =new Parent( );
        p1.printParent();

        System.out.println("자식타입 레퍼런스 자식인스턴스 관리");
        Child1 c1 = new Child1();
        c1.printParent(); c1.printChild1();
        // c1 레퍼런스로 ch1 ,pa 둘다 접근 가능

        System.out.println("3. 부모타입 레퍼런스로 자식인스턴스 관리(다형성");
        Parent p2 = new Child1();
        ((Child1)p2).printChild1();
        /*
        UpCasting
        -자식이 부모타입(상위)으로 형변환
        자동형변환
        )자식.부모메소드();
         부모=자식 인스턴스;

         DownCasting
         부모타입이 자식타입으로 형변환
         강제형변환(명시적)
         -((자식)부모).자식메소드()
         */
        System.out.println("======================================");

        /*
            다형성
            1.polymorphism
            하나의 타입으로 여러 인스턴스를 가질 수 있는 것
            따라서 메소드 호출로 인스턴스별로 각기 다른 방법으로 동작 가능
            다형성 장점
            1 여러 타입의 객체를 하나의 타입으로 관리하므로 유지보수성,생산성 향상
            2.상속을 기반한 기술이므로 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 이씅ㅁ
            동일한 메세지를 수신해도 객체별로 다르게 처리 가능
            ㄴ관리할 메세지의 종류 줄어듦
            3 확장성이 좋은 코드를 작성 가능
            결합성 낮춰 유지보수성 증가
         */

        //child1객체 2개와 child2객체 2개 관리
        Child1[] arr1 = new Child1[2];
        arr1[0] =new Child1(1,2,4);
        arr1[1] =new Child1(2,3,5);

        Child2[] arr2 = new Child2[2];
        arr2[0] =new Child2(2,1,5);
        arr2[1] =new Child2(5,7,2);

        //다형성 적용 후
        Parent[] arr = new Parent[4];
        arr[0] =new Child1(1,2,4);
        arr[1]=new Child2(2,1,5);
        arr[2]=new Child2(5,7,2);
        arr[3]=new Child1(2,3,5);
        //다형성 장점1 여러 타입의 객체를 하나의 타입으로 관리 가능

        ((Child1)arr[0]).printChild1();
        ((Child2)arr[1]).printChild2();
        //((Child1)arr2[2]).printChild1();//ClassCastException
        ((Child2)arr[2]).printChild2();
        ((Child1)arr[3]).printChild1();
        System.out.println("========================================");
        for (int i = 0; i<arr.length;i++){
            /*if (i==0||i==3){
                ((Child1)arr[i]).printChild1();
            }else {
                ((Child2)arr[i]).printChild2();
            }
                        instanceof ##연산자
            레퍼런스변수가 참조하는 실제 인스턴스 타입이 특정 클래스 타입과 일치하는지
            비교해주는 연산자
         */
            if (arr[i] instanceof Child1){
                ((Child1)arr[i]).printChild1();
            }else {
                ((Child2)arr[i]).printChild2();
            }

        }
        System.out.println("====================================");

        for (int i = 0; i<arr.length;i++){
            /* 동적 바인딩

            컴파일 당시에는 해당 래퍼런스타입의 메소드와 연결되어 있다가(정적바인딩
            런타임 당시 실제 인스턴스가 가지는 오버라이딩된 메소드로 바인딩이 바뀌어 동작
             */
            arr[i].print();
        }

        /*
        다형성 장점2 모든 인스턴스에 동일한 메세지를 수신하도록 진행
        ㄴ단 각 인스턴스별로 다르게 처리 가능
        ㄴ각 인스턴스마다의 메소드를 따로 관리할 필요 없이 하나의 메소드만 관리
         */
    }
}
