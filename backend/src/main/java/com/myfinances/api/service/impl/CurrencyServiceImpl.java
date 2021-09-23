package com.myfinances.api.service.impl;

import com.myfinances.api.dao.CurrencyRepository;
import com.myfinances.api.domain.DTO.CurrencyDTO;
import com.myfinances.api.domain.entity.Currency;
import com.myfinances.api.logic.exceptions.MyFiNotFoundException;
import com.myfinances.api.logic.mapper.CurrencyMapper;
import com.myfinances.api.service.CurrencyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    CurrencyServiceImpl
 * Description:             Class that will handle all DB access and business logic of the Currency Entity class
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@Service
public class CurrencyServiceImpl implements CurrencyService
{
    private static final Logger _logger = LoggerFactory.getLogger( CurrencyServiceImpl.class );

    @Autowired
    private CurrencyRepository _repository;

    @Override
    public List<CurrencyDTO> findAll()
    {
        _logger.debug( "findAll :: IN" );

        final List<CurrencyDTO> list = CurrencyMapper.mapEntityToDtoList( _repository.findAll() );

        _logger.debug( "findAll :: OUT" );

        return list;
    }

    @Override
    public CurrencyDTO findById( Currency Currency )
    {
        _logger.debug( "findById :: IN" );

        final CurrencyDTO answer = CurrencyMapper.mapEntityToDto(
                _repository.findById( Currency.getId() ).orElseThrow( MyFiNotFoundException::new ) );

        _logger.debug( "findById :: OUT" );

        return answer;
    }
}