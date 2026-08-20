// 12/18/24
// Ian Lewis
// CSD 405
// Module 12 Assignment

/*
    This program displays four images randomly selected from a deck of 52 cards.
    A zip file containing card files titled 1.png, 2.png, 3.png, 4.png, …, 52.png
    was provided. This application:
        • Stores the images in a “cards” sub directory.
        • Using these cards, randomly selects four cards for display.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;

public class RandomCardDisplayFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Directory where card images are stored
        String cardDirectory = "cards";

        // Array stores card file paths
        String[] cardPaths = new String[52];

        // Loads all card file paths
        for (int i = 1; i <= 52; i++) {
            cardPaths[i - 1] = cardDirectory + File.separator + i + ".png";
        }

        // Randomly selects four card images
        Random random = new Random();
        HBox cardBox = new HBox(10);

        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(52);
            String selectedCardPath = cardPaths[randomIndex];

            // Creatse an ImageView for selected card
            Image cardImage = new Image("file:" + selectedCardPath);
            ImageView cardView = new ImageView(cardImage);
            cardView.setFitWidth(120); // Adjust width for consistent card size
            cardView.setPreserveRatio(true);

            cardBox.getChildren().add(cardView);
        }

        // Sets up scene and stage
        Scene scene = new Scene(cardBox);
        primaryStage.setTitle("Random Card Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Cite: w3schools.com, module "Java Tutorials"
// Cite: openjfx.io/, module "JavaFX"
// Cite: oracle.com, module "JavaFX"
// Cite: javatpoint.com, module "JavaFx Tutorial"