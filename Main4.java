package omkartest;

class Account{
	private long acc_no;
	private String name;
	private float amount;
	int age;
	
	public long getAcc_no() {
		return this.acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no=acc_no;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public float getAmount() {
		return this.amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}
}



public class Main4 {
	public static void main(String[] args) {
		Account obj= new Account();
		obj.age=23;
		obj.setAcc_no(123456789l);
		obj.setAmount(14000f);
		obj.setName("omkar");
	
		
		System.out.print(" acc no is: "+obj.getAcc_no()+"  \n name is: "+obj.getName()+"\n amount: "+obj.getAmount()+"\n age: "+obj.age);
		
				
	}

}
