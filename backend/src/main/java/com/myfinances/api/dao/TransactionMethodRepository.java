package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.TransactionMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionMethodRepository
 * Description:            Interface that handles access to the DB for the TransactionMethod entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface TransactionMethodRepository extends JpaRepository<TransactionMethod, Long>
{}
