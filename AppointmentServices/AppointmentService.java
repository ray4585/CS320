import java.util.ArrayList;

public class AppointmentService {
	
	ArrayList<Appointment>appointments;
	
	public AppointmentService() {
		
		appointments = new ArrayList<>();
		
	}
	
	
	public boolean addAppointment(Appointment newAppointment) {
			
		boolean full = false;
			
		for(Appointment appointment : appointments) {
			if(appointment.getID().equalsIgnoreCase(newAppointment.getID())) {
					
				full = true;
				break;
			}
				
		}
			
		if(!full) {
			appointments.add(newAppointment);
			return true;
		}else {
			return false;
		}	
	}
		
	public boolean deleteAppointment(String ID) {
			
		boolean erase = false;
			
		for(Appointment appointment : appointments) {
			if(appointment.getID().equalsIgnoreCase(ID)) {
					
				appointments.remove(appointment);
					
				erase = true;
				break;
			}
		}
		return erase;
	}
	
	
	public void displayAll() {
		for(Appointment appointment: appointments) {
				System.out.println(appointment.toString());
			}
		}

}
Filename: Contact.java

public class Contact {
	
	private String ID;
	private String FirstName;
	private String LastName;
	private String number;
	private String address;
		
	public Contact(String ID, String FirstName, String LastName, String number, String address) {
		
		if(ID.length() <= 10 && ID != null) {
			
			this.ID = ID;
			
		}	
		
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setNumber(number);
		this.setAddress(address);
		
	}

	protected void setFirstName(String name) {
		
		if (name.length() <= 10 && name != null) {
			
			this.FirstName = name;
		}
	}
	
	 protected void setLastName(String name) {
		
		if (name.length() <= 10 && name != null) {
			
			this.LastName = name;
		}
	}
	
	 protected void setNumber(String number) {
	
		if (number.length() <= 10 && number != null) {
			
			this.number = number;
		}
	}
	
	protected void setAddress(String address) {
		
		if(address.length() <= 30 && address != null) {
			
			this.address = address;
		}
	}
	
	public String getID() {
		
		return ID;
	}

	public String getFirstName() {

		return FirstName;
	}

	public String getLastName() {

		return LastName;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {

		return address;
	}

	@Override
	public String toString() {

		return "\nContact: " + ID + "\nFirst Name: " + FirstName + "\nLast Name: " +
		LastName + "\nNumber: " + number + "\nAddress: " + address;
	}
}