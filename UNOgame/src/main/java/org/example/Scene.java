package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import jdk.tools.jlink.internal.plugins.AbstractPlugin;

public class Scene extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 1200, 800, Color.BLUEVIOLET);

        Button[][] cards = Cards.getCards();

        for (int i = 0; i < 7; i++) {
            int randomRow = (int) (Math.random() * cards.length);
            int randomCol = (int) (Math.random() * cards[0].length);

            Button button = new Button();
            if (cards[randomRow][randomCol] != null) {
                button.setText(cards[randomRow][randomCol].toString());
            }
            button.setPrefSize(100, 50);
            button.setLayoutX(100 * i);
            button.setLayoutY(100);

            root.getChildren().add(button);
        }

        stage.setScene(scene);
        stage.show();
    }
}