package Com.Assgment_10;

import java.util.Scanner;

public class Policy {
	private int Id;
	private String Name;
	private String policyType;
	private double premiumAmount;

	
	 // create method and return object 
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getPolicyType() {
		return policyType;
	}


	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}


	public double getPremiumAmount() {
		return premiumAmount;
	}


	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}


	public Policy getPolicyDetails() {  // returen policy karaychi ahe 
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Enter Id => ");
		Id=sc.nextInt();
		
		System.out.println("Enter your name ==> ");
		Name=sc.next();
		
		System.out.println("Enter policytype => ");
		policyType=sc.next();
		
		System.out.println("Enter premiumAmount => ");
		premiumAmount=sc.nextDouble();
	
		
		 
		Policy obj=new Policy(); // object banavala 
		obj.setId(Id); // set method ahe 
		obj.setName(Name);
		obj.setPolicyType(policyType);
		obj.setPremiumAmount(premiumAmount);
		return obj;     //return obj kela 
		
		
	}
	
	public String toString() {
	return "Policy Detail => [id=" + Id + ", policyName=" + Name +
	", policyType=" + policyType + ", premiumAmount="
	+ premiumAmount + "]";
	}


}
