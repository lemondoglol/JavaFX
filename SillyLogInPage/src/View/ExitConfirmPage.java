package View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ExitConfirmPage {

    private Button yesBT, noBT;
    private Scene scene;
    private VBox vBox;


    public ExitConfirmPage(){
        Label label = new Label("Answer one more question,\nand then you can exit\n\nQuestion: Is Ryan the best?");
        yesBT = new Button("Yes, Ryan is the best!");
        noBT = new Button("No, Ryan is not the best!");
        vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label, yesBT, noBT);
        scene = new Scene(vBox, 300,300);
    }

    public Button getYesBT() {
        return yesBT;
    }

    public void setYesBT(Button yesBT) {
        this.yesBT = yesBT;
    }

    public Button getNoBT() {
        return noBT;
    }

    public void setNoBT(Button noBT) {
        this.noBT = noBT;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }
}
