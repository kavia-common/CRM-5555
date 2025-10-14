package pl.coderslab.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Pattern;

import lombok.Data;


@Data
@Entity
public class Company {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String fullName;
	
	@OneToOne
	private Address mainAddress;
	
	@Pattern(regexp = "\\d{10}")
	private String nip;
	
	@OneToMany
	(mappedBy = "address")
	private List<Office> offices;
	
}
