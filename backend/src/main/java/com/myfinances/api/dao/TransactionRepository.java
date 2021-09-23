package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionRepository
 * Description:            Interface that handles access to the DB for the Transaction entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>
{}
