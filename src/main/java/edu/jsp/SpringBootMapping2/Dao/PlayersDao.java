package edu.jsp.SpringBootMapping2.Dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.SpringBootMapping2.Dto.Players;
import edu.jsp.SpringBootMapping2.Repo.PlayersRepo;

@Repository
public class PlayersDao {
 
@Autowired
 private PlayersRepo repo;

 public Players savePlayer( Players p ) {
	 return repo.save(p);
 }
 
 public Players FetchPlayersByid(int id) {
	Optional<Players> o= repo.findById(id);
	if(o!=null) {
     return o.get();
	}
	return null;
 }
 
 public List<Players> fetchAll(){
	 return repo.findAll();
 }
 
 public Players update(Players p) {
	 return repo.save(p);
 }
 
}
