package com.loancalculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền vay: ");
        double money = scanner.nextDouble();
        System.out.print("Nhập số tháng vay: ");
        int month = scanner.nextInt();
        System.out.print("Nhập lãi suất vay: ");
        double rate = scanner.nextDouble();

        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * (rate / 1200) * month;
        }

        System.out.printf("Tổng số tiền lãi trong %d là %.2f", month, total_interset);
//        System.out.printf("Total of interset: " + total_interset);

    }
}
