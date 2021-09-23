package com.myfinances.api.service;

import com.myfinances.api.domain.DTO.TransactionTypeDTO;
import com.myfinances.api.domain.entity.TransactionType;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionTypeService
 * Description:             Interface for handling service layer of TransactionType's Entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public interface TransactionTypeService
{
    List<TransactionTypeDTO> findAll();
    TransactionTypeDTO findById( TransactionType TransactionType );
}