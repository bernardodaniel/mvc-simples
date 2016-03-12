import controller.Controlador;
import model.Modelo;
import view.View;

public class Main {

	public static void main(String[] args) {
		Modelo m = new Modelo();
		View v = new View();
		Controlador c = new Controlador(v, m);

		v.setVisible(true);
	}

}
