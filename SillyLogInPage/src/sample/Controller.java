package sample;

import Model.DB;
import View.ExitConfirmPage;
import View.LogInPage;
import View.MainView;
import View.VerifyPage;
import javafx.stage.Stage;
import java.util.concurrent.TimeUnit;

public class Controller {
    private LogInPage logInPage;
    private VerifyPage verifyPage;
    private MainView mainView;
    private Stage window;
    private ExitConfirmPage exitConfirmPage;
    private DB db;
    private boolean passwordEntered;


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
            	this.passwordEntered = true;
                mainView.setCurrentScene(exitConfirmPage.getScene());
            }else{
                logInPage.getWrongPrompt().setVisible(true);
            }
        });

        logInPage.getForgotBT().setOnAction(e->{
            mainView.setCurrentScene(verifyPage.getScene());
        });


        verifyPage.getExitBT().setOnAction(e -> {
            mainView.setCurrentScene(exitConfirmPage.getScene());
        });
        // AI verify 
        for(int i = 0; i < this.verifyPage.getButtonList().size(); i++) {
        	if(i == this.db.getCorrectAnswer()) {
        		this.verifyPage.getButtonList().get(i).setOnAction(e -> {
        			System.out.println("Amazing!");
        			try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
        			mainView.setCurrentScene(exitConfirmPage.getScene());
        		});
        	}else {
        		this.verifyPage.getButtonList().get(i).setOnAction(e -> {
        			System.out.println("You silly silly lol!");
        		});
        	}
        }
       
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
        	if(this.passwordEntered == false) {
        		e.consume();
        	}
        });

    }

}
