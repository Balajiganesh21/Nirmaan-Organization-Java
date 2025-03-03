package simpleEmployee;

import java.util.*;

class Employee1{
	private int id;
	private String name;
	private long phoneNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Employee1 [id= " + id + ", name= " + name + ", phoneNo= " + phoneNo + "]";
	}
	
	
}

public class simpleEmpl {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee1 emp1 = new Employee1();
		while(true) {
		System.out.println("Enter 1 for add employee");
		System.out.println("Enter 2 for show employee");
		int key = sc.nextInt();
		
		switch(key) {
		case 1:
			System.out.println("Enter the employee id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the employee name");
			String name = sc.nextLine();
			System.out.println("Enter the employee phoneNO");
			long  phoneNo = sc.nextLong();
			emp1.setId(id);
			emp1.setName(name);
			emp1.setPhoneNo(phoneNo);
			break;
		case 2:
			System.out.println(emp1);
			break;
			
		}
	
		}
	}

}
