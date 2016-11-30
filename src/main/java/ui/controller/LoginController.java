package ui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import other.UserType;
import ui.controllerservice.LoginControllerService;
import bl.implementation.Login;
import bl.service.LoginBLService;
import ui.presentation.*;


/**
 * Created by 婧婧 on 2016/11/27.
 */
public class LoginController implements LoginControllerService{
    private LoginUI loginUI;
    private LoginBLService loginBL = new Login();

    private static Stage primaryStage;
    public static void setPrimaryStage(Stage in){
        primaryStage=in;
    }


    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    /*@FXML
    private void onLogIn(ActionEvent E)throws Exception {
        UserType userType = loginBL.getUserType(username.toString());
        switch (userType){
            case Member:
                new MemberFirstUI().start(primaryStage);
                break;
            case Hotel:

            case Manager:

        }
    }*/
    @FXML
    private void onLogIn(ActionEvent E) {

        try{
            new HotelFirstUI().start(primaryStage);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
    @FXML
    private void onCompanyRegister(ActionEvent E)throws Exception {
        new CompanyRegisterUI().start(primaryStage);
    }
    @FXML
    private void onNormalRegiser(ActionEvent E)throws Exception {
        new NormalRegiserUI().start(primaryStage);
    }
    @FXML
    private void onCancel(ActionEvent E)throws Exception {
        new LoginUI().start(primaryStage);
    }
    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public UserType getUserRole() {
        return null;
    }
}

