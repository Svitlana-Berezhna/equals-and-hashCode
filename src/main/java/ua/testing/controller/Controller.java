package ua.testing.controller;

import ua.testing.model.Pixel;
import ua.testing.view.View;

/**
 * <h1>Pixel (Equals HashCode)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-17
 */
public class Controller {
    private Pixel model1;
    private Pixel model2;
    private View view;

    public Controller(Pixel model1, Pixel model2, View view) {
        this.model1 = model1;
        this.model2 = model2;
        this.view = view;
    }

    public void processUser() {
        view.printMessage("" + (model1 == model2));
        view.printMessage("" + (model1.equals(model2)));
        view.printMessage("" + (model1.hashCode() == model2.hashCode()));
        view.printMessage("" + (model1.hashCode()));
        view.printMessage("" + (model2.hashCode()));
        view.printMessage("" + (model1));
        view.printMessage("" + (model2));
    }
}
