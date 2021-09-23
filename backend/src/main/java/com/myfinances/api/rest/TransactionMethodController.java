package com.myfinances.api.rest;

import com.myfinances.api.domain.DTO.TransactionMethodDTO;
import com.myfinances.api.service.impl.TransactionMethodServiceImpl;
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
 * Name:                   TransactionMethodController
 * Description:            Class that serves as proxy for all services available for the TransactionMethod entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@RestController
@RequestMapping("/transactionmethod")
public class TransactionMethodController extends BaseController
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionMethodController.class );

    @Autowired
    private TransactionMethodServiceImpl _service;

    /**
     * Find all transaction status
     *
     * @return List<TransactionMethodDTO>
     */
    @GetMapping( "/all" )
    public ResponseEntity<List<TransactionMethodDTO>> getAllTransactionMethod()
    {
        _logger.debug( "getAllTransactionMethod :: IN" );

        try
        {
            final List<TransactionMethodDTO> answer = _service.findAll();

            _logger.debug( "getAllTransactionMethod :: OUT" );

            return new ResponseEntity<>( answer, HttpStatus.OK );
        }
        catch ( Exception e )
        {
            _logger.error( e.toString() );
            throw e;
        }
    }
}
