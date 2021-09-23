package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionDetailRepository
 * Description:            Interface that handles access to the DB for the TransactionDetail entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long>
{}
