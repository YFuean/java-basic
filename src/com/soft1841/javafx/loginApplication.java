package com.soft1841.javafx;
        import javafx.application.Application;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.GridPane;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

/**
 * 来自JavaFx的登陆程序
 * 2018.10.17
 */
public class loginApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //创建一个账号的文本对象
                    Text accountText = new Text("请输入账号");
            //创建一个密码的文本对象
            Text passwordText = new Text("请输入密码");
            //创建一个输入账号的文本框
            TextField accoundField = new TextField();
            //创建一个输入密码的文本框
            PasswordField passwordField = new PasswordField();
            //创建一个登陆按钮
            Button loginButton = new Button("登陆");
            //创建一个网格布局面板
            GridPane gridPane = new GridPane();
            //设置面板大小
            gridPane.setMinSize(450, 300);
            //设置面板的内边距
            gridPane.setPadding(new Insets(10, 10, 10, 10));
            //设置垂直间距
            gridPane.setVgap(20);
            //设置水平间距
            gridPane.setHgap(20);
            //设置面板的对齐方式
            gridPane.setAlignment(Pos.CENTER);
            //把定义好的组件依次加入面板，指定其在面板中的行列号
            gridPane.add(accountText, 0, 0);
            gridPane.add(accoundField, 1, 0);
            gridPane.add(passwordText, 0, 1);
            gridPane.add(passwordField, 1, 1);
            gridPane.add(loginButton, 1, 2);

            //样式美化代码


            //给面板加背景色
            gridPane.setStyle("-fx-background-color: #E7BFEA");
            //给按钮设置背景色，文字颜色
            loginButton.setStyle("-fx-background-color: #F3DFF5;-fx-text-fill: #FFFFFF");
            loginButton.setMinSize(100, 40);

            //给登陆按钮设置事件，点击了有反应,使用了Java的Lamdam表达式，简化代码
            EventHandler<MouseEvent> eventEventHandler;
            eventEventHandler = event -> {
                //获取用户输入的账号
                String accountString = accoundField.getText();
                //获取用户输入的密码
                String passwordString = passwordField.getText();
                //判断账号密码是否正确
                if ("soft1841@qq.com".equals(accountString) && "123456".equals(passwordString)) {
                //弹出登录成功的对话框
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("信息提示");
                alert.setContentText("恭喜你，登录成功！");
                alert.showAndWait();
            } else {
                //弹出失败的对话框
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("错误提示");
                alert.setContentText("登录失败，请重新登录！");
                alert.showAndWait();
            }
        };
        //将事件注册给登录按钮,鼠标单价事件
        loginButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventEventHandler);

        //创建一个场景，同时将面板加入场景
        Scene scene = new Scene(gridPane);
        //设置舞台的标题
        primaryStage.setTitle("登陆界面");
        //将场景加入舞台
        primaryStage.setScene(scene);
        //设置舞台内容可见
        primaryStage.show();
    }
}
