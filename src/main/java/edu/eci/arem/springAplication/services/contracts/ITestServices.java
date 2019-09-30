package edu.eci.arem.springAplication.services.contracts;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

import edu.eci.arem.springAplication.model.Test;

@Service
public interface ITestServices {

    public List<Test> list() throws SQLException;
	
}
