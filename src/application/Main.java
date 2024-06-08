package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Controles Basicos by MarlonPilamunga");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        String[] controlNames = {
            "Button:", "CheckBox:", "Hyperlink:", "ToggleButton:", "RadioButton:", 
            "Label:", "TextField:", "PasswordField:", "TextArea:", "ProgressIndicator:", 
            "ProgressBar:", "Slider:"
        };

        Control[] controls = {
            new Button("Botón"), new CheckBox("Casilla de verificación"),
            new Hyperlink("Enlace"), new ToggleButton("Botón de alternancia"),
            new RadioButton("Botón de radio"), new Label("Etiqueta"),
            new TextField(), new PasswordField(), new TextArea(),
            new ProgressIndicator(), new ProgressBar(), new Slider()
        };

        for (int i = 0; i < controlNames.length; i++) {
            Label controlLabel = new Label(controlNames[i]);
            grid.add(controlLabel, 0, i);
            grid.add(controls[i], 1, i);
        }

        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.getChildren().add(grid);

      
        ScrollPane scrollPane = new ScrollPane(flowPane);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

    
        Scene scene = new Scene(scrollPane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
