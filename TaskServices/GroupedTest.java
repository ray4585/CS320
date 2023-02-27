import java.util.ArrayList;

public class TaskService {
	
ArrayList<Task>tasks;
	
	public TaskService() {
		
		tasks = new ArrayList<>();
		
	}
	
	
	public boolean addTask(Task newTask) {
			
		boolean full = false;
			
		for(Task task : tasks) {
			if(task.getID().equalsIgnoreCase(newTask.getID())) {
					
				full = true;
				break;
			}
				
		}
			
		if(!full) {
			tasks.add(newTask);
			return true;
		}else {
			return false;
		}	
	}
		
	public boolean deleteTask(String ID) {
			
		boolean erase = false;
			
		for(Task task : tasks) {
			if(task.getID().equalsIgnoreCase(ID)) {
					
				tasks.remove(task);
					
				erase = true;
				break;
			}
		}
		return erase;
	}
	
	
	public boolean updateName(String ID, String newName) {
		
		boolean update = false;
		
		for(Task task : tasks) {
			if(task.getID().equalsIgnoreCase(ID)) {
				
				task.setName(newName);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	public boolean updateDescription(String ID, String newDescription) {
		
		boolean update = false;
		
		for (Task task: tasks) {
			if(task.getID().equalsIgnoreCase(ID)) {
				
				task.setDescription(newDescription);
				
				update = true;
				break;
			}
		}
		return update;	
	}
	
	
	
		public void displayAll() {
			for(Task task: tasks) {
				System.out.println(task.toString());
			}
		}
	
	

}
Filename: GroupedTest.java

public class Main {
	
	public static void main(String[] args) {
		
		
		//////////////////////////////////////////////////////////////////////////////
				//The following is the Task/TaskService Test
		/////////////////////////////////////////////////////////////////////////////
		
				//generate contact service
				ContactService contactService = new ContactService();
				
				//Test contacts
				Contact A = new Contact("A", "Paul", "Bunion", "456789132", "Midway, Pacific Isles");
				Contact B = new Contact("B", "Sara", "Blanch", "000000000", "Miwakey, AZ");
				
				//Test adding contacts
				if(contactService.addContact(A)) {
					
					System.out.println("\nadded");
					
				}else {
					
					System.out.println("\nfailure to add contact");
				}
				
				if(contactService.addContact(B)) {
					
					System.out.println("\nadded");
					
				}else {
					
					System.out.println("\nfailure to add contact");
				}
				
				//Test re-adding contacts
				if(contactService.addContact(A)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add contact");
				}
				
				
				//print all contacts
				contactService.displayAll();
				
				
				//test deleting a contact
				
				contactService.deleteContact("A");
				if(contactService.deleteContact("A")) {
					
					System.out.println("\ndeleted");
					
				}else {
					
					System.out.println("\nalready deleted");
					
				}
				
				//test updating info
				contactService.updateFirstName("B", "Milk");
				contactService.updateLastName("B", "Toast");
				contactService.updateNumber("B", "123456789");
				contactService.updateFirstName("B", "Greenwood, MA");
				
				//test results
				contactService.displayAll();
		
		
		//////////////////////////////////////////////////////////////////////////////
				//The following is the Task/TaskService Test
		/////////////////////////////////////////////////////////////////////////////
		
				//generate task service
				TaskService TaskService = new TaskService();
						
				//Test tasks
				Task C = new Task("C", "Paul", "Bunion 456789132 Midway Pacific Isles");
				Task D = new Task("D", "Sara", "Blanch 000000000 Miwakey AZ");
				
				//Test adding tasks
				if(TaskService.addTask(C)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add task");
				}
						
				if(TaskService.addTask(D)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add task");
				}
						
				//Test re-adding tasks
				if(TaskService.addTask(C)) {
									
					System.out.println("\nadded");
									
				}else {
									
					System.out.println("\nfailure to add task");
				}
						
						
				//print all tasks
				TaskService.displayAll();
						
						
				//test deleting a task
						
				TaskService.deleteTask("C");
				if(TaskService.deleteTask("C")) {
							
					System.out.println("\ndeleted");
							
				}else {
							
					System.out.println("\nalready deleted");
							
				}
						
				//test updating name
				TaskService.updateName("D", "Milk");
				
				//test updating description
				TaskService.updateDescription("D", "Toast with rye bread");
				
				//print all tasks
				TaskService.displayAll();
				
				
		
		//////////////////////////////////////////////////////////////////////////////
				//The following is the Appointment/AppointmentService Test
		/////////////////////////////////////////////////////////////////////////////
		
				AppointmentService AppointmentService = new AppointmentService();
						
				Appointment E = new Appointment("E", "2020-01-01", "Bunion 456789132 Midway Pacific Isles");
				Appointment F = new Appointment("F", "2022-02-02", "Blanch 000000000 Miwakey AZ");
				
				if(AppointmentService.addAppointment(E)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add appointment");
				}
						
				if(AppointmentService.addAppointment(F)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add appointment");
				}
						
				//Test re-adding appointments
				if(AppointmentService.addAppointment(E)) {
									
					System.out.println("\nadded");
									
				}else {
									
					System.out.println("\nfailure to add appointment");
				}
						
						
				AppointmentService.displayAll();
						
						
				AppointmentService.deleteAppointment("E");
				if(AppointmentService.deleteAppointment("E")) {
							
					System.out.println("\ndeleted");
							
				}else {
							
					System.out.println("\nalready deleted");
							
				}

				
				AppointmentService.displayAll();
		

	}
}
