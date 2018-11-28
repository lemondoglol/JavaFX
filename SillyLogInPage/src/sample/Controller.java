package sample;

import Model.DB;
import View.ExitConfirmPage;
import View.LogInPage;
import View.MainView;
import View.VerifyPage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.*;

public class Controller {
    LogInPage logInPage;
    VerifyPage verifyPage;
    MainView mainView;
    Stage window;
    ExitConfirmPage exitConfirmPage;
    DB db;


    public Controller(MainView view, DB db){
        this.db = db;
        this.mainView = view;
        logInPage = view.getLogInPage();
        window = view.getWindow();
        verifyPage = view.getVerifyPage();
        exitConfirmPage = new ExitConfirmPage();

        logInPage.getLogInBT().setOnAction(e -> {
            String password = logInPage.getPasswordPF().getText();
            String name = logInPage.getUserNameTF().getText();
            if(name.equals("Ryan") && password.equals("123")){
                mainView.setCurrentScene(exitConfirmPage.getScene());
            }else{
                logInPage.getWrongPrompt().setVisible(true);
            }
        });

        logInPage.getForgotBT().setOnAction(e->{
            Map<String, Boolean> map = db.getQuestionLibrary().get("st1");
            Set<Button> st = verifyPage.getSt();
            List<String> lst = new ArrayList<>();
            for(String s : map.keySet()){
                lst.add(s);
            }
            int i = 0;
            Collections.shuffle(lst);
            for(Button bt : st){
                Image img = new Image(getClass().getResourceAsStream(lst.get(i)));
                bt.setGraphic(new ImageView(img));
                if(map.get(lst.get(i)) == true) db.setCorrectAnswer(i);
                i++;
            }

            mainView.setCurrentScene(verifyPage.getScene());
        });


        verifyPage.getExitBT().setOnAction(e -> {
            mainView.setCurrentScene(exitConfirmPage.getScene());
        });


        exitConfirmPage.getNoBT().setOnMouseEntered(e->{
            exitConfirmPage.getNoBT().setText("Yes, Ryan is the best");
        });
        exitConfirmPage.getNoBT().setOnMouseExited(e->{
            exitConfirmPage.getNoBT().setText("No, Ryan is not the best");
        });

        exitConfirmPage.getYesBT().setOnAction(e->{
            window.close();
        });
        exitConfirmPage.getNoBT().setOnAction(e->{
            window.close();
        });

        window.setOnCloseRequest(e->{
            e.consume();
        });

    }

}
