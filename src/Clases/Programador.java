package Clases;

/**
 *
 * @author febre, estevan
 */
public class Programador extends Empleado {

    //Variables
    String strLenguaje;

    //Costructor
    public Programador(String strNombre, double dblSalario, String strLenguaje) {
        super(strNombre, dblSalario);
        this.strLenguaje = strLenguaje;

    }

    //Metodo de salario
    public double getSalario2() {
        double dblBono = 0;
        double dblMontoMensual = super.getDblSalario1();

        if (strLenguaje.equalsIgnoreCase("java")) {

            dblBono = (dblMontoMensual * 0.20);

        }

        return dblMontoMensual + dblBono;
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() +" Salario Final= "+ getSalario2();
    }
    

}
