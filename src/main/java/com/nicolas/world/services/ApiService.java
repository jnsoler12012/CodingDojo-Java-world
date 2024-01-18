package com.nicolas.world.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.world.models.Country;
import com.nicolas.world.repositories.CityRepository;
import com.nicolas.world.repositories.CountryRepository;
import com.nicolas.world.repositories.LanguageRepository;


@Service
public class ApiService {
	@Autowired
	private CountryRepository countryRepo;
	@Autowired
	private CityRepository cityRepo;
	@Autowired
	private LanguageRepository languageRepo;
	
	public List<Country> getCountries() {
		return countryRepo.findAll();
	}
	
	public List<Object[]> getCountriesByLanguage(String lang) {
		return countryRepo.findCountriesByLang(lang);
	}
	
	public List<Object[]> getCountriesByNumCities() {
		return countryRepo.findCountriesByNumCitiesDesc();
	}
	
	public List<Object[]> getMexicoCitiesByPop() {
		return cityRepo.mexicanCitiesByPop();
	}
	
	public List<Object[]> getCountryLanguagesOver89Perc() {
		return languageRepo.findAllLanguageOver89Percent();
	}
	
	public List<Country> getCountriesSurfaceAreaPop() {
		return countryRepo.findCountriesSurfaceAreaPop();
	}
	
	public List<Country> getCountriesMonarchSaLe() {
		return countryRepo.findCountriesMonarchSaLe(); 
	}
	
	public List<Object[]> buenosAires() {
		return cityRepo.buenosAiresCities();
	}
	
	public List<Object[]> regionsByNumCountries() {
		return countryRepo.regionsByNumCountries();
	}
}
