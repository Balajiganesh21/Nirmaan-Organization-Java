package Employee1;


class Employee{
	private String name;
	
	private long phoneNo;
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	public  String getName() {
		return name;
    }

	 
}
public class ex1 {
	public static void main(String[] args) {
		
		Employee em = new Employee();
		
		em.setName("loki");
		em.setPhone(1234567);
		
		System.out.println("Employee name:"+ em.getName());
		System.out.println("Employee phoneNo: " +em.getPhoneNo());
		
	}

}