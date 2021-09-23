package com.myfinances.api.rest;

import com.myfinances.api.domain.DTO.TransactionDetailTypeDTO;
import com.myfinances.api.service.impl.TransactionDetailTypeServiceImpl;
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
 * Name:                   TransactionDetailTypeController
 * Description:            Class that serves as proxy for all services available for the TransactionDetailType entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@RestController
@RequestMapping("/transactiondetailtype")
public class TransactionDetailTypeController extends BaseController
{
    private static final Logger _logger = LoggerFactory.getLogger( TransactionDetailTypeController.class );

    @Autowired
    private TransactionDetailTypeServiceImpl _service;

    /**
     * Find all transaction status
     *
     * @return List<TransactionDetailTypeDTO>
     */
    @GetMapping( "/all" )
    public ResponseEntity<List<TransactionDetailTypeDTO>> getAllTransactionDetailType()
    {
        _logger.debug( "getAllTransactionDetailType :: IN" );

        try
        {
            final List<TransactionDetailTypeDTO> answer = _service.findAll();

            _logger.debug( "getAllTransactionDetailType :: OUT" );

            return new ResponseEntity<>( answer, HttpStatus.OK );
        }
        catch ( Exception e )
        {
            _logger.error( e.toString() );
            throw e;
        }
    }
}
