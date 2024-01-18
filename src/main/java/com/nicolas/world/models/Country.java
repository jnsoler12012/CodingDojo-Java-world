package com.nicolas.world.models;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="countries")
public class Country {
	@Id
	private Integer id;
	private String code;
	private String name;
	private String continent;
	private String region;
	private Float surface_area;
	private Short indep_year;
	private Integer population;
	private Float life_expectancy;
	private Float gnp;
	private Float gnp_old;
	private String local_name;
	private String government_form;
	private String head_of_state;
	private Integer capital;
	private String code2;
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private List<City> cities;
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private List<Language> languages;
	

	
	
}
