package Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import ValueObject.Customer;


public class OutputSerializable {
	 
    public boolean WriteListObjectOuttoFiles(List<Customer> listCust, 
    												String fileName)
            throws Exception {
        try {     
            File objFile = new File(fileName);
            FileOutputStream objOutFile = new FileOutputStream(objFile);
            ObjectOutputStream objOoS = new ObjectOutputStream(objOutFile);
            objOoS.writeObject(listCust);           
            objOoS.flush();           
        } catch (Exception e) {
            throw e;
        }return true;
    } 

}
