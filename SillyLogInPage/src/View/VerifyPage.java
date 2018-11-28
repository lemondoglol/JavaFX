package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class VerifyPage {

    private Button bt1,bt2,bt3,bt4,exitBT;
    private VBox layout;
    private Scene scene;
    private List<Button> st;
    
    public VerifyPage(){
        //Image img1 = new Image("file:pill1.png");
        Label label = new Label("Security Check\nWhich of the following medicines is for headache?");
        st = new ArrayList<>();
        Image img1 = new Image(getClass().getResourceAsStream("p1.jpg"));
        Image img2 = new Image(getClass().getResourceAsStream("p2.png"));
        Image img3 = new Image(getClass().getResourceAsStream("p3.jpg"));
        Image img4 = new Image(getClass().getResourceAsStream("p4.jpg"));
        bt1 = new Button();
        bt2 = new Button();
        bt3 = new Button();
        bt4 = new Button();
        st.add(bt1);
        st.add(bt2);
        st.add(bt3);
        st.add(bt4);

        exitBT = new Button("Exit");
        bt1.setGraphic(new ImageView(img1));
        bt2.setGraphic(new ImageView(img2));
        bt3.setGraphic(new ImageView(img3));
        bt4.setGraphic(new ImageView(img4));
        HBox first = new HBox();
        first.getChildren().addAll(bt1, bt2);
        HBox second = new HBox();
        second.getChildren().addAll(bt3, bt4);
        layout = new VBox();
        layout.setPadding(new Insets(5,5,5,5));
        first.setSpacing(10);
        second.setSpacing(10);
        layout.setSpacing(10);
        layout.getChildren().addAll(label, first, second, exitBT);
        scene = new Scene(layout, 400,350);
    }

    public Button getBt1() {
        return bt1;
    }

    public Button getBt2() {
        return bt2;
    }

    public Button getBt3() {
        return bt3;
    }

    public Button getBt4() {
        return bt4;
    }

    public VBox getLayout() {
        return layout;
    }

    public Scene getScene() {
        return scene;
    }

    public Button getExitBT() {
        return exitBT;
    }

    public List<Button> getButtonList() {
        return st;
    }
}
