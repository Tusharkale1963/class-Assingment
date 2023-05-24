package Com.Assignment_3;

public class Assignment3 {
	public String  getStudentName (String name) {
		
		System.out.println("your name  is = "+name);
		return name ;
	}
	
	public static void main(String[] args) {
		Assignment3 obj=new Assignment3();
		String name1= "Tushar kale" ;
		String name3=obj.getStudentName( name1); 
//System.out.println("your name  is = "+name3);
	}

}
