package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.ControllerCustomer;
import ValueObject.Customer;

public class ViewCustomer {
	static Scanner sc = new Scanner(System.in);
	static ControllerCustomer ccust = new ControllerCustomer();

	public static void main(String[] args) {
		ArrayList<Customer> listCust = new ArrayList<>();

		boolean is = true;
		do {
			Table();
			System.out.print("Moi ban nhap lua chon : ");
			int lc = Integer.parseInt(sc.nextLine());

			switch (lc) {
			case 1: {
				Input(listCust);
				is = true;
				break;
			}
			case 2: {
				Insert(listCust);
				is = true;
				break;
			}
			case 3: {
				Output();
				is = true;
				break;
			}
			case 4: {
				is = true;
				break;
			}
			case 5: {
				is = true;
				break;
			}
			case 6: {
				System.out.println("Ban da thoat chuong trinh");
				is = false;
				break;
			}

			}

		} while (is);

	}

	public static void Input(ArrayList<Customer> listCust) {
		System.out.println("Moi ban nhap so luong khach hang :");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Thong tin khach hang so " +(1+i));
			Customer cust = new Customer();
			System.out.print("Nhap Id : ");
			cust.setId(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhap Ho Ten : ");
			cust.setHoTen(sc.nextLine());
			System.out.print("Nhap SDT : ");
			cust.setSdt(sc.nextLine());
			System.out.print("Nhap Email : ");
			cust.setEmail(sc.nextLine());
			System.out.print("Nhap Dia Chi : ");
			cust.setDiaChi(sc.nextLine());
			listCust.add(cust);
		}
		System.out.println("Da nhap xong thong tin khach hang");
	}

	public static void Insert(ArrayList<Customer> listCust) {
		System.out.println("Ban muon luu vao CSDL ?");
		System.out.println("1.JSon  2. Serialicable   3. XML ");
		int iValue = Integer.parseInt(sc.nextLine());
		if (iValue == 1) {
			System.out.println("Da luu khach hang thanh cong");

		} else if (iValue == 2) {
			try {
				if (ccust.SerializableOutputData(listCust, "Customer.DAT")) {
					System.out.println("Ghi thanh cong");
				}

			} catch (

			Exception e) {
				System.out.println("Ghi that bai!!!");
				e.printStackTrace();
			}

		} else if (iValue == 3) {
			System.out.println("Da luu khach hang thanh cong");
		}

	}


	public static void OutputSerializable() {

		List<Customer> listCust = new ArrayList<>();
		try {
			listCust = ccust.SerializableInputData("Customer.DAT");
			PrintInfo(listCust);
			System.out.println();
		} catch (Exception e) {
			System.out.println("Doc thatt bai");
		}
	}

	static void PrintInfo(List<Customer> listCust) {
		
		System.out.println("Danh sach khach hang ");
		System.out.printf("%s%20s%15s%20s%20s", "Id", "Ho Ten", "SDT", "Email", "Dia Chi");
		System.out.println();
		for (Customer obj : listCust) {
			System.out.printf("%d%20s%15s%20s%20s", obj.getId(), obj.getHoTen(), obj.getSdt(), obj.getEmail(),
					obj.getDiaChi());
			System.out.println();
			
		}
		
	}

	public static void Output() {
		System.out.println("Ban muon hien thi danh sach tu ");
		System.out.println("1.JSon  2. Serialicable   3. XML ");
		int iValue = Integer.parseInt(sc.nextLine());
		if (iValue == 1) {

		} else if (iValue == 2) {
			OutputSerializable();

		} else if (iValue == 3) {

		}
	}

	public static void Table() {
		System.out.println("-----------MENU-------------");
		System.out.println("1.Nhap n khach hang ");
		System.out.println("2.Luu khach hang vao CSDL");
		System.out.println("3.Hien thi khach hang tu CSDL");
		System.out.println("4.Thay doi thong tin khach hang");
		System.out.println("5.Xoa thong tin khach hang");
		System.out.println("6.Thoat chuong trinh");
	}

}
