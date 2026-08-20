// 02/09/25
// Ian Lewis
// CSD 420
// Module 7 Assignment

/*
    This program displays four circles from left to right:
     1. White circle in rectangle
     2. White circle outside rectangle
     3. Red circle
     4. Green circle
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleDisplay extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creates main container using HBox
        HBox root = new HBox(10);
        root.setStyle("-fx-padding: 10;");

        // Creates pane for first circle
        Pane rectanglePane = new Pane();
        rectanglePane.setPrefSize(60, 150);
        rectanglePane.getStyleClass().add("border");

        // Creates and stylse first circle (inside rectangle)
        Circle circle1 = new Circle(30, 75, 20);
        circle1.getStyleClass().add("plaincircle");

        // Adds first circle to the rectangle pane
        rectanglePane.getChildren().add(circle1);

        // Creates and styles second white circle (outside rectangle)
        Circle circle2 = new Circle(20);
        circle2.getStyleClass().add("plaincircle");
        circle2.setCenterX(30);
        circle2.setCenterY(75);

        // Creates and styles red and green circles
        Circle circle3 = new Circle(20);
        Circle circle4 = new Circle(20);
        circle3.setId("redcircle");
        circle4.setId("greencircle");

        // Positions circles outside rectangle
        circle3.setCenterX(30);
        circle3.setCenterY(75);
        circle4.setCenterX(30);
        circle4.setCenterY(75);

        // Creates individual panes for circles outside rectangle
        Pane whitePane = new Pane(circle2);
        Pane redPane = new Pane(circle3);
        Pane greenPane = new Pane(circle4);

        // Sets size for all panes
        whitePane.setPrefSize(60, 150);
        redPane.setPrefSize(60, 150);
        greenPane.setPrefSize(60, 150);

        // Adds all panes to root HBox in correct order:
        // 1. Rectangle with white circle
        // 2. White circle
        // 3. Red circle
        // 4. Green circle
        root.getChildren().addAll(rectanglePane, whitePane, redPane, greenPane);

        // Creates scene and sets size
        Scene scene = new Scene(root);

        // Loads CSS file
        scene.getStylesheets().add("module_7.css");

        // Sets up and shows stage
        primaryStage.setTitle("Circle Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}

//Cite: openjfx.io, module "Java FX"
//Cite: oracle.com, module "Java FX"
//Cite: javatpoint.com, module "JavaFX Tutorial"
//Cite: geeksforgeeks.org, article "JavaFX | Circle with examples"
//Cite: oracle.com, module "Animation and Visual Effects in JavaFX"
//Cite: tutorialspoint.com, article "JavaFX - 2D Shapes Circle"
//Cite: oracle.com, article "Class Color"
//Cite: tutorialspoint.com, article "JavaFX - Colors"
//Cite: oracle.com, module "JavaFX CSS Reference Guide"
//Cite: vojtechruzicka.com, article "JavaFX Tutorial: CSS Styling"