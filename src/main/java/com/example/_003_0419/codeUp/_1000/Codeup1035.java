package com.example._003_0419.codeUp._1000;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        int num = Integer.parseInt(val, 16);
        System.out.printf("%o", num);
    }
}
