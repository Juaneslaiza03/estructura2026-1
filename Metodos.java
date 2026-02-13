
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjVehiculo[][] LlenarMatriz(ObjVehiculo[][] M) {
        int ncelda=1;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {

                ObjVehiculo o = new ObjVehiculo();

                System.out.println("Ingrese la marca del Vehiculo");
                o.setMarca(sc.next());

                System.out.println("Ingrese el tipo de Vehiculo");
                o.setTipo(sc.next());

                System.out.println("Ingrese el cilindraje del Vehiculo");
                o.setCilindraje(sc.nextInt());

                if (o.getCilindraje() > 1000 && o.getCilindraje() < 1600) {
                    o.setPagoAnt(150.000);

                } else if (o.getCilindraje() >= 1600 && o.getCilindraje() < 2000) {

                    o.setPagoAnt(200.000);

                } else {
                    o.setPagoAnt(250.000);
                }
                o.setNumCelda(ncelda);
                ncelda++;
                M[i][j] = o;
            }

        }

        return M;

    }

    public ObjVehiculo[][] Calcularprecio(ObjVehiculo[][]m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setPagoAct(m[i][j].getPagoAnt()*1.23);

            }
        }

        return m;
    }

    public void MostrarCeldas(ObjVehiculo[][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Marca: "+m[i][j].getMarca());
                System.out.println("Tipo: "+m[i][j].getTipo());
                System.out.println("Cilindraje: "+m[i][j].getCilindraje());
                System.out.println("Pago Anterior: "+m[i][j].getPagoAnt());
                System.out.println("Pago Actual: "+m[i][j].getPagoAct());
                System.out.println("Numero Celda: "+m[i][j].getNumCelda());
                System.out.println("------------------------------------");
                


            }
        }
    }

    

}
