package poo.javaFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.web.WebView;

import java.awt.*;
public class prueba2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private final WebView webView = new WebView();

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        TextField textField = new TextField("http://");
        textField.setOnAction(event -> webView.getEngine().load(textField.getText()));
        vBox.getChildren().addAll(textField, webView);
        Scene scene = new Scene(vBox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
