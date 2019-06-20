package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;


/**
 * 仿制火萤酱
 */
public class HuoYingJiang extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width + " " + screenSize.height + " ");

        primaryStage.setTitle("三行情书");
        //创建一个边界布局，上下左右中
        BorderPane borderPane = new BorderPane();

        //给外层边界布局设置背景图
        BackgroundImage background1 = new BackgroundImage(
                new Image("img/backgroundmoe.jpg",
                        screenSize.width,
                        screenSize.height,
                        false,
                        true),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        //背景图设置给边界布局
        borderPane.setBackground(new Background(background1));

        //创建一个水平布局
        HBox hBox = new HBox();
        //设置水平布局中间的各个组件之间的距离
        hBox.setSpacing(20);
        //设置水平布局和窗体之间的距离
        hBox.setPadding(new Insets(20,20,20,20));

        //创建一个网格布局
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20,20,20,50));
        //将网格布局加入边界布局中部
        borderPane.setCenter(gridPane);


        String[] buttonNames = {
                "本地资源","在线资源","我的","最新发布","风格"

        };
        //开始循环，创建若干按钮，并设置样式，添加到水平布局中
        for (int i = 0; i < buttonNames.length; i++){
            //循环创建按钮，并将buttonNames数组中的元素作为按钮文字
            Button button = new Button(buttonNames[i]);
            //给按钮设置样式
            button.setStyle("-fx-background-color: #E4CCAE;" + "-fx-min-width: 80px;-fx-min-height: 35px;");
            //把按钮加入水平布局
            hBox.getChildren().add(button);
        }

        //水平布局增加其他元素
        Button setBtn = new Button("设置");
        setBtn.setStyle("-fx-background-color: #B88341;" + "-fx-text-fill: #F1E4D4;" +
                "-fx-min-width: 120px;-fx-min-height: 35px;");
        hBox.getChildren().add(setBtn);
        setBtn.setOnAction(event -> {
            //创建新的舞台窗口
            Stage secondStage = new Stage();
            Label label = new Label("别看了，没啥！！");
            label.setStyle("-fx-text-fill: #C99C63;" +
                    "-fx-font-size: 30px;");
            Scene secondScene = new Scene(label,400,300);
            secondStage.setScene(secondScene);
            secondStage.show();
        });


        //将水平布局对象加入边界布局的顶部
        borderPane.setTop(hBox);

        //开始处理
        int count = 1;
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 3; j++){
                Image image = new Image(new FileInputStream("resources/img/moe" + count + ".jpg"));
                ImageView imageView = new ImageView(image);
                gridPane.add(imageView,j,i);
                count++;
            }
        }


        //创建场景，并将边界布局加入场景
        Scene scene = new Scene(borderPane,800,500);
        //将场景加入当前舞台
        primaryStage.setScene(scene);
        //设置舞台可见
        primaryStage.show();
        //加入一个日期
        DatePicker datePicker = new DatePicker();
        hBox.getChildren().add(datePicker);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
