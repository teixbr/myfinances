package com.myfinances.api.rest;

import com.myfinances.api.domain.DTO.TransactionTypeDTO;
import com.myfinances.api.service.impl.TransactionTypeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionTypeController
 * Description:            Class that serves as proxy for all services available for the TransactionType entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@RestController
@RequestMapping("/transactiontype")
public class TransactionTypeController extends BaseController
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionTypeController.class );

    @Autowired
    private TransactionTypeServiceImpl _service;

    /**
     * Find all transaction status
     *
     * @return List<TransactionTypeDTO>
     */
    @GetMapping( "/all" )
    public ResponseEntity<List<TransactionTypeDTO>> getAllTransactionType()
    {
        _logger.debug( "getAllTransactionType :: IN" );

        try
        {
            final List<TransactionTypeDTO> answer = _service.findAll();

            _logger.debug( "getAllTransactionType :: OUT" );

            return new ResponseEntity<>( answer, HttpStatus.OK );
        }
        catch ( Exception e )
        {
            _logger.error( e.toString() );
            throw e;
        }
    }
}