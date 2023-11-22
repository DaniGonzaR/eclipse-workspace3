import java.util.ArrayList;

public class Padre extends Persona {

    private ArrayList<Persona> hijos;

    public Padre(String nombre, int edad, double peso, double altura, ArrayList<Persona> hijos) {
        super(nombre, edad, peso, altura);
        this.hijos = hijos;
    }

    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Persona> hijos) {
        this.hijos = hijos;
    }

    public void addHijo(Persona hijo) {
        hijos.add(hijo);
    }

    public void removeHijo(Persona hijo) {
        hijos.remove(hijo);
    }

    public String toString() {
        return super.toString() + ", Hijos=" + hijos;
    }
}
