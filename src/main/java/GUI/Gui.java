package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Gui extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane fp = new FlowPane();
        Button b1 = new Button("Drück Mich :D");
        fp.getChildren().add(b1);
        b1.setOnMouseClicked(event -> System.out.println("Ouch!"));
        Scene s = new Scene(fp);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
