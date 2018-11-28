package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LogInPage {

    Label userNameLabel;
    Label passwordLabel;
    Label wrongPrompt;
    TextField userNameTF;
    PasswordField passwordPF;
    Button logInBT;
    Button forgotBT;
    Scene logInScene;    // JPanel

    public LogInPage(){
        VBox logInLayout = new VBox();
        wrongPrompt = new Label("Username/Password does not match !!!");
        wrongPrompt.setVisible(false);
        forgotBT = new Button("Do not know password");
        logInLayout.setPadding(new Insets(5,5,5,5));
        userNameLabel = new Label("User Name: ");
        passwordLabel = new Label("Password: ");
        userNameTF = new TextField();
        userNameTF.setPromptText("Enter your username here");
        passwordPF = new PasswordField();
        passwordPF.setPromptText("Enter your password here");
        logInBT = new Button("Log In");
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5,5,5,5));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(userNameLabel, userNameTF, passwordLabel, passwordPF);
        logInLayout.setSpacing(20);
        logInLayout.getChildren().addAll(hbox, logInBT, forgotBT, wrongPrompt);
        logInScene = new Scene(logInLayout, 600,200);
    }


    public Label getUserNameLabel() {
        return userNameLabel;
    }

    public Label getPasswordLabel() {
        return passwordLabel;
    }

    public TextField getUserNameTF() {
        return userNameTF;
    }

    public PasswordField getPasswordPF() {
        return passwordPF;
    }

    public Button getLogInBT() {
        return logInBT;
    }

    public Scene getLogInScene() {
        return logInScene;
    }

    public Button getForgotBT() {
        return forgotBT;
    }

    public Label getWrongPrompt() {
        return wrongPrompt;
    }
}
