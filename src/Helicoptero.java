import javax.swing.JOptionPane;

public class Helicoptero extends Aereo {
	
	Vehiculo miVehiculo = new Vehiculo();
	Aereo miAereo = new Aereo();
	
	public void construrtor() {
		miVehiculo.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de modelo de su Helicoptero")));
		miVehiculo.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el tipo de vehiculo de su Helicoptero"));
		miAereo.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre para su Helicoptero"));
	}


	public String encenderHelices() {
		return "Metodo encenderHelices de la clase helicoptero";

	}
	public void imprimirDatos() {
		System.out.println();
		construrtor();
		System.out.println(miVehiculo.getModeloVehiculo());
		System.out.println(miVehiculo.getNombreVehiculo());
		System.out.println(miAereo.getNombreAereo());

	}

}
