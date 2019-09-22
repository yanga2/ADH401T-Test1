package entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="employee_tbl")
public class DigibankEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	private String name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank ;
	private String DestationCountry;
	private int AccountNumber;
	private double Amount;
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String SourcePassport) {
		this.SourcePassport = SourcePassport;
	}
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String DestinationPassport) {
		this.DestinationPassport = DestinationPassport;
	
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String DestinationBank) {
		this.DestinationBank = DestinationBank;
	}
	
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String DestationCountry) {
		this.DestationCountry = DestationCountry;
	}
	
	public int AccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	public int Amount() {
		return Amount;
	}
	public void setAmount(int Amount) {
		this.Amount = Amount;
	}
	
	

}
