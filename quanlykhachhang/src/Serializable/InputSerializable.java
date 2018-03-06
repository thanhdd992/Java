package Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ValueObject.Customer;

public class InputSerializable {

	public static List<Customer> ReadListObjectIntoFiles(String fileName) throws Exception {
		List<Customer> listCust = null;
		try {
			File objFile = new File(fileName);
			ObjectInputStream objObjectIn = new ObjectInputStream(new FileInputStream(objFile));
			listCust = new ArrayList<Customer>();
			listCust = (List<Customer>) objObjectIn.readObject();
		} catch (Exception e) {
			throw e;
		}
		return listCust;
	}

}
