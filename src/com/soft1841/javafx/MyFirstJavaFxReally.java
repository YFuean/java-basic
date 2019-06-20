package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;



public class MyFirstJavaFxReally extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width + " " + screenSize.height + " ");

        primaryStage.setTitle("My First Javafx Application");

        //创建一个边界布局，上下左右中
        BorderPane borderPane = new BorderPane();
        //给外层边界布局设置背景图
        BackgroundImage background2 = new BackgroundImage(
                new Image("img/background2.png",
                        screenSize.width,
                        screenSize.height,
                        false,
                        true),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        //背景图设置给边界布局
        borderPane.setBackground(new Background(background2));


        //创建一个垂直布局，放在边界布局左部
        VBox vBox = new VBox();
        //设置垂直布局和窗体间的距离
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        //创建一个label组件，放垂直布局中部
        Label label1 = new Label("通讯录————");
        label1.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 20px;");
        vBox.getChildren().add(label1);
        //创建一个组件image，放在垂直布局下部
        Image me2 = new Image("img/me2.png");
        ImageView imageViewM2 = new ImageView(me2);
        vBox.getChildren().add(imageViewM2);
        //把垂直布局放在边界布局左边
        borderPane.setLeft(vBox);


        //创建一个水平布局,在边界布局上部
        HBox hBox = new HBox();
        //把水平布局放入边界布局上部
        borderPane.setTop(hBox);
        //设置水平布局和窗体之间的距离
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(20, 20, 20, 20));
        //创一个组件image，放水平布局前部
        Image me1 = new Image("img/me1.jpg");
        ImageView imageViewMe1 = new ImageView(me1);
        hBox.getChildren().add(imageViewMe1);
        //创建一个label2组件,放在水平布局中间
        Label label2 = new Label("我爱学习");
        label2.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 20px;");
        hBox.getChildren().add(label2);

        //创建按钮组件四个按钮
        Button button1 = new Button("纪念");
        button1.setStyle("-fx-background-color: #6BCECD;-fx-text-fill: #FFFFFF;" +
                "-fx-min-width: 120px;-fx-min-height: 35px;");
        //把按钮加入水平布局
        hBox.getChildren().add(button1);
        button1.setOnAction(event -> {
            //创建第一个子舞台
            Stage stage1 = new Stage();
            stage1.setTitle("纪念");
            //创建label,放边界布局上部
            Label label4 = new Label("————放点老照片，纪念我和老铁————");
            label4.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 30px;");
            VBox vBox2 = new VBox();
            vBox2.getChildren().add(label4);
            vBox2.setStyle("-fx-background-color: #6BCECD");
            //创建网格布局
            GridPane gridPane = new GridPane();
            gridPane.setHgap(20);
            gridPane.setVgap(20);
            gridPane.setPadding(new Insets(40, 20, 20, 20));
            vBox2.getChildren().add(gridPane);
            int count = 1;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {

                    Image image = new Image("img/memory" + count + ".jpg");

                    ImageView imageView = new ImageView(image);
                    gridPane.add(imageView, j, i);
                    count++;
                }
            }
            //创建场景，并将边界布局加入场景
            Scene scene = new Scene(vBox2, 1500, 650);
            //将场景加入当前舞台
            stage1.setScene(scene);
            //设置舞台可见
            stage1.show();
        });

        Button button2 = new Button("牌友");
        button2.setStyle("-fx-background-color: #6BCECD;-fx-text-fill: #FFFFFF;" +
                "-fx-min-width: 120px;-fx-min-height: 35px;");
        //把按钮加入水平布局
        hBox.getChildren().add(button2);
        button2.setOnAction(event -> {
            //创建第二个子舞台
            Stage stage2 = new Stage();
            stage2.setTitle("牌友");
            //创建垂直布局
            VBox vBox3 = new VBox();
            //创建label,放边界布局上部
            Label label5 = new Label("——爷爷奶奶一把屎一把尿教会我和小老弟斗地主、打麻将，" +
                    "以便随时随地凑成一桌——————");
            label5.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 20px;");
            vBox3.getChildren().add(label5);
            vBox3.setStyle("-fx-background-color: #6BCECD;" + "-fx-font-size: 20px;");
            //设置垂直布局和窗体间的距离
            vBox3.setSpacing(20);
            vBox3.setPadding(new Insets(20, 20, 20, 20));

            //创建水平布局，水平布局放在垂直布局下面
            HBox hBox1 = new HBox();
            vBox3.getChildren().add(hBox1);

            Image image1 = new Image("img/grand1.jpg");
            ImageView imageView1 = new ImageView(image1);
            hBox1.getChildren().add(imageView1);

            Image image2 = new Image("img/grand2.jpg");
            ImageView imageView2 = new ImageView(image2);
            hBox1.getChildren().add(imageView2);

            Image image3 = new Image("img/grand3.jpg");
            ImageView imageView3 = new ImageView(image3);
            hBox1.getChildren().add(imageView3);

            //创建场景，并将边界布局加入场景
            Scene scene = new Scene(vBox3, 1000, 600);
            //将场景加入当前舞台
            stage2.setScene(scene);
            //设置舞台可见
            stage2.show();
        });

        Button button3 = new Button("虚位以待");
        button3.setStyle("-fx-background-color: #6BCECD;-fx-text-fill: #FFFFFF;" +
                "-fx-min-width: 120px;-fx-min-height: 35px;");
        //把按钮加入水平布局
        hBox.getChildren().add(button3);
        button3.setOnAction(event -> {
            //创建第3个子舞台
            Stage stage3 = new Stage();
            stage3.setTitle("虚位以待");
            //创建label,放边界布局上部
            Label label6  = new Label("很遗憾，没有爸妈的照片，这个地方留给他们。。。");
            label6.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 50px;");
            label6.setStyle("-fx-background-color: #6BCECD");

            //创建场景，并将边界布局加入场景
            Scene scene = new Scene(label6, 600, 400);
            //将场景加入当前舞台
            stage3.setScene(scene);
            //设置舞台可见
            stage3.show();
        });

        Button button4 = new Button("蓝盆友");
        button4.setStyle("-fx-background-color: #6BCECD;-fx-text-fill: #FFFFFF;" +
                "-fx-min-width: 120px;-fx-min-height: 35px;");
        //把按钮加入水平布局
        hBox.getChildren().add(button4);
        button4.setOnAction(event -> {
            //创建第4个子舞台
            Stage stage4 = new Stage();
            stage4.setTitle("蓝盆友");
            //创建一个垂直布局
            VBox vBox5 = new VBox();
            vBox5.setStyle("-fx-background-color: #6BCECD; -fx-font-size: 20px");
            //设置垂直布局和窗体间的距离
            vBox5.setSpacing(20);
            vBox5.setPadding(new Insets(20, 20, 20, 20));

            //创建label,放垂直布局上部
            Label label7  = new Label("您查找的用户不存在！");
            label7.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 50px;");
            vBox5.getChildren().add(label7);
            //创建label,放在垂直布局中部
            Label label8  = new Label("（假装）来自人工智能的安慰：");
            label8.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 50px;");
            vBox5.getChildren().add(label8);
            //创建image，放在垂直布局下部
            Image image = new Image("img/enjoy1.jpg");
            ImageView imageView = new ImageView(image);
            vBox5.getChildren().add(imageView);

            //创建场景，并将边界布局加入场景
            Scene scene = new Scene(vBox5, 800, 600);
            //将场景加入当前舞台
            stage4.setScene(scene);
            //设置舞台可见
            stage4.show();
        });



        //创建另一个垂直布局，把垂直布局放在边界布局中部
        VBox vBox1 = new VBox();
        //设置垂直布局和窗体间距离
        vBox1.setSpacing(20);
        vBox1.setPadding(new Insets(20,20,20,20));
        //创建一个label，加入垂直布局上部
        Label label3 = new Label("假装老铁来消息————");
        label3.setStyle("-fx-text-fill: #000000;" + "-fx-font-size: 20px;");
        vBox1.getChildren().add(label3);
        //创建一个组件image，放在垂直布局下部
        Image me3 = new Image("img/me3.jpg");
        ImageView imageViewM3 =new ImageView(me3);
        vBox1.getChildren().add(imageViewM3);
        //把垂直布局放在边界布局中部
        borderPane.setCenter(vBox1);


        //创建场景，并将边界布局加入场景
        Scene scene = new Scene(borderPane,1500,650);
        //将场景加入当前舞台
        primaryStage.setScene(scene);
        //设置舞台可见
        primaryStage.show();
    }
    public static void main(String[] args) { Application.launch(args); }
}
