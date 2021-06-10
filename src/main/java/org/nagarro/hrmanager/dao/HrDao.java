package org.nagarro.hrmanager.dao;

import java.util.List;

import org.nagarro.hrmanager.model.EmployeeModel;
import org.nagarro.hrmanager.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDao extends CrudRepository<UserEntity, Integer> {
	public List<UserEntity> findByUsernameAndPassword(String username,String password);
	
}

