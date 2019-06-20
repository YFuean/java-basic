package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 * ATM程序
 * 2018.10.17
 */
public class ATMApplication extends Application {


    private Alert alert;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        //创建文本对象
        Text welcomeText = new Text("欢迎来到ATM取款机！");
        Text pleaseText = new Text("请插入银行卡");
        //创建四个选择按钮
        Button drawButton = new Button("1.取款");
        Button depositButton = new Button("2.存款");
        Button queryButton = new Button("3.查询余额");
        Button quitButton = new Button("4.退出");
        //创建网格布局面板
        GridPane gridPane = new GridPane();
        //创建一个场景，将面板加入场景
        Scene scene = new Scene(gridPane);
        //设置主舞台
        primaryStage.setTitle("欢迎来到ATM!");
        primaryStage.setScene(scene);
        primaryStage.show();
        //设置面板
        gridPane.setMinSize(400, 350);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        //设置面板对齐方式
        gridPane.setAlignment(Pos.CENTER);
        //把定义好的组件依次加入面板，指定其在面板中的行列号
        gridPane.add(welcomeText, 0, 0);
        gridPane.add(pleaseText, 0, 1);
        gridPane.add(drawButton, 0, 2);
        gridPane.add(depositButton, 0, 3);
        gridPane.add(queryButton, 0, 4);
        gridPane.add(quitButton, 0, 5);
        gridPane.setStyle("-fx-background-color: #E1D8F3");
        //给按钮设置背景色，文字颜色
        drawButton.setStyle("-fx-background-color: #E1D8F3;-fx-text-fill: #000000");
        depositButton.setStyle("-fx-background-color: #E1D8F3;-fx-text-fill: #000000");
        queryButton.setStyle("-fx-background-color: #E1D8F3;-fx-text-fill: #000000");
        quitButton.setStyle("-fx-background-color: #E1D8F3;-fx-text-fill: #000000");


        //给点击取款按钮
        drawButton.setOnAction(event -> {
            Stage drawStage = new Stage();
            drawStage.setTitle("取款");
            //垂直布局
            VBox drawVBox = new VBox();
            drawVBox.setAlignment(Pos.CENTER);
            drawVBox.setStyle("-fx-background-color: #E1D8F3; -fx-vgap: 20");
            //文本组件
            Label drawLabel = new Label("请输入取款金额：");
            drawLabel.setStyle("-fx-text-fill: #000000");
            drawVBox.getChildren().add(drawLabel);
            //输入文本框,获取输入值为draw
            TextField drawField = new TextField();
            drawField.setStyle("-fx-max-width: 80px");
            drawVBox.getChildren().add(drawField);
            //按钮组件
            Button drawOkButton = new Button("确定");
            drawOkButton.setStyle("-fx-background-color: #A79DDF;-fx-text-fill: #000000");
            drawVBox.getChildren().add(drawOkButton);
//            drawOkButton.setOnAction(event1 -> {
//                //获取用户输入的数值
//                String draw = drawField.getText();
//                int total = 10000;
//                if (draw <= 10000){
//                    Stage drawOkStage = new Stage();
//                    drawOkStage.setTitle("取款成功！");
//                    total = total - draw;
//                    //文本组件
//                    Label drawOkLabel = new Label("您取了" + draw + "元,当前账户余额为：" + total + "元。");
//                    drawOkLabel.setStyle("-fx-text-fill: #000000;-fx-background-color: #E1D8F3");
//                    drawOkLabel.setAlignment(Pos.CENTER);
//
//                    Scene drawOkScene = new Scene(drawOkLabel,400,350);
//                    drawOkStage.setScene(drawOkScene);
//                    drawOkStage.show();
//
//                }else {
//                    Stage drawFailStage = new Stage();
//                    drawFailStage.setTitle("取款失败！");
//                    //文本组件
//                    Label drawFailLabel = new Label("取款失败！取款金额超出余额，请重新输入。");
//                    drawFailLabel.setStyle("-fx-text-fill: #000000;-fx-background-color: #E1D8F3");
//                    drawFailLabel.setAlignment(Pos.CENTER);
//
//                    Scene drawFailScene = new Scene(drawFailLabel,400,350);
//                    drawFailStage.setScene(drawFailScene);
//                    drawFailStage.show();
//                }
//            });

            Scene drawScene = new Scene(drawVBox, 400, 350);
            drawStage.setScene(drawScene);
            drawStage.show();
        });


        //点击存款按钮
        depositButton.setOnAction(event -> {
            Stage depositStage = new Stage();
            depositStage.setTitle("存款");
            //垂直布局
            VBox depositVBox = new VBox();
            depositVBox.setAlignment(Pos.CENTER);
            depositVBox.setStyle("-fx-background-color: #E1D8F3;-fx-vgap: 20");
            //文本组件
            Label depositLabel = new Label("请输入存款金额：");
            depositLabel.setStyle("-fx-text-fill: #000000");
            depositVBox.getChildren().add(depositLabel);
            //输入文本框,获取输入值为draw
            TextField depositField = new TextField();
            depositField.setStyle("-fx-max-width: 80px");
            depositVBox.getChildren().add(depositField);
            //按钮组件
            Button depositOkButton = new Button("确定");
            depositOkButton.setStyle("-fx-background-color: #A79DDF;-fx-text-fill: #000000");
            depositVBox.getChildren().add(depositOkButton);
//            depositOkButton.setOnAction(event1 -> {
//                Stage depositOkStage = new Stage();
//                depositOkStage.setTitle("存款成功！");
//                //文本组件
//                Label depositOkLabel = new Label("您存了" + draw + "元,当前账户余额为：" + total + "元。");
//                depositOkLabel.setStyle("-fx-text-fill: #000000;-fx-background-color: #E1D8F3");
//                depositOkLabel.setAlignment(Pos.CENTER);
//
//                Scene drawOkScene = new Scene(depositOkLabel,400,350);
//                depositOkStage.setScene(drawOkScene);
//                depositOkStage.show();
//            });
            Scene depositScene = new Scene(depositVBox, 400, 350);
            depositStage.setScene(depositScene);
            depositStage.show();
        });


        //点击查询按钮
        queryButton.setOnAction(event -> {
            Stage queryStage = new Stage();
            queryStage.setTitle("余额查询");
            //文本组件
            Label queryLabel = new Label("当前账户余额为10000元。");
            queryLabel.setStyle("-fx-text-fill: #000000;-fx-background-color: #E1D8F3");
            queryLabel.setAlignment(Pos.CENTER);

            Scene queryScene = new Scene(queryLabel, 400, 350);
            queryStage.setScene(queryScene);
            queryStage.show();
        });

    }
}
