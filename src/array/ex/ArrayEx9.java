package array.ex;

import java.util.Scanner;

public class ArrayEx9 {

    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productsNames = new String[maxProducts];
        int[] productsPrice = new int[maxProducts];
        int productsCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1.상품 등록 | 2.상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1) {
                if (productsCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품의 이름을 입력하세요:");
                productsNames[productsCount] = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요:");
                productsPrice[productsCount] = scanner.nextInt();

                productsCount++;
            }
            else if (menu == 2) {
                if (productsCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productsCount; i++) {
                    System.out.println((i+1) + ". " +  productsNames[i] + ": " + productsPrice[i] + "원");
                }
            }
            else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
