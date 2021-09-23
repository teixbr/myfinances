package com.myfinances.api.service;

import com.myfinances.api.domain.DTO.TransactionReasonDTO;
import com.myfinances.api.domain.entity.TransactionReason;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionReasonService
 * Description:             Interface for handling service layer of TransactionReason's Entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public interface TransactionReasonService
{
    List<TransactionReasonDTO> findAll();
    TransactionReasonDTO findById( TransactionReason TransactionReason );
}