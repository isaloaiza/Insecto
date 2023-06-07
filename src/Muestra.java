import elementos.Insectos;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Muestra {
	
	  public static ArrayList<Insectos> listaInsectos = new ArrayList<>();
	 public static HashMap<String, Insectos> mapaInsectos = new HashMap<>();


	public static void main(String[] args) {
		
		
		int opcion;

        do {
            String menu = ">>>Menu de insectos<<<\n";
                   menu +="1. Registrar insecto\n";
                   menu += "2. Mostrar lista de insectos registrados\n";
                   menu +="3. Consultar Insecto\n";
                   menu += "4. Salir\n";
                   menu += "Ingrese una opción:";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcion) {
                case 1:
                    registrarInsecto();
                    break;
                case 2:
                	mostrarListaInsectos();
                   
                    break;
                case 3:
                	 consultarInsecto();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por su acompañamiento...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se encuentra esta opcion.");
            }
        } while (opcion != 4);
    }

    public static void registrarInsecto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del insecto:");
        String tipo = JOptionPane.showInputDialog("Ingrese la especie de insecto:");
        int numeroPatas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de patas del insecto:"));
        double medida =Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida en cm del insecto:"));

        Insectos insecto = new Insectos();
        
        insecto.setNombre(nombre);
        insecto.setTipo(tipo);
        insecto.setNumeroPatas(numeroPatas);
        insecto.setMedida(medida);
        
        listaInsectos.add(insecto);
        mapaInsectos.put(nombre, insecto);

        JOptionPane.showMessageDialog(null, "¡Insecto registrado exitosamente!");
    }

    public static void consultarInsecto() {
    	
        String nombre = JOptionPane.showInputDialog("ingrese el nombre del insecto");
        
        		Insectos insecto = mapaInsectos.get(nombre);
        		
        		if(mapaInsectos.containsKey(nombre)) {
        			insecto.mostrarDetalles();
        		}else {
        			JOptionPane.showMessageDialog(null, "El insecto no existe");
        		}
    }

    public static void mostrarListaInsectos() {
        if (listaInsectos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay insectos registrados.");
        } else {
        	
        	String lista="Lista de insectos registrados:\n";;
            for (Insectos insecto : listaInsectos) {
                lista += "Nombre: " + insecto.getNombre() + "\n";
                lista += "Tipo: " + insecto.getTipo() + "\n";
                lista += "Número de patas: " + insecto.getNumeroPatas() + "\n";
                lista += "Medida: " + insecto.getMedida() + "\n";
                lista += "-------------------\n";
            }
            JOptionPane.showMessageDialog(null, lista);
        }
        		
		
		
    }

}
