package io.sohan.xivtimelineplanner.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobs")
public class Job {
	
	private long id; 
	private String name; 
	
	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Skill> skills = new HashSet<>(); 

}
