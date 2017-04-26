package Clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author febre, atiencia
 */
public class Lider extends Programador {

    //Creacion de una lista
    java.util.ArrayList lstEquipo;

    //Llamada del costructor 
    public Lider(String strNombre, double dblSalario, String strLenguaje) {
        super(strNombre, dblSalario, strLenguaje);
        lstEquipo = new ArrayList();

    }

    //Metodo para aumentar salario
    public double getSalario3() {
        //Variables de bono
        double dblSalarioMensual = super.getSalario2();
        double dblBono = 0;
        //Numero de programadores que hay en la lista
        int NumProgramadores = lstEquipo.size();
        
        dblBono = (NumProgramadores * 0.1 * dblSalarioMensual);
        return dblSalarioMensual + dblBono;

    }
    //Agregar el objeto a la lista
    public void agregarProgramadores(Programador objPro) {
        lstEquipo.add(objPro);
    }

    //Metodo para presentar e la lista si es empleado o programador
    public String toStringFinal() {
        //Variable que se retorna
        String mostar = "";
        mostar = "Empleado: " + super.toString() + "\n";
        //Objeto Iterador
        Iterator a = lstEquipo.iterator();

        //Recorre la lista si es verdaddera guarda en la variable
        while (a.hasNext() == true) {
            Programador objProgra = (Programador) a.next();
            mostar = mostar + "Programador: " + objProgra.toString() + "\n";

        }
        return mostar;

    }

}
