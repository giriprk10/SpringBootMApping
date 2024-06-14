package edu.jsp.SpringBootMapping2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.SpringBootMapping2.Dto.Coach;
import edu.jsp.SpringBootMapping2.Service.CoachService;
import edu.jsp.SpringBootMapping2.util.ResponseStrucutre;
@RestController
public class CoachController {
	@Autowired
	private CoachService service;
	
	@PostMapping("saveCoach")
	public ResponseStrucutre<Coach> saveCoach(@RequestBody Coach c) {
		return service.saveCoach(c);
	}
	
	@GetMapping("getCoach")
	public ResponseStrucutre<Coach> fetchCoachById(@RequestParam int id) {
		return service.fetchCoachById(id);
	}
	
	@GetMapping("getAllCoach")
	public ResponseStrucutre<List<Coach>> fetchAll(){
		return service.fetchAll();
	}
	
	@DeleteMapping("delete")
	public ResponseStrucutre<String> deleteById(@RequestParam int id) {
		return service.deleteById(id);
	}
	
	@PutMapping("update")
	public ResponseStrucutre<Coach> update(@RequestParam int id,@RequestBody Coach c1) {
		return service.update(id, c1);
	} 
}
