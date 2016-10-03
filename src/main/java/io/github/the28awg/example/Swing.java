package io.github.the28awg.example;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

/**
 * Copyright (c) 2016 Ruslan Gabdrafikov <the28awg@gmail.com>
 * You may obtain a copy of the License at LICENSE.txt
 * <p>
 * Created by The28AWG on 04.10.16.
 */

public class Swing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 640));
        frame.pack();
        frame.setLocationRelativeTo(null);
        JFXPanel jfxPanel = new JFXPanel();
        frame.add(jfxPanel);
        frame.pack();
        frame.setVisible(true);
        Platform.runLater(() -> {
            WebView webView = new WebView();
            Scene scene = new Scene(webView);
            jfxPanel.setScene(scene);
            webView.getEngine().load(Swing.class.getResource("/html/map.html").toExternalForm());
        });
    }

}
