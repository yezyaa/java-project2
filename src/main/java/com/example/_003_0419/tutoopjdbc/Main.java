package com.example._003_0419.tutoopjdbc;

public class Main {
    public static void main(String[] args) {
//        printCheckLeapYear();
        game369();
    }

    private static void game369() {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.print(cnt);
            int a = cnt / 10;
            int b = cnt % 10;
            if (a % 3 == 0 && a != 0) {
                System.out.print("*");
            }
            if (b % 3 == 0 && b != 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printCheckLeapYear() {
        int i = 1700;
        if (checkLeapYear(i)) {
            System.out.println(i + "년 : 윤년");
        } else {
            System.out.println(i + "년 : 평년");
        }
    }

    public static boolean checkLeapYear(int year) {
        // 윤년 알아맞추기
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static String is369(int cnt) {
        String str = "";
        int a = cnt / 10;
        int b = cnt % 10;
        if (a % 3 == 0 && a != 0) {
            str += "*";
        }
        if (b % 3 == 0 && b != 0) {
            str += "*";
        }
        return str;
    }
}
