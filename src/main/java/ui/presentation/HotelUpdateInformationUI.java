package ui.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.controller.HotelController;

/**
 * Created by 97147 on 2016/11/30.
 */
public class HotelUpdateInformationUI  extends Application {
    @Override
    public void start(Stage primaryStage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HotelUpdateInformation.fxml"));
        HotelController.setMinPrimaryStage(primaryStage);
        HotelController.setMinRoot(root);
        Scene myScene = new Scene(root,318,538);
        primaryStage.setResizable(false);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
}