package com.jun.section02.abstract_extends;

public abstract class Sports {
    private int people;

    public Sports(){}

    public Sports(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public abstract void rule();// 형태를 가지지 못한 메소드를 추상메소드라 함
    /*
        ## 추상메소드 ##
        1. abstract method
        2. 형태를 갖추지 못한 메소드 (본문이 정의되어 있지 않은 메소드)
           즉, 본문이 필요 없는 메소드를 추상메소드로 정의하면 됨
        3. 본문을 작성하는 {}을 없애고 abstract 예약어를 붙여 정의
        4. 추상메소드 포함하고 있는 클래스는 반드시 추상클래스로 정의해야됨


     */



}
