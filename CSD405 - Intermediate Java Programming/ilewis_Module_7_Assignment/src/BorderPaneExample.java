// 11/24/24
// Ian Lewis
// CSD 405
// Module 7 Assignment
// BorderPane

/*
    The point of this program is to illustrate an example of JavaFX BorderPane in action.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creates BorderPane layout
        BorderPane borderPane = new BorderPane();

        // Top: Adds title label
        Label titleLabel = new Label("BorderPane Example");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        borderPane.setTop(titleLabel);

        // Left: Adds vertical menu with buttons
        VBox menu = new VBox(10); // Spacing of 10 between buttons
        menu.getChildren().addAll(new Button("Home"), new Button("About"), new Button("Settings"));
        borderPane.setLeft(menu);

        // Center: Adds label as main content
        Label contentLabel = new Label("Main Content Area");
        contentLabel.setStyle("-fx-font-size: 14px; -fx-border-color: black; -fx-padding: 10px;");
        borderPane.setCenter(contentLabel);

        // Bottom: Adds status bar label
        Label statusBar = new Label("Status: Ready");
        statusBar.setStyle("-fx-background-color: lightgray; -fx-padding: 5px;");
        borderPane.setBottom(statusBar);

        // Creates Scene and sets it on Stage
        Scene scene = new Scene(borderPane, 400, 300); // Width 400, Height 300
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launches JavaFX application
    }
}

// OpenJFX. (n.d.). OpenJFX documentation. Retrieved November 24, 2024, from https://openjfx.io/  
// GeeksforGeeks. (01/09/2023). JavaFX tutorial. Retrieved November 24, 2024, from https://www.geeksforgeeks.org/javafx-tutorial/
// Oracle. (n.d.). BorderPane (JavaFX 8). Retrieved November 24, 2024, from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html 
// OpenJFX. (n.d.). BorderPane documentation (JavaFX 11). Retrieved November 24, 2024, from https://openjfx.io/javadoc/11/javafx.graphics/javafx/scene/layout/BorderPane.html 
// GeeksforGeeks. (09/01/2021). JavaFX BorderPane class. Retrieved November 24, 2024, from https://www.geeksforgeeks.org/javafx-borderpane-class/