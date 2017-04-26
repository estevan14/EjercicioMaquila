package Clases;

/**
 *
 * @author febre, estevan
 */
public class Empleado {

    //Variables
    int intId;
    private String strNombre;
    private double dblSalario;
    static int idSiguiete = 1;

    //Constructor
    public Empleado(String strNombre, double dblSalario) {
        intId = idSiguiete;
        this.strNombre = strNombre;
        this.dblSalario = dblSalario;
        idSiguiete++;
    }
    
    //Metodos
    public double getDblSalario1() {
        return dblSalario;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Id=" + intId + ", Nombre=" + strNombre + ", Salario=" + dblSalario;
    }

}
