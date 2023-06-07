package elementos;

import javax.swing.JOptionPane;

public class Insectos {
	
	private String nombre;
	private String tipo;
	private int numeroPatas;
	private double medida;

        
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    public String getNombre() {
    	return nombre;
    }

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}


	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	public int getNumeroPatas() {
		return numeroPatas;
	}


	public void setMedida(double medida) {
		this.medida = medida;
	}
	 public double getMedida() {
	    	return medida;
	    }
	

	public void mostrarDetalles() {
        String muestra = "Detalles del insecto:\n"
                + "Nombre: " + nombre + "\n"
                + "Tipo: " + tipo + "\n"
                + "Número de patas: " + numeroPatas +  "\n"
        		+ "Medida: " + medida;
        JOptionPane.showMessageDialog(null, muestra);
    }

	

}








    
    


