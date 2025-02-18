package com.jjanggu.section07.objectarray.run;

import com.jjanggu.section07.objectarray.dto.Book;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Application2 {
    public static void main(String[] args) {

        /*
            ## 3개의 도서를 관리하는 프로그램 ##


            * 시스템 요구사항
            1. 도서 등록시 사용자로붙 도서 정보를 입력받기
            2. 도서 조회 시 전체 도서에 대한 정보 출력
            3. 도서 검색 시 사용자가 입력한 도서명과 일치하는 도서 조회하여 출력
         */

        Book[] books = new Book[3];

        // 등록 서비스 =========================================
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < books.length; i++){
            System.out.println("Enter title: ");
            String title = sc.nextLine();
            System.out.println("Enter author: ");
            String author = sc.nextLine();
            System.out.println("Enter publisher: ");
            String publisher = sc.nextLine();
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();


            // 각 인덱스별 인스턴스 생성
            books[i] = new Book(title, author, publisher, price);
        }

        // 조회 서비스 ===========================================
        /*
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i].getInformation());
        }
         */
        for(Book bk : books){
            System.out.println(bk.getInformation());
        }

        // 검색 서비스 ==========================================
        System.out.println("검색할 책 제목: ");
        String search = sc.nextLine();

        for(int i = 0; i<books.length; i++){
            if(books[i].getTitle().equals(search)){
                System.out.println(books[i].getInformation());
            }
        }


    }
}
