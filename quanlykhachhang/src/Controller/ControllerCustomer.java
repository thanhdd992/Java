package Controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import Model.BaseData;
import Model.ModelCustomer;
import ValueObject.Customer;

public class ControllerCustomer  {
	
	ModelCustomer mcust;

	public ControllerCustomer() {
		mcust= new ModelCustomer();
	}

	public ArrayList<Customer> getAll() {
		return BaseData.BaseDataCustomer();
	}

	public List<Customer> SerializableInputData( String fileName) throws Exception {
		return mcust.SerializableInput(fileName);
	}
	public boolean SerializableOutputData(ArrayList<Customer> listCust, String fileName) throws Exception {
		return mcust.SerializableOutput(listCust, fileName);
	}

	public boolean UpdateData(ArrayList<Customer> listCust, Customer cust) {
		return mcust.Update(listCust, cust);
	}

	public boolean DeleteDataById(ArrayList<Customer> listCust, int Id) {
		return mcust.Delete(listCust, Id);
	}

	public boolean IsExit(ArrayList<Customer> listCust, int Id) {
		for (int i = 0; i < listCust.size(); i++) {
			if(listCust.get(i).getId()==Id) {
				return true;
			}
		}
		return false;
	}

	public boolean RelapceData(ArrayList<Customer> listCust, Customer cust) {
		for (int i = 0; i < listCust.size(); i++) {
			if(listCust.get(i).getId()==cust.getId()) {
				listCust.remove(i);
				listCust.add(cust);
				return true;
			}
		}
		return false;
	}


}
