package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import Serializable.InputSerializable;
import Serializable.OutputSerializable;
import ValueObject.Customer;

public class ModelCustomer {
	ArrayList<Customer> listCust;
	InputSerializable in = new InputSerializable();
	OutputSerializable out = new OutputSerializable();

	public ModelCustomer( ) {
		listCust= new ArrayList<>();
	}
	public List<Customer> SerializableInput( String fileName) throws Exception {
	
		return in.ReadListObjectIntoFiles(fileName);
	}
	
	public boolean SerializableOutput(ArrayList<Customer> listCust, String fileName) throws Exception {
        return out.WriteListObjectOuttoFiles(listCust, fileName);
	}
	

	public boolean Delete(ArrayList<Customer> listCust, int Id) {
		for (int i = 0; i < listCust.size(); i++) {
			if(listCust.get(i).getId()==Id) {
				listCust.remove(i);
				return true;
			}
		}
		return false;
	}

	
	public boolean Update(ArrayList<Customer> listCust, Customer cust) {
		for (int i = 0; i < listCust.size(); i++) {
			if(listCust.get(i).getId()==cust.getId()) {
				listCust.remove(i);
				listCust.add(cust);
				return true;
			}
		}
		
		
		return false;
	}

	
	public boolean Sort(ArrayList<Customer> listCust, Object obj) {
		return false;
	}

}
