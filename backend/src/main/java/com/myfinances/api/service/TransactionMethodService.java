package com.myfinances.api.service;

import com.myfinances.api.domain.DTO.TransactionMethodDTO;
import com.myfinances.api.domain.entity.TransactionMethod;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionMethodService
 * Description:             Interface for handling service layer of TransactionMethod's Entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public interface TransactionMethodService
{
    List<TransactionMethodDTO> findAll();
    TransactionMethodDTO findById( TransactionMethod TransactionMethod );
}