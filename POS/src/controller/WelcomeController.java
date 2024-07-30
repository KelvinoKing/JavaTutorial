package controller;

import view.Welcome;
import main.App;

public class WelcomeController{

    public WelcomeController(Welcome welcome) {
        welcome.getButton().setOnAction(e -> {
            // Clear the app window
            App.clear();
            // Add a node to the app window
            App.addLeft();
        });
    }
}
