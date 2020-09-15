package Bai6;

import java.util.Random;

public class Bai6 {
    public static void main(String[] args) {
        /*
        6. Viết chương trình mô phỏng việc lấy ngẫu nhiên một lá bài từ bộ bài 52 lá và
            chương trình phải hiển thị lá bài đó là lá bài gì. Ví dụ đầu ra của chương trình như sau:

             "Lá bài bạn vừa rút ra là Q cơ"
         */
        Random rd = new Random();
        int number = rd.nextInt(52) + 1;
        System.out.println(number);
        switch (number){
            // 1-13: Quân tép
            case 1:
                System.out.println("Lá bạn vừa rút ra là quân 1 Tép ");
                break;
            case 2:
                System.out.println("Lá bạn vừa rút ra là quân 2 Tép ");
                break;
            case 3:
                System.out.println("Lá bạn vừa rút ra là quân 3 Tép ");
                break;
            case 4:
                System.out.println("Lá bạn vừa rút ra là quân 4 Tép ");
                break;
            case 5:
                System.out.println("Lá bạn vừa rút ra là quân 5 Tép ");
                break;
            case 6:
                System.out.println("Lá bạn vừa rút ra là quân 6 Tép ");
                break;
            case 7:
                System.out.println("Lá bạn vừa rút ra là quân 7 Tép ");
                break;
            case 8:
                System.out.println("Lá bạn vừa rút ra là quân 8 Tép ");
                break;
            case 9:
                System.out.println("Lá bạn vừa rút ra là quân 9 Tép ");
                break;
            case 10:
                System.out.println("Lá bạn vừa rút ra là quân 10 Tép ");
                break;
            case 11:
                System.out.println("Lá bạn vừa rút ra là quân J Tép ");
                break;
            case 12:
                System.out.println("Lá bạn vừa rút ra là quân Q Tép ");
                break;
            case 13:
                System.out.println("Lá bạn vừa rút ra là quân K Tép ");
                break;

            // 14-26: Quân rô
            case 14:
                System.out.println("Lá bạn vừa rút ra là quân 1 Rô");
                break;
            case 15:
                System.out.println("Lá bạn vừa rút ra là quân 2 Rô");
                break;
            case 16:
                System.out.println("Lá bạn vừa rút ra là quân 3 Rô");
                break;
            case 17:
                System.out.println("Lá bạn vừa rút ra là quân 4 Rô ");
                break;
            case 18:
                System.out.println("Lá bạn vừa rút ra là quân 5 Rô");
                break;
            case 19:
                System.out.println("Lá bạn vừa rút ra là quân 6 Rô");
                break;
            case 20:
                System.out.println("Lá bạn vừa rút ra là quân 7 Rô");
                break;
            case 21:
                System.out.println("Lá bạn vừa rút ra là quân 8 Rô");
                break;
            case 22:
                System.out.println("Lá bạn vừa rút ra là quân 9 Rô");
                break;
            case 23:
                System.out.println("Lá bạn vừa rút ra là quân 10 Rô");
                break;
            case 24:
                System.out.println("Lá bạn vừa rút ra là quân J Rô");
                break;
            case 25:
                System.out.println("Lá bạn vừa rút ra là quân Q Rô");
                break;
            case 26:
                System.out.println("Lá bạn vừa rút ra là quân K Rô");
                break;

            // 27-39: Quân cơ
            case 27:
                System.out.println("Lá bạn vừa rút ra là quân 1 Cơ");
                break;
            case 28:
                System.out.println("Lá bạn vừa rút ra là quân 2 Cơ");
                break;
            case 29:
                System.out.println("Lá bạn vừa rút ra là quân 3 Cơ");
                break;
            case 30:
                System.out.println("Lá bạn vừa rút ra là quân 4 Cơ");
                break;
            case 31:
                System.out.println("Lá bạn vừa rút ra là quân 5 Cơ");
                break;
            case 32:
                System.out.println("Lá bạn vừa rút ra là quân 6 Cơ");
                break;
            case 33:
                System.out.println("Lá bạn vừa rút ra là quân 7 Cơ");
                break;
            case 34:
                System.out.println("Lá bạn vừa rút ra là quân 8 Cơ");
                break;
            case 35:
                System.out.println("Lá bạn vừa rút ra là quân 9 Cơ");
                break;
            case 36:
                System.out.println("Lá bạn vừa rút ra là quân 10 Cơ");
                break;
            case 37:
                System.out.println("Lá bạn vừa rút ra là quân J Cơ");
                break;
            case 38:
                System.out.println("Lá bạn vừa rút ra là quân Q Cơ");
                break;
            case 39:
                System.out.println("Lá bạn vừa rút ra là quân K Cơ");
                break;

            // 40- 52: Quân bích
            case 40:
                System.out.println("Lá bạn vừa rút ra là quân 1 Bích");
                break;
            case 41:
                System.out.println("Lá bạn vừa rút ra là quân 2 Bích");
                break;
            case 42:
                System.out.println("Lá bạn vừa rút ra là quân 3 Bích");
                break;
            case 43:
                System.out.println("Lá bạn vừa rút ra là quân 4 Bích");
                break;
            case 44:
                System.out.println("Lá bạn vừa rút ra là quân 5 Bích");
                break;
            case 45:
                System.out.println("Lá bạn vừa rút ra là quân 6 Bích");
                break;
            case 46:
                System.out.println("Lá bạn vừa rút ra là quân 7 Bích");
                break;
            case 47:
                System.out.println("Lá bạn vừa rút ra là quân 8 Bích");
                break;
            case 48:
                System.out.println("Lá bạn vừa rút ra là quân 9 Bích");
                break;
            case 49:
                System.out.println("Lá bạn vừa rút ra là quân 10 Bích");
                break;
            case 50:
                System.out.println("Lá bạn vừa rút ra là quân J Bích");
                break;
            case 51:
                System.out.println("Lá bạn vừa rút ra là quân Q Bích");
                break;
            case 52:
                System.out.println("Lá bạn vừa rút ra là quân K Bích");
                break;

        }
    }
}
