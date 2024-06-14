package edu.jsp.SpringBootMapping2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.SpringBootMapping2.Dto.Players;

public interface PlayersRepo extends JpaRepository<Players, Integer>{

}
