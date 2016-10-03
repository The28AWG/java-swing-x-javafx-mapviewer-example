package io.github.the28awg.example;/**
 * Copyright (c) 2016 Ruslan Gabdrafikov <the28awg@gmail.com>
 * You may obtain a copy of the License at LICENSE.txt
 * <p>
 * Created by The28AWG on 04.10.16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class JavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("JavaFX");
        WebView webView = new WebView();
        Scene scene = new Scene(webView);
        stage.setScene(scene);
        webView.getEngine().load(Swing.class.getResource("/html/map.html").toExternalForm());
        stage.show();
    }
}
