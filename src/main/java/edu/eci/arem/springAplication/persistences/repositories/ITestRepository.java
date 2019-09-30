package edu.eci.arem.springAplication.persistences.repositories;

import java.sql.SQLException;
import java.util.*;

import edu.eci.arem.springAplication.model.Test;


public interface ITestRepository {
    public List<Test> findAll() throws SQLException ;  
}