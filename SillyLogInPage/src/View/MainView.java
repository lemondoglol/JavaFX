package View;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView {
    private Stage window;
    private Scene currentScene;
    private LogInPage logInPage;
    private VerifyPage verifyPage;

    public MainView(Stage window){
        this.window = window;
        logInPage = new LogInPage();
        verifyPage = new VerifyPage();
    }

    public void generagePage(){
        currentScene = logInPage.getLogInScene();
        window.setScene(currentScene);
        window.setTitle("Welcome to Leidos <3");
        window.show();
    }


    public Stage getWindow() {
        return window;
    }

    public LogInPage getLogInPage() {
        return logInPage;
    }

    public Scene getCurrentScene() {
        return currentScene;
    }

    public VerifyPage getVerifyPage() {
        return verifyPage;
    }

    public void setCurrentScene(Scene currentScene) {
        this.currentScene = currentScene;
        window.setScene(currentScene);
    }
}
