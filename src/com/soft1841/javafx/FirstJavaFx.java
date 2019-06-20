package com.soft1841.javafx;
/**
 * 第一个JavaFx应用
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class FirstJavaFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("第一个JavaFx的应用");
        Button button = new Button("按钮");
        ///将组件加入场景
        Scene scene = new Scene (button,600,400);
        //将场景加入舞台
        primaryStage.setScene(scene);
        //展现舞台
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
