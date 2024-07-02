package poo.javaFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.web.WebView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

import java.awt.*;
public class prueba3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private final WebView webView = new WebView();

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        TextField textField = new TextField("http://");
        textField.setOnAction(event ->
                webView.getEngine().load(textField.getText()));
        Scene scene = new Scene(vBox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        MenuBar mainMenu = new MenuBar();

        Menu file = new Menu("File");
        MenuItem refreshMenuItem = new MenuItem("Refresh");
        MenuItem exitMenuItem = new MenuItem("Exit");

        file.getItems().addAll(refreshMenuItem, exitMenuItem);

        Menu help = new Menu("Help");
        MenuItem aboutMenuItem = new MenuItem("About");

        help.getItems().add(aboutMenuItem);

        mainMenu.getMenus().addAll(file, help);

        vBox.getChildren().addAll(mainMenu, textField, webView);

        exitMenuItem.setOnAction(event -> Platform.exit());

        aboutMenuItem.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Look, an Information Dialog");
            alert.setContentText("I have a great message for you!");
            alert.showAndWait();
        });

        exitMenuItem.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Look, a Confirmation Dialog");
            alert.setContentText("Are you sure you want to exit?");
            alert.showAndWait()
                    .filter(btnType -> btnType.equals(ButtonType.OK))
                    .ifPresent(btnType -> Platform.exit());

//            otra manera:
//            ButtonType result = alert.showAndWait().get();
//            if(result.equals(ButtonType.OK)){
//                Platform.exit();
//            }
        });

    }
}
