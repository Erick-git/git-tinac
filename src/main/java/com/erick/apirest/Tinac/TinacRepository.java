package com.erick.apirest.Tinac;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TinacRepository extends JpaRepository <Tinac, Integer> {

}
