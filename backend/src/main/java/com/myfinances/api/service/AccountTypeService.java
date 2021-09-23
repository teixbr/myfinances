package com.myfinances.api.service;

import com.myfinances.api.domain.DTO.AccountTypeDTO;
import com.myfinances.api.domain.entity.AccountType;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    AccountTypeService
 * Description:             Interface for handling service layer of AccountType's Entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public interface AccountTypeService
{
    List<AccountTypeDTO> findAll();
    AccountTypeDTO findById( AccountType AccountType );
}