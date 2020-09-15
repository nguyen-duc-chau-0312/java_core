package Bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        /*
        5. Viết chương trình cho phép nhập từ bàn phím một điểm có toạ độ (x, y)
            và kiểm tra xem điểm đó có nằm trong hay nằm ngoài hình chữ nhật có tâm tại (0, 0)
            và có độ dài là 10 và có chiều rộng là 5.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhap toa do y: ");
        double y = scanner.nextDouble();

        if ((-5 <= x && x <= 5) && (-2.5 <= y && y <= 2.5)) {
            System.out.println("Toa do " + "(" + x + " ," + y + ")" + " nam trong hinh chu nhat co tam tai (0,0)");
        } else {
            System.out.println("Toa do " + "(" + x + "," + y + ")" + " khong nam trong hinh chu nhat co tam tai (0,0)");
        }
    }
}
