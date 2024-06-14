package edu.jsp.SpringBootMapping2.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.SpringBootMapping2.Dto.Coach;
import edu.jsp.SpringBootMapping2.Dto.Players;
import edu.jsp.SpringBootMapping2.Repo.CoachRepo;

@Repository
public class CoachDao {
	@Autowired
	private CoachRepo repo;
	
	public Coach saveCoach(Coach c){
		return repo.save(c);
	}
	
	public Coach fetchCoachById(int id) {
		Optional<Coach>o=repo.findById(id);
		if(o!=null) {
			return o.get();
		}
		return null;
	}
	
	public List<Coach> fetchAll(){
		return repo.findAll();
	}
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "Data Deleted";
	}
	
	public Coach update(Coach c) {
		return repo.save(c);
	}
}
