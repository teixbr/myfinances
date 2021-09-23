package com.myfinances.api.service.impl;

import com.myfinances.api.dao.TransactionMethodRepository;
import com.myfinances.api.domain.DTO.TransactionMethodDTO;
import com.myfinances.api.domain.entity.TransactionMethod;
import com.myfinances.api.logic.exceptions.MyFiNotFoundException;
import com.myfinances.api.logic.mapper.TransactionMethodMapper;
import com.myfinances.api.service.TransactionMethodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionMethodServiceImpl
 * Description:             Class that will handle all DB access and business logic of the TransactionMethod Entity class
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@Service
public class TransactionMethodServiceImpl implements TransactionMethodService
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionMethodServiceImpl.class );

    @Autowired
    private TransactionMethodRepository _repository;

    @Override
    public List<TransactionMethodDTO> findAll()
    {
        _logger.debug( "findAll :: IN" );

        final List<TransactionMethodDTO> list = TransactionMethodMapper.mapEntityToDtoList( _repository.findAll() );

        _logger.debug( "findAll :: OUT" );

        return list;
    }

    @Override
    public TransactionMethodDTO findById( TransactionMethod TransactionMethod )
    {
        _logger.debug( "findById :: IN" );

        final TransactionMethodDTO answer = TransactionMethodMapper.mapEntityToDto(
                _repository.findById( TransactionMethod.getId() ).orElseThrow( MyFiNotFoundException::new ) );

        _logger.debug( "findById :: OUT" );

        return answer;
    }
}