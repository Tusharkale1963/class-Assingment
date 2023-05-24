package Com.Assignment_8;

public class MainClass {

	public static void main(String[] args) {
		EmployeeInformation obj=new EmployeeInformation();
		EmployeeInformation obj1=new EmployeeInformation();
		
obj.setFirstName("tushar");
obj.setLastName("kale");
obj.setMobileNumber(9012797104l);
obj.setCity("Nagpur");
System.out.println(obj.getFirstName());
System.out.println(obj.getLastName());
System.out.println(obj.getMobileNumber());
System.out.println(obj.getCity());
System.out.println(obj.getCountry());
obj1.setFirstName("Vipul");
obj1.setLastName("Borkar");
obj1.setMobileNumber(9012795464l);
obj1.setCity("Sindevahi");
System.out.println("================================");
System.out.println(obj1.getFirstName());
System.out.println(obj1.getLastName());
System.out.println(obj1.getMobileNumber());
System.out.println(obj1.getCity());
System.out.println(obj1.getCountry());
	}

}
