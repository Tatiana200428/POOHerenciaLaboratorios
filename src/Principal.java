import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		menuPrincipal();

		Avion miAvion = new Avion();
		miAvion.imprimirDatos();

		Barco miBarco = new Barco();
		miBarco.imprimirDatos();

		Velero miVelero = new Velero();
		miVelero.imprimirDatos();

		Helicoptero miHelicoptero = new Helicoptero();
		miHelicoptero.imprimirDatos();

	}

	public static void menuPrincipal() {
		String opciones = "Menu Opciones \n\n";
		opciones += "1.Crear vehiculo acuatico \n";
		opciones += "2.Crear vehiculo aereo \n";
		int cod = Integer.parseInt(JOptionPane.showInputDialog(opciones));

		switch (cod) {
		case 1:
			menuAcuatico();
			break;
		case 2:
			menuAereo();
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Ingrese una opcion valida!", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		}

	}

	public static void menuAcuatico() {
		String opciones = "Menu Barcos \n\n";
		opciones += "1.Barco \n";
		opciones += "2.Velero \n";
		int cod = Integer.parseInt(JOptionPane.showInputDialog(opciones));

		switch (cod) {
		case 1:
			System.out.println("BARCO");
			Barco miBarco = new Barco();
			miBarco.imprimirDatos();

			break;
		case 2:
			System.out.println("VELERO");
			Velero miVelero = new Velero();
			miVelero.imprimirDatos();
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Ingrese una opcion valida!", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		}

	}

	public static void menuAereo() {
		String opciones = "Menu  Aereo \n\n";
		opciones += "1.Avion \n";
		opciones += "2.Helicoptero \n";
		int cod = Integer.parseInt(JOptionPane.showInputDialog(opciones));

		switch (cod) {
		case 1:
			System.out.println("AVION");
			Avion miAvion = new Avion();
			miAvion.imprimirDatos();
			break;
		case 2:
			System.out.println("HELICOPTERO");
			Helicoptero miHelicoptero = new Helicoptero();
			miHelicoptero.imprimirDatos();

			break;
		default:
			JOptionPane.showConfirmDialog(null, "Ingrese una opcion valida!", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		}

	}

}
