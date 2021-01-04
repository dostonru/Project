package LibraryManagementSystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LibraryController {

    ObservableList<String> userTypes = FXCollections.observableArrayList("Administrator" ,"Student","Librarian");

    @FXML
    private AnchorPane signUpPan;

    @FXML
    private AnchorPane logInPan;

    @FXML
    private ComboBox selectUserSignUp;
    @FXML
    private ComboBox selectUserLogIn;

    @FXML
    private Button logInBtn;
    @FXML
    private Button registerBtn;

    @FXML
    private void initialize()
    {
        selectUserSignUp.setItems(userTypes);
        selectUserLogIn.setItems(userTypes);
    }

    @FXML
    void registerAction(ActionEvent event) throws Exception
    {
        Stage stage = (Stage) registerBtn.getScene().getWindow();
        stage.close();


    }
    @FXML
    void logInAction(ActionEvent event)
    {
        Stage stage = (Stage) registerBtn.getScene().getWindow();
        stage.close();

    }

    @FXML
    void logInShow(ActionEvent event) {
        signUpPan.setVisible(false);
        logInPan.setVisible(true);
    }

    @FXML
    void signUpShow(ActionEvent event) {
        signUpPan.setVisible(true);
        logInPan.setVisible(false);

    }
}