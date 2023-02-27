public class Task {
	
	private String ID;
	private String name;
	private String description;
	
	public Task(String ID, String name, String description) {
		
		if(ID.length() <= 10 && ID != null) {
			
			this.ID = ID;
			
		}	
		
		this.setName(name);
		this.setDescription(description);
		
	}

	protected void setName(String name) {
		
		if (name.length() <= 20 && name != null) {
			
			this.name = name;
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
		
		public String getName() {
			
			return name;
		}
		
		public String getDescription() {
			
			return description;
		}
		
		
		@Override
		public String toString() {
			
			return "\nTask: " + ID + "\nName: " + name + "\nDescription: " +
			description;
		}

}