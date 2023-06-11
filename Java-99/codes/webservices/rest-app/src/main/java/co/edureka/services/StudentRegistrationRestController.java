package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.models.Student;

@Path("/edureka")
public class StudentRegistrationRestController {
	@POST
	@Produces("application/json")
	@Path("/register")
	public Student registerNewStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
			@FormParam("addr_field") String address) {
		
		Student stud = new Student();
		//--logic to save the student to database
		
		stud.setStudentName(name);
		stud.setStudentAge(age);
		stud.setStudentAddress(address);
		
		return stud;
	}
}
