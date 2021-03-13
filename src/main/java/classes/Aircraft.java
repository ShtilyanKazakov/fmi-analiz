package classes;

public class Aircraft {

    public Aircraft() {
    }

    private String TailNumber;

    private String AircraftType;

    private int PaxCapacity;

    private int CargoCapicity;

    public User user;

    /**
     * @return
     */
    public String getTailNumber() {
        // TODO implement here
        return this.TailNumber;
    }

    /**
     * @param value
     */
    public void setTailNumber(String value) {
        this.TailNumber = value;
    }

    /**
     * @return
     */
    public String getAircraftType() {
        // TODO implement here
        return this.AircraftType;
    }

    /**
     * @param value
     */
    public void setAircraftType(String value) {
    	this.AircraftType = value;
    }

    /**
     * @return
     */
    public int getPaxCapacity() {
        // TODO implement here
        return this.PaxCapacity;
    }

    /**
     * @param value
     */
    public void setPaxCapacity(int value) {
    	this.PaxCapacity = value;
    }

    /**
     * @return
     */
    public int getCargoCapicity() {
        // TODO implement here
        return this.CargoCapicity;
    }

    /**
     * @param value
     */
    public void setCargoCapicity(int value) {
    	this.CargoCapicity = value;
    }

}