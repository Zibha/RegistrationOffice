package registerOffice.businessObjects.cars;

public class PersonCar extends Car{

	//pole statyczne
	
	//pola prywatne
	
	private String mark;
	private String registerNumber;
	
	//pola publiczne
	
	//konstruktory
	public PersonCar(String mark, String registerNumber)
	{
		this.mark=mark;
		this.registerNumber=registerNumber;
	}
	
	public PersonCar()
	{
		this("","");
	}
	
	//wlasciwosci
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	//metody
	

	@Override
	protected String getCarDetails() {
		// TODO Auto-generated method stub
		return mark+" "+registerNumber;
	}
}
