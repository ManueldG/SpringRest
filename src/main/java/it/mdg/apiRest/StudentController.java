package it.mdg.apiRest;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.mdg.apiRest.entity.Student;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired	
	private StudentRepository studentRepository;
	
	@GetMapping(path="/all") //curl http://localhost:8081/api/all
	  public @ResponseBody Iterable<Student> getAllUsers() {
		
	    // This returns a JSON or XML with the users
	    return studentRepository.findAll();
	  }
	
	@GetMapping("/{id}") //curl http://localhost:8081/api/1
	  public @ResponseBody Optional<Student> getUser(@PathVariable int id) {
		
	    // This returns a JSON or XML with the users
	    return studentRepository.findById(id);
	  }
	
	
	
	


}
