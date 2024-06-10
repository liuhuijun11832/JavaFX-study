module org.hoey.javafxstudy {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hoey.javafxstudy to javafx.fxml;
    exports org.hoey.javafxstudy;
}