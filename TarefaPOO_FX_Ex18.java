import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TarefaPOO_FX_Ex18 extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculadora");

        int alturaBotao = 90;

        Pane painel = new Pane();
        Scene scn = new Scene(painel, 400, 500);

        TextField tfNum = new TextField();
        tfNum.setPrefWidth(310);
        tfNum.setPrefHeight(50);
        tfNum.relocate(23, 25);

        Button btnCe = new Button("CE");
        btnCe.setPrefHeight(20);
        btnCe.setPrefWidth(30);
        btnCe.relocate(347, 35);

        Button btn0 = new Button("0");
        btn0.setPrefHeight(alturaBotao);
        btn0.setPrefWidth(80);
        btn0.relocate(115, 390);

        Button btn1 = new Button("1");
        btn1.setPrefHeight(alturaBotao);
        btn1.setPrefWidth(80);
        btn1.relocate(23, 90);

        Button btn2 = new Button("2");
        btn2.setPrefHeight(alturaBotao);
        btn2.setPrefWidth(80);
        btn2.relocate(115, 90);

        Button btn3 = new Button("3");
        btn3.setPrefHeight(alturaBotao);
        btn3.setPrefWidth(80);
        btn3.relocate(205, 90);

        Button btn4 = new Button("4");
        btn4.setPrefHeight(alturaBotao);
        btn4.setPrefWidth(80);
        btn4.relocate(23, 190);

        Button btn5 = new Button("5");
        btn5.setPrefHeight(alturaBotao);
        btn5.setPrefWidth(80);
        btn5.relocate(115, 190);

        Button btn6 = new Button("6");
        btn6.setPrefHeight(alturaBotao);
        btn6.setPrefWidth(80);
        btn6.relocate(205, 190);

        Button btn7 = new Button("7");
        btn7.setPrefHeight(alturaBotao);
        btn7.setPrefWidth(80);
        btn7.relocate(23, 290);

        Button btn8 = new Button("8");
        btn8.setPrefHeight(alturaBotao);
        btn8.setPrefWidth(80);
        btn8.relocate(115, 290);

        Button btn9 = new Button("9");
        btn9.setPrefHeight(alturaBotao);
        btn9.setPrefWidth(80);
        btn9.relocate(205, 290);

        Button btnP = new Button(".");
        btnP.setPrefHeight(alturaBotao);
        btnP.setPrefWidth(80);
        btnP.relocate(23, 390);

        Button btnI = new Button("=");
        btnI.setPrefHeight(alturaBotao);
        btnI.setPrefWidth(80);
        btnI.relocate(205, 390);

        Button btnMa = new Button("+");
        btnMa.setPrefHeight(alturaBotao);
        btnMa.setPrefWidth(80);
        btnMa.relocate(297, 90);

        Button btnMe = new Button("-");
        btnMe.setPrefHeight(alturaBotao);
        btnMe.setPrefWidth(80);
        btnMe.relocate(297, 190);

        Button btnV = new Button("*");
        btnV.setPrefHeight(alturaBotao);
        btnV.setPrefWidth(80);
        btnV.relocate(297, 290);

        Button btnD = new Button("/");
        btnD.setPrefHeight(alturaBotao);
        btnD.setPrefWidth(80);
        btnD.relocate(297, 390);
        
        painel.getChildren().addAll(tfNum, btnCe, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnP, btnI, btnMa, btnMe, btnV, btnD);

        primaryStage.setScene(scn);
        primaryStage.show();
    }
}
