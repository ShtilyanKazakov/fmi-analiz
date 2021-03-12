package service;

import classes.Aircraft;

public class CreateService {
	public static String create(String TailNumber, String AircraftType, String PaxCapacity, String CargoCapicity) {
		
		if (TailNumber == null && AircraftType == null && PaxCapacity == null && CargoCapicity == null) {
			return "Не сте въвели данни!";
		}
		
		if (TailNumber == null || TailNumber.isEmpty()) {
			return "Моля въведете номер на опашката";
		}
		
		if (AircraftType == null || AircraftType.isEmpty()) {
			return "Моля въведете тип на самолета";
		}
		
		if (PaxCapacity == null || PaxCapacity.isEmpty()) {
			return "Моля въведете капацитет на екипажа";
		}
		
		if (CargoCapicity == null || CargoCapicity.isEmpty()) {
			return "Моля въведете капацитет на товар";
		}

		Aircraft aircraft = new Aircraft();
		aircraft.setTailNumber(TailNumber);
		aircraft.setAircraftType(AircraftType);
		aircraft.setPaxCapacity(Integer.parseInt(PaxCapacity));
		aircraft.setCargoCapicity(Integer.parseInt(CargoCapicity));
		
		return "Самолетът е добавен успешно";
	}
}




