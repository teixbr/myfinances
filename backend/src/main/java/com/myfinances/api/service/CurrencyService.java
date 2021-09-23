package com.myfinances.api.service;

import com.myfinances.api.domain.DTO.CurrencyDTO;
import com.myfinances.api.domain.entity.Currency;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    CurrencyService
 * Description:             Interface for handling service layer of Currency's Entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
public interface CurrencyService
{
    List<CurrencyDTO> findAll();
    CurrencyDTO findById( Currency Currency );
}