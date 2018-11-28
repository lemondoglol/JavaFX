package sample;

import Model.DB;
import View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage window;
    private DB db;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // create model  fake
        window = primaryStage;
        db = new DB();
        MainView mainView = new MainView(window);
        mainView.generagePage();
        new Controller(mainView, db);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
