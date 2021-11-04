package cl.test.models;

public class Order {
	public String id;
	public String name;
	public String tel;
	public String a;
	public String b;
	public String c;
	public String d;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public Order(String id, String name, String tel, String a, String b, String c, String d) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
}
