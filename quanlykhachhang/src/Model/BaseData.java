package Model;

import java.util.ArrayList;

import ValueObject.Customer;

public class BaseData {
	public static ArrayList<Customer> BaseDataCustomer() {
		ArrayList<Customer> listCust= new ArrayList<>();
		Customer cust= new Customer();
		cust.setId(10);
		cust.setHoTen("Nguyen Van A");
		cust.setSdt("091123345");
		cust.setEmail("anv@gmail.com");
		cust.setDiaChi("Thanh Hoa");
		Customer cust1= new Customer();
		cust1.setId(30);
		cust1.setHoTen("Tran Van B");
		cust1.setSdt("0911889887");
		cust1.setEmail("btv@gmail.com");
		cust1.setDiaChi("Tp Ho Chi Minh");
		Customer cust2= new Customer();
		cust2.setId(20);
		cust2.setHoTen("Le Van C");
		cust2.setSdt("091124675");
		cust2.setEmail("clv@gmail.com");
		cust2.setDiaChi("Ha Noi");
		listCust.add(cust);
		listCust.add(cust1);
		listCust.add(cust2);

		return listCust;
		
	}
	

}
