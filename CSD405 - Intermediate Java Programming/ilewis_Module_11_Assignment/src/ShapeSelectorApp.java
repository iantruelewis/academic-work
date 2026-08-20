// 12/14/24
// Ian Lewis
// CSD 405
// Module 11 Assignment

/*
    The point of this program is display various figures such as a Circle, a Rectangle,
    or an Ellipse. The program includes:
        • Radio buttons selections for changing the display figure to the one selected.
        • Checkbox for filling and clearing the displayed figure with a random color.
*/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.util.Random;

public class ShapeSelectorApp extends Application {

    private Shape currentShape;

    @Override
    public void start(Stage primaryStage) {
        // Creates shapes
        Circle circle = new Circle(100);
        Rectangle rectangle = new Rectangle(250, 150);
        Ellipse ellipse = new Ellipse(150, 100);

        // Sets default shape appearances
        circle.setStroke(Color.BLACK);
        rectangle.setStroke(Color.BLACK);
        ellipse.setStroke(Color.BLACK);
        rectangle.setFill(null);
        ellipse.setFill(null);
        circle.setFill(null);

        // VBox holds shapes
        VBox shapeContainer = new VBox();
        shapeContainer.getChildren().add(circle);
        currentShape = circle;

        // Radio buttons for shape selection
        RadioButton circleButton = new RadioButton("Circle");
        RadioButton rectangleButton = new RadioButton("Rectangle");
        RadioButton ellipseButton = new RadioButton("Ellipse");

        ToggleGroup shapeGroup = new ToggleGroup();
        circleButton.setToggleGroup(shapeGroup);
        rectangleButton.setToggleGroup(shapeGroup);
        ellipseButton.setToggleGroup(shapeGroup);
        circleButton.setSelected(true);

        // Event handlers for radio buttons
        circleButton.setOnAction(e -> {
            shapeContainer.getChildren().clear();
            shapeContainer.getChildren().add(circle);
            currentShape = circle;
        });

        rectangleButton.setOnAction(e -> {
            shapeContainer.getChildren().clear();
            shapeContainer.getChildren().add(rectangle);
            currentShape = rectangle;
        });

        ellipseButton.setOnAction(e -> {
            shapeContainer.getChildren().clear();
            shapeContainer.getChildren().add(ellipse);
            currentShape = ellipse;
        });

        // Checkbox for filling shapes with random colors
        CheckBox fillCheckBox = new CheckBox("Fill with random color");
        fillCheckBox.setOnAction(e -> {
            if (fillCheckBox.isSelected()) {
                currentShape.setFill(getRandomColor());
            } else {
                currentShape.setFill(null); // Clear the fill
            }
        });

        // Layout for controls and shape display
        VBox root = new VBox(10);
        root.getChildren().addAll(circleButton, rectangleButton, ellipseButton, fillCheckBox, shapeContainer);
        root.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 10;");

        // Sets up scene and stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shape Selector");
        primaryStage.show();
    }

    // Helper method generates random colors
    private Color getRandomColor() {
        Random random = new Random();
        return Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Cite: w3schools.com, module "Java Tutorials"
// Cite: openjfx.io, module "JavaFX"
// Cite: oracle.com, module "JavaFX"
// Cite: javatpoint.com, module "JavaFx Tutorial"
// Cite: oracle.com, article "Class Media"
// Cite: openjfx.io, module "Module javafx.media"
// Cite: oracle.com, article "Class Color"
// Cite: tutprialspoint.com, article "JavaFX - Colors"
// Cite: oracle.com, article "Class Shape"
// Cite: openjfx.io, module "Class Shape"
// Cite: jenkov.com, module "JavaFX Button"
// Cite: oracle.com, article "Class Button"
// Cite: geeksforgeeks.org, article "JavaFX | Button with examples"
// Cite: oracle.com, article "Class CheckBox"