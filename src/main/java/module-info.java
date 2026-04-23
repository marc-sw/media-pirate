module com.marcsw.mediapirate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.marcsw.mediapirate to javafx.fxml;
    opens com.marcsw.mediapirate.controller to javafx.fxml;
    exports com.marcsw.mediapirate;
    exports com.marcsw.mediapirate.controller;
}