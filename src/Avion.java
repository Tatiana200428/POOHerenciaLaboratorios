import javax.swing.JOptionPane;

public class Avion extends Aereo {

	Vehiculo miVehiculo = new Vehiculo();
	Aereo miAereo = new Aereo();

	public void construrtor() {
		miVehiculo.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de modelo de su Avion")));
		miVehiculo.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el tipo de vehiculo de su Avion"));
		miAereo.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre para su Avion"));
	}

	public String bajarTrenDeAterrizaje() {

		return "Metodo bajarTrenDeAterrizaje de la clase avion";

	}

	public void imprimirDatos() {
		construrtor();
		System.out.println(miVehiculo.getModeloVehiculo());
		System.out.println(miVehiculo.getNombreVehiculo());
		System.out.println(miAereo.getNombreAereo());

	}
}
