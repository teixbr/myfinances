package com.myfinances.api.service.impl;

import com.myfinances.api.dao.TransactionTypeRepository;
import com.myfinances.api.domain.DTO.TransactionTypeDTO;
import com.myfinances.api.domain.entity.TransactionType;
import com.myfinances.api.logic.exceptions.MyFiNotFoundException;
import com.myfinances.api.logic.mapper.TransactionTypeMapper;
import com.myfinances.api.service.TransactionTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionTypeServiceImpl
 * Description:             Class that will handle all DB access and business logic of the TransactionType Entity class
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@Service
public class TransactionTypeServiceImpl implements TransactionTypeService
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionTypeServiceImpl.class );

    @Autowired
    private TransactionTypeRepository _repository;

    @Override
    public List<TransactionTypeDTO> findAll()
    {
        _logger.debug( "findAll :: IN" );

        final List<TransactionTypeDTO> list = TransactionTypeMapper.mapEntityToDtoList( _repository.findAll() );

        _logger.debug( "findAll :: OUT" );

        return list;
    }

    @Override
    public TransactionTypeDTO findById( TransactionType TransactionType )
    {
        _logger.debug( "findById :: IN" );

        final TransactionTypeDTO answer = TransactionTypeMapper.mapEntityToDto(
                _repository.findById( TransactionType.getId() ).orElseThrow( MyFiNotFoundException::new ) );

        _logger.debug( "findById :: OUT" );

        return answer;
    }
}