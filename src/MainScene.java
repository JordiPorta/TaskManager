import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainScene {

    @FXML
    private Button Addbtn;

    @FXML
    private Label DesLabel;

    @FXML
    private TextArea DescFX;

    @FXML
    private DatePicker FinalDateFX;

    @FXML
    private Label FinalHLa;

    @FXML
    private DatePicker InicialDateFX;

    @FXML
    private Label InicialHLa;

    @FXML
    private Label NewTaskL;

    @FXML
    private TextField TitleFX;

    private List<task> tasks;

    @FXML
    void btnCreateClicked(ActionEvent event) {
        DescFX.setVisible(true);
        FinalDateFX.setVisible(true);
        InicialDateFX.setVisible(true);
        TitleFX.setVisible(true);
        Addbtn.setVisible(true);
        // Hide labels
        DesLabel.setVisible(true);
        FinalHLa.setVisible(true);
        InicialHLa.setVisible(true);
        NewTaskL.setVisible(true);
    }

        public void initialize() {
            // Hide inputs
            DescFX.setVisible(false);
            FinalDateFX.setVisible(false);
            InicialDateFX.setVisible(false);
            TitleFX.setVisible(false);
            Addbtn.setVisible(false);
            // Hide labels
            DesLabel.setVisible(false);
            FinalHLa.setVisible(false);
            InicialHLa.setVisible(false);
            NewTaskL.setVisible(false);

            //inicialize list
            tasks = new ArrayList<>();
        }

        @FXML
        void btnAddClicked(ActionEvent event) {
    
            String title = TitleFX.getText();
            String description = DescFX.getText();
            LocalDate initialDate = InicialDateFX.getValue();
            LocalDate finalDate = FinalDateFX.getValue();
            System.out.println("Título: " + title + ", Descripción: " + description + ", Fecha inicial: " + initialDate + ", Fecha final: " + finalDate);
            if (title.isEmpty() || description.isEmpty() || initialDate == null || finalDate == null){
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Campos  vacios");
                alerta.setHeaderText("Tienes campos vacíos");
                alerta.show();
            }
            else{
                tasks.add(new task(description,title,initialDate,finalDate));
                
                DescFX.setVisible(false);
                FinalDateFX.setVisible(false);
                InicialDateFX.setVisible(false);
                TitleFX.setVisible(false);
                Addbtn.setVisible(false);
                // Hide labels
                DesLabel.setVisible(false);
                FinalHLa.setVisible(false);
                InicialHLa.setVisible(false);
                NewTaskL.setVisible(false);
            }
        }

}