package Principal;

//Importaciones de las clases
import Clases.Empleado;
import Clases.Lider;
import Clases.MaquilaSoftware;
import Clases.Programador;
import java.util.Scanner;

/**
 *
 * @author febre
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String nombre;
        String lenguaje;
        double sueldo;
        int experi;
        boolean salir = false;
        int al = 0;

        MaquilaSoftware objMaquila = new MaquilaSoftware("Microsoft");

        while (salir == false) {

            System.out.println("INGRESAR PROGRAMADORES:");

            System.out.println("Ingrese su nombre: ");
            nombre = sr.next();

            sr.nextLine();
            System.out.println("Ingrese lenguaje de programacion: ");
            lenguaje = sr.next();

            System.out.println("Ingrese su sueldo: ");
            sueldo = sr.nextDouble();

            Programador objPro = new Programador(nombre, sueldo, lenguaje);

            //Otro objeto de Programadores
            System.out.println("OTRO PROGRAMADOR");
            System.out.println("Ingrese su nombre: ");
            nombre = sr.next();

            sr.nextLine();
            System.out.println("Ingrese lenguaje de programacion: ");
            lenguaje = sr.next();

            System.out.println("Ingrese su sueldo: ");
            sueldo = sr.nextDouble();

            Programador objPro2 = new Programador(nombre, sueldo, lenguaje);

            System.out.println("AGREGAR EL LIDER");

            System.out.println("Ingrese su nombre: ");
            nombre = sr.next();

            sr.nextLine();
            System.out.println("Ingrese lenguaje de programacion: ");
            lenguaje = sr.next();

            System.out.println("Ingrese su sueldo: ");
            sueldo = sr.nextDouble();

            Lider objLider = new Lider(nombre, sueldo, lenguaje);

            objLider.agregarProgramadores(objLider);
            objMaquila.AddProgramador(objLider);

            System.out.println("Desea salir \n[1]Si\n[2]No");
            al = sr.nextInt();

            if (al == 1) {
                salir = true;
                System.out.println("PROGRAMADORES");

                //Mustra de toString
                System.out.println(objPro.toString());
                //Guarda el toString en el archivo
                objMaquila.registarArchivo(objPro.toString());

                System.out.println(objPro2.toString());
                objMaquila.registarArchivo(objPro2.toString());
                System.out.println(" ");

                System.out.println(objMaquila.MostrarStaff());
                System.out.println(objLider.toStringFinal());
                objMaquila.registarArchivo(objLider.toStringFinal());

            } else {
                salir = false;
            }

        }

    }

}
