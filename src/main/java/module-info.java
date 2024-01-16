module sn.dev.parainageapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens sn.dev.parainageapp to javafx.fxml;
    exports sn.dev.parainageapp;
    exports sn.dev.parainageapp.controllers;
    opens sn.dev.parainageapp.controllers to javafx.fxml;
}