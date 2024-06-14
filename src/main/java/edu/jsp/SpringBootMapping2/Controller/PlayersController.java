package edu.jsp.SpringBootMapping2.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.SpringBootMapping2.Dto.Coach;
import edu.jsp.SpringBootMapping2.Dto.Players;
import edu.jsp.SpringBootMapping2.Service.PlayersService;
import edu.jsp.SpringBootMapping2.util.ResponseStrucutre;


@RestController
public class PlayersController {

	
	@Autowired
	private PlayersService service;

	@PostMapping("savePlayer")
	public Coach savePlayer(@RequestParam int id,@RequestBody Players ply) {
		return service.savePlayer(id, ply);
	}
	
	@GetMapping("getPlayer")
	public ResponseStrucutre<Players> fetchPlayersById(@RequestParam int id) {
		return service.fetchPlayersById(id);
	}
	
	@GetMapping("getAll")
	public ResponseStrucutre<List<Players>> fetchAll(){
		 return service.fetchAll();
	}
	
	@PutMapping("updatePlayers")
	public ResponseStrucutre<Players> update(@RequestParam int pid ,@RequestBody Players newPly) {
		return service.update(pid, newPly);
	}
}
