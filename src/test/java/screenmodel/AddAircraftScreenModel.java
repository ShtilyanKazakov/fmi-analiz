package screenmodel;


import service.CreateService;

public class AddAircraftScreenModel {

	private String TailNumber;
    private String AircraftType;
    private String PaxCapacity;
    private String CargoCapicity;
    private String message;
    
    public void navigateToMe()
	{
		System.out.println("Отворен е прозорецът за създаване на рецепта.");
	}

    public String getTailNumber() {
        return this.TailNumber;
    }
    public void setTailNumber(String TailNumber) {
        this.TailNumber = TailNumber;
    }
    
    public String getAircraftType() {
        return this.AircraftType;
    }
    public void setAircraftType(String AircraftType) {
        this.AircraftType = AircraftType;
    }

    public String getPaxCapacity() {
        return this.PaxCapacity;
    }
    public void setPaxCapacity(String PaxCapacity) {
        this.PaxCapacity = PaxCapacity;
    }

    public String getCargoCapicity() {
        return this.CargoCapicity;
    }
    public void setCargoCapicity(String CargoCapicity) {
        this.CargoCapicity = CargoCapicity;
    }
    
    public void clickCreateButton() 
	{
		message = CreateService.create(TailNumber, AircraftType, PaxCapacity, CargoCapicity);
	}

	public String getCreateMessage() {
		return message;
	}
}

