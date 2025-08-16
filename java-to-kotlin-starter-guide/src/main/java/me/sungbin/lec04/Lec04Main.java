package me.sungbin.lec04;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney javaMoney1 = new JavaMoney(2_000L);
        JavaMoney javaMoney2 = new JavaMoney(1_000L);

        if (javaMoney1.compareTo(javaMoney2) > 0) {
            System.out.println("Money1이 Money2보다 큽니다.");
        }

        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = money1;
        JavaMoney money3 = new JavaMoney(1_000L);

        System.out.println(money1 == money2);
        System.out.println(money1 == money3);
        System.out.println(money1.equals(money3));

        System.out.println(javaMoney1.plus(javaMoney2));
    }
}
