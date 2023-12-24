import controller.Controller;
import model.Model;
import view.View;

/**
 * PATTERN (extra): MVC
 * El patron MVC (Model-View-Controller) es un patron de diseño que separa la aplicacion en tres componentes,
 * la interfaz de usuario (View), la logica de la aplicacion (Model), y el modulo que actua como intermediario
 * entre la vista y el modelo (Controller).
 * Este patron se utiliza para separar la logica de la aplicacion de la interfaz de usuario, permitiendo que
 * se puedan desarrollar de forma paralela, modular, y reutilizable.
 * En este caso, la vista es la clase View, el controlador es la clase Controller, y el modelo son un conjunto
 * de clases que se encuentran en el paquete model (teniendo como clase principal la clase Model).
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.run();
    }
}