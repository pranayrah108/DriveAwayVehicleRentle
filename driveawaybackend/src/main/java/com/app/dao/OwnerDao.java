package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Owner;

public interface OwnerDao extends JpaRepository<Owner, Long> {

}
