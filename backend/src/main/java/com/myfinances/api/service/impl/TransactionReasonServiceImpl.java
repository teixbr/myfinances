package com.myfinances.api.service.impl;

import com.myfinances.api.dao.TransactionReasonRepository;
import com.myfinances.api.domain.DTO.TransactionReasonDTO;
import com.myfinances.api.domain.entity.TransactionReason;
import com.myfinances.api.logic.exceptions.MyFiNotFoundException;
import com.myfinances.api.logic.mapper.TransactionReasonMapper;
import com.myfinances.api.service.TransactionReasonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    TransactionReasonServiceImpl
 * Description:             Class that will handle all DB access and business logic of the TransactionReason Entity class
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@Service
public class TransactionReasonServiceImpl implements TransactionReasonService
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionReasonServiceImpl.class );

    @Autowired
    private TransactionReasonRepository _repository;

    @Override
    public List<TransactionReasonDTO> findAll()
    {
        _logger.debug( "findAll :: IN" );

        final List<TransactionReasonDTO> list = TransactionReasonMapper.mapEntityToDtoList( _repository.findAll() );

        _logger.debug( "findAll :: OUT" );

        return list;
    }

    @Override
    public TransactionReasonDTO findById( TransactionReason TransactionReason )
    {
        _logger.debug( "findById :: IN" );

        final TransactionReasonDTO answer = TransactionReasonMapper.mapEntityToDto(
                _repository.findById( TransactionReason.getId() ).orElseThrow( MyFiNotFoundException::new ) );

        _logger.debug( "findById :: OUT" );

        return answer;
    }
}