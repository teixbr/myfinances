package com.myfinances.api.rest;

import com.myfinances.api.domain.DTO.TransactionReasonDTO;
import com.myfinances.api.service.impl.TransactionReasonServiceImpl;
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
 * Name:                   TransactionReasonController
 * Description:            Class that serves as proxy for all services available for the TransactionReason entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@RestController
@RequestMapping("/transactionreason")
public class TransactionReasonController extends BaseController
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionReasonController.class );

    @Autowired
    private TransactionReasonServiceImpl _service;

    /**
     * Find all transaction status
     *
     * @return List<TransactionReasonDTO>
     */
    @GetMapping( "/all" )
    public ResponseEntity<List<TransactionReasonDTO>> getAllTransactionReason()
    {
        _logger.debug( "getAllTransactionReason :: IN" );

        try
        {
            final List<TransactionReasonDTO> answer = _service.findAll();

            _logger.debug( "getAllTransactionReason :: OUT" );

            return new ResponseEntity<>( answer, HttpStatus.OK );
        }
        catch ( Exception e )
        {
            _logger.error( e.toString() );
            throw e;
        }
    }
}