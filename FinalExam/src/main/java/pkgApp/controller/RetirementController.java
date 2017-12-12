package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtSaveEachMonth;
	@FXML
	private TextField txtYearsToWork;
	@FXML
	private TextField txtAnnualReturnWorking;
	@FXML
	private TextField txtWhatYouNeedToSave;
	@FXML
	private TextField txtYearsRetired;
	@FXML
	private TextField txtAnnualReturnRetired;
	@FXML
	private TextField txtRequiredIncome;
	@FXML
	private TextField txtMonthlySSI;
	
	private boolean ClearClicked = false;
	private boolean CalculateClicked = false;
	

	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	
	public boolean isClearClicked() {
        return ClearClicked;
    }
	
	@FXML
	public void btnClear(ActionEvent event) {
		txtSaveEachMonth.setText("");
		txtYearsToWork.setText("");
		txtAnnualReturnWorking.setText("");
		txtWhatYouNeedToSave.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturnRetired.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		
		ClearClicked = true;
		System.out.println("Clear pressed");
		
		
	}
	
	public boolean isCalculateClicked() {
        return CalculateClicked;
    }
	
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		if (isInputValid()) {
		txtSaveEachMonth.setText(Double.toString(Retirement.AmountToSave()));
		txtWhatYouNeedToSave.setText(Double.toString(Retirement.TotalAmountSaved()));
		CalculateClicked = true;
		
	}}
	
	private boolean isInputValid() {
        String errorMessage = "";
        
        if (errorMessage.length() == 0) {
            return true;
        } else {
        	
        	  Alert alert = new Alert(AlertType.ERROR);
        	  alert.setContentText(errorMessage);

        if (txtYearsToWork.getText() == null || txtYearsToWork.getText().length() == 0) {
            errorMessage += "Insert Years to Work";
            }
            else {
                try {
                    Integer.parseInt(txtYearsToWork.getText());
                } catch (NumberFormatException e) {
                    errorMessage += "Years to Work must be an integer"; 
                }
            }
        
        
        if (txtAnnualReturnWorking.getText() == null || txtAnnualReturnWorking.getText().length() == 0) {
            errorMessage += "Insert Annual Return"; 
        }
        else {
            try {
                Integer.parseInt(txtAnnualReturnWorking.getText());
            } catch (NumberFormatException e) {
                errorMessage += "AnnualReturn Working must be an integer"; 
            }
        }
        
        if (txtYearsRetired.getText() == null || txtYearsRetired.getText().length() == 0) {
            errorMessage += "Insert Years Retired"; 
        }
        else {
            try {
                Integer.parseInt(txtYearsRetired.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Years Retired must be an integer"; 
            }
        }
        

        if (txtAnnualReturnRetired.getText() == null || txtAnnualReturnRetired.getText().length() == 0) {
            errorMessage += "Insert Annual Return"; 
        }
        
        else {
            try {
                Integer.parseInt(txtAnnualReturnRetired.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Annual Return must be an integer"; 
            }
        }
        if (txtRequiredIncome.getText() == null || txtRequiredIncome.getText().length() == 0) {
            errorMessage += "Insert Required Income"; 
        }
        else {
            try {
                Integer.parseInt(txtRequiredIncome.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Required Income must be an integer"; 
            }
        }
        
        if (txtMonthlySSI.getText() == null || txtMonthlySSI.getText().length() == 0) {
            errorMessage += "Insert Monthly SSI"; 
        }
        else {
            try {
                Integer.parseInt(txtMonthlySSI.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Monthly SSI must be an integer"; 
            }
        }
        }
		return false;
        


	
}}
