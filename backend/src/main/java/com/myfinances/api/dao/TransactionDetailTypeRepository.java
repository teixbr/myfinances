package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.TransactionDetailType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionDetailTypeRepository
 * Description:            Interface that handles access to the DB for the TransactionDetailType entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface TransactionDetailTypeRepository extends JpaRepository<TransactionDetailType, Long>
{}
