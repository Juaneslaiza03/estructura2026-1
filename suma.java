import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0;
        System.out.println("ingrese n1:");
        n1 = sc.nextInt();
        System.out.println("ingrese n2");
        n2 = sc.nextInt();
        n3 = n1 + n2;
        System.out.println("el total es:" + n3);

    }
}
