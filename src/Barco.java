import javax.swing.JOptionPane;

public class Barco extends Acuatico {
	
	Vehiculo miVehiculo = new Vehiculo();
	Acuatico miAcuatico = new Acuatico();
	
	public void construrtor() {
		miVehiculo.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de modelo de su Barco")));
		miVehiculo.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese un tipo para su barco"));
		miAcuatico.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese nombre para su barco"));
	}

	public String prenderMotor() {
		return "Metodo prenderMotor de la clase Barco";
	}
	
	public void imprimirDatos() {
		System.out.println();
		construrtor();
		System.out.println(miVehiculo.getModeloVehiculo());
		System.out.println(miVehiculo.getNombreVehiculo());
		System.out.println(miAcuatico.getNombreAcuatico());

	}

}
