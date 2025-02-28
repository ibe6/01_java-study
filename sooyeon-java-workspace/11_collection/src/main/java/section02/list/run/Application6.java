package section02.list.run;

import java.util.Stack;

public class Application6 {
    public static void main(String[] args) {
        /**
         * ## Stack
         * 1. Vector 클래스를 상속받음
         * 2. 선형 메모리 공간에 데이터를 저장
         *      후입선출 LIFO - Last Input First Out
         *
         * ㅁ
         * ㅁ -> ㅁ +
         * ㅁ    ㅁ   ㅁ
         */

        Stack<Integer> intStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        System.out.println(intStack.size());

        System.out.println(intStack.search(1));
        System.out.println(intStack.peek());

        intStack.pop();
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
    }

}
