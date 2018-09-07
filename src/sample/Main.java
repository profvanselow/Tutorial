package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5); // changed from tutorial
        grid.setVgap(5); // changed from tutorial
        grid.setPadding(new Insets(25, 25, 25, 25));
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 3); // changed row from tutorial

        final Text actiontar = new Text();
        grid.add(actiontar, 1, 4); // changed row from tutorial

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontar.setFill(Color.FIREBRICK);
                actiontar.setText("Sign in button pressed");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        Text scenetitle = new Text("Welcome");
        scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

//        Label userName2 = new Label("New one");
//        grid.add(userName2, 0, 3);
//
//        TextField userTextField2 = new TextField();
//        grid.add(userTextField2, 1, 3);
//
//        Label pw2 = new Label("Password:");
//        grid.add(pw2, 0, 4);
//
//        PasswordField pwBox2 = new PasswordField();
//        grid.add(pwBox2, 1, 4);

        grid.setGridLinesVisible(true);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
