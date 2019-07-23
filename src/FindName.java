import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String name = "Вячеслав";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        if(scan.hasNext(name)){
            System.out.println("Привет, "+name);
        }
    }
}

