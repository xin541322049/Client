package ui.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.controller.MemberController;

/**
 * Created by 97147 on 2016/12/1.
 */
public class MemberHotelInformationInHistoryUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MemberHotelInformationInhis.fxml"));
        MemberController.setPrimaryStage(primaryStage);
        MemberController.setRoot(root);
        Scene myScene = new Scene(root,1180,660);
        primaryStage.setX(450);
        primaryStage.setResizable(false);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
}
