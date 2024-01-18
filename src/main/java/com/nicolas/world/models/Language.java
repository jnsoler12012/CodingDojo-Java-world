package com.nicolas.world.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="languages")
public class Language {
	@Id
	private Integer id;
	private String country_code;
	private String language;
	private String is_official;
	private Float percentage;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_id")
	private Country country;
	
	
}
