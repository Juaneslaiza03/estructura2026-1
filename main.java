import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0;
        System.out.println("Ingrese la dimension de la Celda");
        n=sc.nextInt();
        ObjVehiculo[][] M= new ObjVehiculo[n][n];
        Metodos c= new Metodos();
        M= c.LlenarMatriz(M);
        M= c.Calcularprecio(M);
        c.MostrarCeldas(M);
    }
}
