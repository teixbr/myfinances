package com.myfinances.api.service;

import com.myfinances.api.domain.DTO.TransactionDetailTypeDTO;
import com.myfinances.api.domain.entity.TransactionDetailType;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionDetailTypeService
 * Description:             Interface for handling service layer of TransactionDetailType's Entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public interface TransactionDetailTypeService
{
    List<TransactionDetailTypeDTO> findAll();
    TransactionDetailTypeDTO findById( TransactionDetailType TransactionDetailType );
}