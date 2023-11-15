package com.example.portfoliodemo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StudentPortfolioController {
    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView imageView3;
    @FXML
    private Label descriptionLabel1;
    @FXML
    private Label descriptionLabel2;
    @FXML
    private Label descriptionLabel3;

    @FXML
    private Label titleLabel1;
    @FXML
    private Label titleLabel2;
    @FXML
    private Label titleLabel3;
    // ...

    public void initialize() {
        // Load images using resource paths
        Image image1 = new Image(getClass().getResourceAsStream("/com/example/portfoliodemo1/sample1.jpg"));
        Image image2 = new Image(getClass().getResourceAsStream("/com/example/portfoliodemo1/sample2.jpg"));
        Image image3 = new Image(getClass().getResourceAsStream("/com/example/portfoliodemo1/sample3.jpg"));

        // Set the images to ImageView components
        imageView1.setImage(image1);
        imageView2.setImage(image2);
        imageView3.setImage(image3);


        // Set titles and descriptions
        setTitleLabel(titleLabel1, "ACM Artistry");
        setTitleLabel(titleLabel2, "Nature");
        setTitleLabel(titleLabel3, "Person");

        setDescriptionLabel(descriptionLabel1, "This is an exercise from LBYCPEI");
        setDescriptionLabel(descriptionLabel2, "Description 2");
        setDescriptionLabel(descriptionLabel3, "Description 3");
    }

    public void setTitleLabel(Label label, String title) {
        if (label != null) {
            label.setText(title);
        }
    }

    public void setDescriptionLabel(Label label, String description) {
        if (label != null) {
            label.setText(description);
        }
    }

}
