package edu.jsp.SpringBootMapping2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.SpringBootMapping2.Dto.Coach;

public interface CoachRepo extends JpaRepository<Coach, Integer> {
  
}
