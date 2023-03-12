/**
 *
 * @Author Cxrdary
 * @Version 1.0
 *
 */

import java.util.Scanner;

public class MyMath {
public static void gcf() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your first number?");
    int a = scanner.nextInt();
    System.out.println("What is your second number?");
    int b = scanner.nextInt();
    int c = 0;
    while (b != 0){
        if (a > b) {
            c = b;
            b = a % b;
            a = c;
        } else {
            b = b % a;
        }
    }
    System.out.println(c);
}
    public static void main(String[] args) {
    gcf();
    }
}
