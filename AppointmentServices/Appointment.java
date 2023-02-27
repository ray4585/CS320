import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Appointment {

	private String ID;
	private String date;
	Date date1 = new Date();
	private String description;

	public Appointment(String ID, String date, String description) {

		if(ID.length() <= 10 && ID != null) {

			this.ID = ID;

		}




		this.setDate(date);
		this.setDescription(description);

	}

	protected void setDate(String date) {

		SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");

		Date date2 = null;
		try {
			date2 = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		boolean test = date2.before(date1);

		if ( test == false && date != null) {

			this.date = date;
		}else {

			this.date = "invalid date";

		}
	}

	 protected void setDescription(String description) {

		if (description.length() <= 50 && description != null) {

			this.description = description;
		}
	}

	 public String getID() {

			return ID;
		}

		public String getDate() {

			return date;
		}

		public String getDescription() {

			return description;
		}


		@Override
		public String toString() {

			return "\nAppointment: " + ID + "\nDate: " + date + "\nDescription: " +
			description;
		}

}