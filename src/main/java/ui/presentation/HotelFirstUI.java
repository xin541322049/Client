package ui.presentation;

import bl.implementation.Hotel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.controller.HotelController;

/**
 * Created by 97147 on 2016/11/30.
 */
public class HotelFirstUI extends Application {
//    private HotelController controller ;

    @Override
    public void start(Stage primaryStage){
//        FXMLLoader loader=new FXMLLoader(getClass().getResource("HotelFirst.fxml"));
//        Parent root =loader.load();
        //controller=loader.getController();
        try{
            Parent root =FXMLLoader.load(getClass().getClassLoader().getResource("ui/presentation/HotelFirst.fxml"));
            HotelController.setPrimaryStage(primaryStage);
            Scene myScene = new Scene(root,960,540);
            primaryStage.setScene(myScene);
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        launch(args);
//    }
}
