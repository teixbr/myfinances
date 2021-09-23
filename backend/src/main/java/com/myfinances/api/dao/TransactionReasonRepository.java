package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.TransactionReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionReasonRepository
 * Description:            Interface that handles access to the DB for the TransactionReason entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface TransactionReasonRepository extends JpaRepository<TransactionReason, Long>
{}
