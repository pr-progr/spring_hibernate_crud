package com.rp.cruddeemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rp.cruddeemo.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImpl implements StudentDAO {
	
	EntityManager entityManager;

	
	@Autowired
	public StudentDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	@Override
	@Transactional
	public void save(Student student) {
		entityManager.persist(student);
	}

}
