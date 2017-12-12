package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
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
		
		txtSaveEachMonth.setText(Double.toString(Retirement.AmountToSave()));
		txtWhatYouNeedToSave.setText(Double.toString(Retirement.TotalAmountSaved()));
		
		CalculateClicked = true;
		
		
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
