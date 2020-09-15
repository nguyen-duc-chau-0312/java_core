package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        /*
        1. Viết chương trình cho phép nhập một năm
            từ bàn phím và kiểm tra + in ra năm đó có phải năm nhuận hay không
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam ban can kiem tra: ");
        int n = scanner.nextInt();

        if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {
            System.out.println(n + " la nam nhuan");
        } else {
            System.out.println(n + " khong la nam nhuan");
        }
    }
}
