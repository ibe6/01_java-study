package com.younggalee.section01.generic;

/*
    ## 제네릭 ##
    1. 클래스 내부에 사용할 타입을 클래스 외부에서 지정하는 기법
    2. 클래스 선언부 마지막에 다이아몬드 연산자를 이용하여 작성
       > 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성
         Ex ) T (Type), K (Key),V (Value), E (Element) : 제네릭 타입 매개변수
    3. 해당 클래스를 사용 및 호출하는 곳에서 타입을 작성하게 됨. : 타입이 결정되어서 반영
    4. 유의사항 : 타입 지정시 레퍼런스(Object) 타입만 가능 (기본자료형 제시 불가)
 */



// 여러 객체(Object)를 담을 수 있는 그릇
public class Container<T> {
    // 다양한 타입의 값을 변수에 담고 싶을때
    private T item; // T 타입의 item을 가질 수 있는 필드

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String toString(){
        return String.valueOf(item);  // 다양한 타입의 데이터를 문자열(String)로 변환할 때 사용
    }
}
