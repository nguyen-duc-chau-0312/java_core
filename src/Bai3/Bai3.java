package Bai3;

import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        /*
        3. Viết chương trình sinh ra một số ngẫu nhiên (từ 1 - 12) và in ra tháng tương
            ứng với số đó (ví dụ 1 thì in ra "tháng một", 2 thì in ra "tháng hai")
         */
        Random rd = new Random();
        int number = rd.nextInt(12) + 1;
        System.out.println(number);
        switch (number){
            case 1:
                System.out.println("Thang mot");
                break;
            case 2:
                System.out.println("Thang hai");
                break;
            case 3:
                System.out.println("Thang ba");
                break;
            case 4:
                System.out.println("Thang bon");
                break;
            case 5:
                System.out.println("Thang nam");
                break;
            case 6:
                System.out.println("Thang sau");
                break;
            case 7:
                System.out.println("Thang bay");
                break;
            case 8:
                System.out.println("Thang tam");
                break;
            case 9:
                System.out.println("Thang chin");
                break;
            case 10:
                System.out.println("Thang muoi");
                break;
            case 11:
                System.out.println("Thang muoi mot");
                break;
            case 12:
                System.out.println("Thang muoi hai");
                break;
            default:
                System.out.println("Khong co thang nao > 12 && < 1");
        }


    }
}
