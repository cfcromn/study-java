package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        //전이 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가 시키고 , 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감 연산자 사용 예
        a = 1; //a의 값을 다시 1로 지정
        b = 0; //b의 값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a의 값을 증가 시킴
        System.out.println("a = " + a + ", b = " + b); //결과: a = 2, b = 1
    }
}
