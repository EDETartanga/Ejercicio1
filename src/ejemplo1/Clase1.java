package ejemplo1;

public class Clase1 {

	
	private String atrib1;
	private String atrib2;
	
	
	
	//***** constructor
	public Clase1(String atrib1, String atrib2) {
		super();
		this.atrib1 = atrib1;
		this.atrib2 = atrib2;
	}
	
	
	public Clase1() {
		super();
		this.atrib1 = "";
		this.atrib2 = "";
	}

	//******* getter & setter
	public String getAtrib1() {
		return atrib1;
	}


	public void setAtrib1(String atrib1) {
		this.atrib1 = atrib1;
	}


	public String getAtrib2() {
		return atrib2;
	}


	public void setAtrib2(String atrib2) {
		this.atrib2 = atrib2;
	}

	//*************** toString
	@Override
	public String toString() {
		return "Clase1 [atrib1=" + atrib1 + ", atrib2=" + atrib2 + "]";
	}
	
	
	
	
	
}
