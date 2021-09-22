package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 FlexiTest
 * Name:                   MyFinancesAPI
 * Description:            Interface that handles access to the DB for the TransactionType entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionType,Long>
{}
