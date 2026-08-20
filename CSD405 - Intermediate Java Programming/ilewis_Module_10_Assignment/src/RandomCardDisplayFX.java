// 12/07/24
// Ian Lewis
// CSD 405
// Module 10 Assignment

/*
    The point of this program is to expand on a previous program by incorporating the following:
     • Below the cards, a refresh button that will display four different cards.
     • All cards will be displayed through random selection.
     • The images will be stored in a "cards" sub directory.

*/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;

public class RandomCardDisplayFX extends Application {

    // Directory where card images are stored
    private static final String CARD_DIRECTORY = "cards";
    private static final int CARD_COUNT = 52;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Creates main layout
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Creates HBox to display cards
        HBox cardBox = new HBox(10);
        cardBox.setStyle("-fx-alignment: center;");

        // Creates "Refresh" button
        Button refreshButton = new Button("Refresh");
        refreshButton.setOnAction(e -> displayRandomCards(cardBox));

        // Adds initial cards and button to layout
        displayRandomCards(cardBox);
        root.getChildren().addAll(cardBox, refreshButton);

        // Sets up stage and scene
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Random Card Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Displays four random cards in HBox
    private void displayRandomCards(HBox cardBox) {
        // Clears existing cards
        cardBox.getChildren().clear();

        Random random = new Random();

        // Adds four random card images to HBox
        for (int i = 0; i < 4; i++) {
            int cardNumber = random.nextInt(CARD_COUNT) + 1; // Random number between 1 and 52
            String cardPath = CARD_DIRECTORY + "/" + cardNumber + ".png";

            // Loads image and displays it
            Image cardImage = new Image(new File(cardPath).toURI().toString());
            ImageView cardView = new ImageView(cardImage);

            // Sets image size
            cardView.setFitWidth(100);
            cardView.setPreserveRatio(true);

            cardBox.getChildren().add(cardView);
        }
    }
}

// Cite: w3schools.com, module "Java Tutorials"
// Cite: openjfx.io/, module "JavaFX"
// Cite: oracle.com, module "JavaFX"
// Cite: javatpoint.com, module "JavaFx Tutorial"
// Cite: tutorialspoint.com, Article "How to create a Button in JavaFX?"
// Cite: geeksforgeeks.org, Article "JavaFX | Button with examples"
// Cite: javatpoint.com, module "How to pick random elements from an Array"
