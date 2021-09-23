package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   AccountTypeRepository
 * Description:            Interface that handles access to the DB for the AccountType entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long>
{}