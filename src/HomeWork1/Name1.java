package HomeWork1;
import java.util.Objects;
import java.util.Scanner;
public class Name1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("как вас зовут?: ");

        String a = name.nextLine();


        if ((Objects.equals(a,"Вася")) || (Objects.equals(a,"Анастасия"))) {
            if (Objects.equals(a,"Вася")) {
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждал");
            }else{
                System.out.println("Я так долго тебя ждал");
            }
        }else{

            System.out.println("Добрый день, а вы кто?");
            System.out.print("как вас зовут?: ");

            String b = name.nextLine();
            System.out.print("Привет!Приятно познакомиться, "+b);

        }
    }

}
