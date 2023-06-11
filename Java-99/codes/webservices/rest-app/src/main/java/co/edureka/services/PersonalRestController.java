package co.edureka.services;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/personal")
public class PersonalRestController {
	@GET
	@Produces("text/plain")
	@Path("/age/{name}/{yob}")
	public String calculateAge(@PathParam("name") String name, @PathParam(value = "yob") Integer yob) {
		if(isValidYoB(yob)) {
			int age = getAge(yob);
			return "Hello "+name+", you are "+age+ " years of age!!";
		}else {
			return "Hello "+name+", your Year of Birth is NOT Valid";
		}
	}
	
	public int getCurrentYear() {
		LocalDate date = LocalDate.now();
		int curYear = date.getYear();
		return curYear;
	}
	
	public boolean isValidYoB(int yob) {
		return (yob < getCurrentYear())? true : false; 
	}
	
	public int getAge(int yob) {
		return getCurrentYear() - yob;
	}
}
