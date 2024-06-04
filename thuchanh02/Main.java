package btsession03.thuchanh02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println(student);
        Student student1 = new Student("MSV002","Quang","Nam","HN240408",27,"Hà Nội");
        System.out.println(student1);

    }
}
