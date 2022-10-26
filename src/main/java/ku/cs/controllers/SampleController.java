package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Sample;

public class SampleController {
    @FXML
    private Label nameLabel;

    private Sample sample;

    @FXML
    public void initialize() {
        sample = new Sample("test1", 1);
        showSampleView(sample);

    }

    private void showSampleView(Sample sample){
        nameLabel.setText(sample.getName());
    }
}
