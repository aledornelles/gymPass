package Main;

import Desktop.Views.Register;
import io.github.cdimascio.dotenv.Dotenv;

public class Main {

    public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        new Register().setVisible(true);
    }

}
