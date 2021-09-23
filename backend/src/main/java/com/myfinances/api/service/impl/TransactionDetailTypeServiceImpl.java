package com.myfinances.api.service.impl;

import com.myfinances.api.dao.TransactionDetailTypeRepository;
import com.myfinances.api.domain.DTO.TransactionDetailTypeDTO;
import com.myfinances.api.domain.entity.TransactionDetailType;
import com.myfinances.api.logic.exceptions.MyFiNotFoundException;
import com.myfinances.api.logic.mapper.TransactionDetailTypeMapper;
import com.myfinances.api.service.TransactionDetailTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionDetailTypeServiceImpl
 * Description:             Class that will handle all DB access and business logic of the TransactionDetailType Entity class
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@Service
public class TransactionDetailTypeServiceImpl implements TransactionDetailTypeService
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionDetailTypeServiceImpl.class );

    @Autowired
    private TransactionDetailTypeRepository _repository;

    @Override
    public List<TransactionDetailTypeDTO> findAll()
    {
        _logger.debug( "findAll :: IN" );

        final List<TransactionDetailTypeDTO> list =
                TransactionDetailTypeMapper.mapEntityToDtoList( _repository.findAll() );

        _logger.debug( "findAll :: OUT" );

        return list;
    }

    @Override
    public TransactionDetailTypeDTO findById( TransactionDetailType TransactionDetailType )
    {
        _logger.debug( "findById :: IN" );

        final TransactionDetailTypeDTO answer = TransactionDetailTypeMapper.mapEntityToDto(
                _repository.findById( TransactionDetailType.getId() ).orElseThrow( MyFiNotFoundException::new ) );

        _logger.debug( "findById :: OUT" );

        return answer;
    }
}