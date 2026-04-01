module org.example.studentmanager_fis {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studentmanager_fis to javafx.fxml;
    exports org.example.studentmanager_fis;
}