package bean;

import javax.xml.bind.annotation.*;

@XmlType(propOrder={"sid", "name", "credit_taken", "credit_graduate", "credit_taking"})
public class StudentBean {

	private String sid;
	private String name;
	private int credit_taken;
	private int credit_graduate;
	private int credit_taking;
	
	public StudentBean() {
		
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit_taken() {
		return credit_taken;
	}

	public void setCredit_taken(int credit_taken) {
		this.credit_taken = credit_taken;
	}
	
	public int getCredit_taking() {
		return credit_taking;
	}

	public void setCredit_taking(int credit_taking) {
		this.credit_taking = credit_taking;
	}

	public int getCredit_graduate() {
		return credit_graduate;
	}

	public void setCredit_graduate(int credit_grad) {
		this.credit_graduate = credit_grad;
	}
	
}
