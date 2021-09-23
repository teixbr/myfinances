package com.myfinances.api.dao;

import com.myfinances.api.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * System:                 MyFinancesAPI
 * Name:                   AccountRepository
 * Description:            Interface that handles access to the DB for the Account entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>
{}