package edu.jsp.SpringBootMapping2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import edu.jsp.SpringBootMapping2.Dao.CoachDao;
import edu.jsp.SpringBootMapping2.Dto.Coach;
import edu.jsp.SpringBootMapping2.Dto.Players;
import edu.jsp.SpringBootMapping2.util.ResponseStrucutre;



@Service
public class CoachService {
	@Autowired
	private CoachDao cdao;
	
	public ResponseStrucutre<Coach> saveCoach(Coach c) {
		ResponseStrucutre<Coach> rs=new ResponseStrucutre();
		rs.setId(HttpStatus.CREATED.value());
		rs.setMessage("Data Saved Successfully");
		rs.setData(cdao.saveCoach(c));
		 return rs;
	}
	
	public ResponseStrucutre<Coach> fetchCoachById(int id) {
		ResponseStrucutre<Coach> rs=new ResponseStrucutre();
		rs.setId(HttpStatus.FOUND.value());
		rs.setMessage("Data Fetched Successfully");
		rs.setData(cdao.fetchCoachById(id));
		 return rs;
	}
	
	public ResponseStrucutre<List<Coach>> fetchAll(){
		ResponseStrucutre <List<Coach>> rs=new ResponseStrucutre();
		rs.setId(HttpStatus.FOUND.value());
		rs.setMessage("All Data Fetched Successfully");
		rs.setData(cdao.fetchAll());
		return rs;
	}
	
	public ResponseStrucutre<String> deleteById(int id) {
		ResponseStrucutre <String> rs=new ResponseStrucutre();
		rs.setId(HttpStatus.OK.value());
		rs.setMessage("Data Deleted Successfully");
		rs.setData(cdao.deleteById(id));
		return rs;
	}
	
	public ResponseStrucutre<Coach> update(int id,Coach c1) {
		 ResponseStrucutre<Coach> c=fetchCoachById(id);
		 if(c!=null) {
			 c1.setId(id);
			 c1.setId(id);
				ResponseStrucutre<Coach> rs=new ResponseStrucutre();
				rs.setId(HttpStatus.ACCEPTED.value());
				rs.setData(c1);
				rs.setMessage("Data Updated Successfully");
			 rs.setData(cdao.update(c1));
			 return rs;
		 }
		 return null; 
	}
}
