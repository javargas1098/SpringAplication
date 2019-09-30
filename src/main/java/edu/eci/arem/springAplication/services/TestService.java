package edu.eci.arem.springAplication.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.eci.arem.springAplication.model.Test;
import edu.eci.arem.springAplication.persistences.repositories.ITestRepository;
import edu.eci.arem.springAplication.services.contracts.ITestServices;


@Component
public class TestService implements ITestServices{
	
	@Autowired
	private ITestRepository testRepository;
	
	@Override
	public List<Test> list() throws SQLException {
		System.out.println("caaaa");
		return testRepository.findAll();
	}
}


