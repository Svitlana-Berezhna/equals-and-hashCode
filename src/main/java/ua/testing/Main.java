package ua.testing;

import ua.testing.controller.Controller;
import ua.testing.model.Color;
import ua.testing.model.Pixel;
import ua.testing.view.View;

/**
 * <h1>Pixel (Equals HashCode)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-17
 */
public class Main {
    public static void main(String[] args) {
        Controller controller =
                new Controller(new Pixel(3., 4., Color.INDIGO),
                        new Pixel(3., 4., Color.INDIGO), new View());
        controller.processUser();
    }
}
