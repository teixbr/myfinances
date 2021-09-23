package com.myfinances.api.service.impl;

import com.myfinances.api.dao.AccountTypeRepository;
import com.myfinances.api.domain.DTO.AccountTypeDTO;
import com.myfinances.api.domain.entity.AccountType;
import com.myfinances.api.logic.exceptions.MyFiNotFoundException;
import com.myfinances.api.logic.mapper.AccountTypeMapper;
import com.myfinances.api.service.AccountTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * System:                  MyFinancesAPI
 * Name:                    AccountTypeServiceImpl
 * Description:             Class that will handle all DB access and business logic of the AccountType Entity class
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@Service
public class AccountTypeServiceImpl implements AccountTypeService
{
    private static final Logger _logger = LoggerFactory.getLogger( AccountTypeServiceImpl.class );

    @Autowired
    private AccountTypeRepository _repository;

    @Override
    public List<AccountTypeDTO> findAll()
    {
        _logger.debug( "findAll :: IN" );

        final List<AccountTypeDTO> list = AccountTypeMapper.mapEntityToDtoList( _repository.findAll() );

        _logger.debug( "findAll :: OUT" );

        return list;
    }

    @Override
    public AccountTypeDTO findById( AccountType AccountType )
    {
        _logger.debug( "findById :: IN" );

        final AccountTypeDTO answer = AccountTypeMapper.mapEntityToDto(
                _repository.findById( AccountType.getId() ).orElseThrow( MyFiNotFoundException::new ) );

        _logger.debug( "findById :: OUT" );

        return answer;
    }
}
