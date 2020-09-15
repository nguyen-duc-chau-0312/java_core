package Bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        /*
        4.  Viết chương trình cho phép đọc nhập từ bàn phím độ dài 3 cạnh của một tam giác và
            tính chu vi nếu độ dài 3 cạnh là hợp lệ. Độ dài 3 cạnh tam giác là hợp lệ nếu tổng độ
            dài 2 cạnh bất kỳ lớn hơn cạnh còn lại.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a cua tam giac: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh b cua tam giac: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap canh c cua tam giac: ");
        double c = scanner.nextDouble();
        double result;

        if ((a+b > c) && (a+c > b) && (b+c > a)){
            result = a + b + c;
            System.out.println("Chu vi cua tam giac = " + result);
        }else{
            System.out.println("Day khong phai ba canh cua tam giac, Moi ban nhap lai \n Tong chieu dai 2 canh phai lon hon canh con lai!");
        }
    }
}
