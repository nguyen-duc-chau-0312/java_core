package Bai2;

import java.util.Scanner;

public class Bai2 {
    /*
    2. Viết chương trình cho phép nhập vào một số nguyên (từ 0 - 11) và kiểm tra năm đó là năm con gì.
    Với dữ liệu cho sẵn như sau:

    0. Tý

    1. Sửu

    2. Dần

    3. Mão

    4. Thìn

    5. Tỵ

    6. Ngọ

    7. Mùi

    8. Thân

    9. Dậu

    10. Tuất

    11. Hợi
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap nam can kiem tra: ");
        int n = scanner.nextInt();
        if (n >= 0 && n <= 11) {
            switch (n) {
                case 0:
                    System.out.println("Ty'");
                    break;
                case 1:
                    System.out.println("Suu");
                    break;
                case 2:
                    System.out.println("Dan");
                    break;
                case 3:
                    System.out.println("Mao");
                    break;
                case 4:
                    System.out.println("Thin");
                    break;
                case 5:
                    System.out.println("Ty.");
                    break;
                case 6:
                    System.out.println("Ngo");
                    break;
                case 7:
                    System.out.println("Mui");
                    break;
                case 8:
                    System.out.println("Than");
                    break;
                case 9:
                    System.out.println("Dau");
                    break;
                case 10:
                    System.out.println("Tuat");
                    break;
                case 11:
                    System.out.println("Hoi");
                    break;
                default:
                    System.out.println("Khong hop le!");

            }
        } else {
            System.out.println("Ban nhap gia tri khong hop le \n Chi chap nhan gia tri tu (0 - 11)");
        }
    }
}
