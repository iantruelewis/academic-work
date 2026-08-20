// 11/24/24
// Ian Lewis
// CSD 405
// Module 7 Assignment
// GridPane

/*
    The point of this program is to illustrate an example of JavaFX GridPane in action.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creates GridPane
        GridPane gridPane = new GridPane();

        // Adds spacing between rows and columns
        gridPane.setHgap(10); // Horizontal gap
        gridPane.setVgap(10); // Vertical gap

        // Creates labels, text fields, and a button
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        Button submitButton = new Button("Submit");

        // Adds components to GridPane
        gridPane.add(nameLabel, 0, 0);    // Column 0, Row 0
        gridPane.add(nameField, 1, 0);   // Column 1, Row 0
        gridPane.add(emailLabel, 0, 1);  // Column 0, Row 1
        gridPane.add(emailField, 1, 1);  // Column 1, Row 1
        gridPane.add(submitButton, 1, 2); // Column 1, Row 2

        // Creates Scene and sets it on Stage
        Scene scene = new Scene(gridPane, 300, 200); // Width 300, Height 200
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launches JavaFX application
    }
}

// OpenJFX. (n.d.). OpenJFX documentation. Retrieved November 24, 2024, from https://openjfx.io/  
// GeeksforGeeks. (01/09/2023). JavaFX tutorial. Retrieved November 24, 2024, from https://www.geeksforgeeks.org/javafx-tutorial/
// Oracle. (n.d.). GridPane (JavaFX 8). Retrieved November 24, 2024, from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html 
// OpenJFX. (n.d.). Pane usage documentation (JavaFX 18). Retrieved November 24, 2024, from https://openjfx.io/javadoc/18/javafx.graphics/javafx/scene/layout/class-use/Pane.html
// GeeksforGeeks. (06/06/2019). JavaFX: How to set padding between nodes of a GridPane. Retrieved November 24, 2024, from https://www.geeksforgeeks.org/javafx-how-to-set-padding-between-nodes-of-a-gridpane/