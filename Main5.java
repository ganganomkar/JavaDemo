package omkartest;


interface marks12{
	
    void phy(int phy);
	void chem(int chem);
	void maths(int maths);
	
}

interface marks10{

	void lang(int lang);
	void eng(int eng);
	void ss(int ss);
}

class Students implements marks12, marks10{
	public void phy(int phy) {
		System.out.println("phy "+phy);
	}
	public void chem(int chem) {
		System.out.println("chem "+chem);
	}
	public void maths(int maths) {
		System.out.println("maths "+maths);
	}
	public void lang(int lang) {
		System.out.println("lang "+ lang);
	}
	public void eng(int eng) {
		System.out.println("eng "+ eng);
	}
	public void ss(int ss) {
		System.out.println("ss "+ ss);
	}
	
}

public class Main5{
	public static void main(String[] args) {
		Students st= new Students();
		st.phy(91);
		st.chem(92);
		st.maths(93);
		st.lang(94);
		st.eng(95);
		st.ss(96);
		
	
	}
}







