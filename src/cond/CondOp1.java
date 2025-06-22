package cond;

public class CondOp1 {

    public static void main(String[] args) {
        int age = 18;
        String states;
        if (age >= 18) {
            states = "성인";
        } else {
            states = "미성년자";
        }
        System.out.println("age = " + age + " states = " + states);
    }
}
