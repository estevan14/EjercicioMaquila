package Clases;

//Importaciones de clases
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author febre
 */
public class MaquilaSoftware {

    //Creacion de varible y lista
    private String strNombre;
    java.util.ArrayList lstStaff;

    //Constructor
    public MaquilaSoftware(String strNombre) {
        this.strNombre = strNombre;
        lstStaff = new ArrayList();
    }

    //Agrega a la lista el objeto prograador
    public void AddProgramador(Programador objP) {
        lstStaff.add(objP);
    }

    //Muestra los que estan en el Staff
    public String MostrarStaff() {
        String mostar = "";
        Iterator i = lstStaff.iterator();
        while (i.hasNext()) {
            //Crea el objeto
            Programador objP = (Programador) i.next();
            mostar = "Lider " + mostar + objP.toString();

        }
        return mostar;
    }

    //Metodo calcular alario
    public int getSalarioMensual() {
        //Creando variables
        int intTotal = 0;
        //Objeto iterador
        Iterator itr = lstStaff.iterator();
        while (itr.hasNext()) {
            //Creamos el objeto
            Programador objProgramador = (Programador) itr.next();
            intTotal += objProgramador.getSalario2();
        }
        return intTotal;

    }
    //Metodo para crear archivo y guardar
     public void registarArchivo(String guardar) {
        try {
            //Manejar  Objetos
            File crear = new File("ARCHIVO.txt");
            FileWriter escribir;
            BufferedWriter escribir2;
            if (crear.exists()) {
                escribir = new FileWriter(crear, true);
                escribir2 = new BufferedWriter(escribir);
                escribir2.newLine();
                escribir2.write(guardar);

            } else {
                escribir = new FileWriter(crear);
                escribir2 = new BufferedWriter(escribir);
                escribir2.write(guardar);
            }

            //Cierre de archivos
            escribir2.close();
            escribir.close();

        } catch (Exception e) {
        }

    }

}
