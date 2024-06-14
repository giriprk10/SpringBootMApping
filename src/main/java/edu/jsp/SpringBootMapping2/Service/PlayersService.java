package edu.jsp.SpringBootMapping2.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import edu.jsp.SpringBootMapping2.Dao.CoachDao;
import edu.jsp.SpringBootMapping2.Dao.PlayersDao;
import edu.jsp.SpringBootMapping2.Dto.Coach;
import edu.jsp.SpringBootMapping2.Dto.Players;
import edu.jsp.SpringBootMapping2.util.ResponseStrucutre;


@Service
public class PlayersService {

	@Autowired
	private PlayersDao pdao;
	
	@Autowired
	private CoachDao cdao;
	
	public Coach savePlayer(int id, Players ply) {
		Coach c=cdao.fetchCoachById(id);
		if(c!=null) {
			List <Players> list=c.getP();
			list.add(ply);
			cdao.update(c);
			return c;
		}
		return null;
	}
	
	public ResponseStrucutre<Players> fetchPlayersById(int id) {
		ResponseStrucutre<Players> rs=new ResponseStrucutre();
		rs.setId(HttpStatus.FOUND.value());
		rs.setMessage("Data Fetched Successfully");
		rs.setData( pdao.FetchPlayersByid(id));
		return rs;
	}
	
	public ResponseStrucutre<List<Players>> fetchAll(){
		ResponseStrucutre <List<Players>> rs=new ResponseStrucutre();
		rs.setId(HttpStatus.FOUND.value());
		rs.setMessage("All Data Fetched Successfully");
		rs.setData(pdao.fetchAll());
		 return rs;
	}
	
	public ResponseStrucutre<Players> update(int pid,Players newply) {
		ResponseStrucutre<Players> p=fetchPlayersById(pid);
		if(p!=null) {
			newply.setPid(pid);
			ResponseStrucutre<Players> rs=new ResponseStrucutre();
			rs.setId(HttpStatus.ACCEPTED.value());
			rs.setData(newply);
			rs.setMessage("Data Updated Successfully");
			rs.setData(pdao.update(newply));
			return rs;
		}
		return null;
	}
}
