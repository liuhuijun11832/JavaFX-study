package org.hoey.javafxstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {


    @FXML
    public TextArea helloTextArea;

    @FXML
    protected void onHelloButtonClick() {
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Map<String, String> map = new HashMap<>();
            map.put(String.valueOf(i), String.valueOf(i));
            list.add(map);
        }
        helloTextArea.setText(list.toString());
    }
}