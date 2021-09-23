package com.myfinances.api.rest;

import com.myfinances.api.domain.DTO.CurrencyDTO;
import com.myfinances.api.service.impl.CurrencyServiceImpl;
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
 * Name:                   CurrencyController
 * Description:            Class that serves as proxy for all services available for the Currency entity
 *
 * @author teixbr
 * @version 1.0
 * @since 22/09/21
 */
@RestController
@RequestMapping("/currency")
public class CurrencyController extends BaseController
{
    private static final Logger _logger = LoggerFactory.getLogger( CurrencyController.class );

    @Autowired
    private CurrencyServiceImpl _service;

    /**
     * Find all transaction status
     *
     * @return List<CurrencyDTO>
     */
    @GetMapping( "/all" )
    public ResponseEntity<List<CurrencyDTO>> getAllCurrency()
    {
        _logger.debug( "getAllCurrency :: IN" );

        try
        {
            final List<CurrencyDTO> answer = _service.findAll();

            _logger.debug( "getAllCurrency :: OUT" );

            return new ResponseEntity<>( answer, HttpStatus.OK );
        }
        catch ( Exception e )
        {
            _logger.error( e.toString() );
            throw e;
        }
    }
}
