module com.mycompany.examenfxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.examenfxml to javafx.fxml;
    exports com.mycompany.examenfxml;
}
