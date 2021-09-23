package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   PersonRepository
 * Description:            Interface that handles access to the DB for the Person entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{}
