package Ch6;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("산술연산 프로그램입니다.");
        System.out.println("계산하고자하는 숫자와 연산자를 입력하면 계산해드립니다.");
        System.out.printf("(숫자 연산자 숫자)를 입력하세요:");

        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();

        calculator c = new calculator(num1, num2);
        c.calc(op);
    }
}

class calculator {
    int n1;
    int n2;
    int result;

    public calculator(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    void calc (String op){
        switch(op) {
            case "+":
                System.out.printf("%d %s %d = %d", n1, op, n2, n1+n2);
                break;
            case "-":
                System.out.printf("%d %s %d = %d", n1, op, n2, n1-n2);
                break;
            case "*":
                System.out.printf("%d %s %d = %d", n1, op, n2, n1*n2);
                break;
            case "/" :
                System.out.printf("%d %s %d = %d", n1, op, n2, n1*n2);
                break;
            default:
                System.out.printf("%d %s %d = %d", n1, op, n2, n1%n2);
                break;

        }
    }


}