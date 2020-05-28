package com.kgisl.postgres.repository;



import com.kgisl.postgres.entity.login;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    



@Repository
public interface UserRepository extends CrudRepository<login, Long> {

}


