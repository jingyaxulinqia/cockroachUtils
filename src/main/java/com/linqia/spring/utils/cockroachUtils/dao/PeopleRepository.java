package com.linqia.spring.utils.cockroachUtils.dao;

import com.linqia.spring.utils.cockroachUtils.entity.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PeopleRepository extends Repository<People, Long>{
    People save(People people);
    List<People> findAll();
    People findByName(String name);
    People findById(Long id);

}
