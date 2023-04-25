import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        String name = new String("Rohan");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2));
        System.out.println(name.charAt(3));
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

    }
}
