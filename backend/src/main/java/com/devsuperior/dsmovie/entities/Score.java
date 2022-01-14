package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score {
	
	@EmbeddedId
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ScorePK idScorePK = new ScorePK();
	private Double value;
	
	public Score() {
	}

	
	public void setMovie(Movie movie) { 
		this.idScorePK.setMovie(movie); 
	}
	
	public void setUser(User user) {
		this.idScorePK.setUser(user);
	}
	
	
	public void setIdScorePK(Movie m, User u) {
		this.idScorePK.setMovie(m);
		this.idScorePK.setUser(u);
	}
	 
	
	public ScorePK getId() {
		return idScorePK;
	}

	public void setId(ScorePK id) {
		this.idScorePK = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
	
	
}
