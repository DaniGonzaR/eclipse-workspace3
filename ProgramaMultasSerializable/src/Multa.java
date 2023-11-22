import java.io.Serializable;

public class Multa implements Serializable {
    
    private int numeroMulta;
    private int numeroAgente;
    private String localidad;
    private double coste;
    private boolean pagada;

    //CONSTRUCTOR
    
    public Multa(int numeroMulta, int numeroAgente, String localidad, double coste, boolean pagada) {
        this.numeroMulta = numeroMulta;
        this.numeroAgente = numeroAgente;
        this.localidad = localidad;
        this.coste = coste;
        this.pagada = pagada;
    }

    // GETTERS Y SETTERS
    
    public int getNumeroMulta() {
		return numeroMulta;
	}

	public void setNumeroMulta(int numeroMulta) {
		this.numeroMulta = numeroMulta;
	}

	public int getNumeroAgente() {
		return numeroAgente;
	}

	public void setNumeroAgente(int numeroAgente) {
		this.numeroAgente = numeroAgente;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	// Para sacar el resultado
    public String toString() {
        return "Multa [Número: " + numeroMulta + ", Agente: " + numeroAgente + ", Localidad: " + localidad
                + ", Coste: " + coste + ", Pagada: " + pagada + "]";
    }
}
