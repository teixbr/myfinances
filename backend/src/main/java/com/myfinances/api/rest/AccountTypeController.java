package com.myfinances.api.rest;

import com.myfinances.api.domain.DTO.AccountTypeDTO;
import com.myfinances.api.service.impl.AccountTypeServiceImpl;
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
 * Name:                   AccountTypeController
 * Description:            Class that serves as proxy for all services available for the AccountType entity
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
@RestController
@RequestMapping("/accounttype")
public class AccountTypeController extends BaseController
{
    private static final Logger logger = LoggerFactory.getLogger( AccountTypeController.class );

    @Autowired
    private AccountTypeServiceImpl service;

    /**
     * Find all transaction status
     *
     * @return List<AccountTypeDTO>
     */
    @GetMapping( "/all" )
    public ResponseEntity<List<AccountTypeDTO>> getAllAccountType()
    {
        logger.debug( "getAllAccountType :: IN" );

        try
        {
            final List<AccountTypeDTO> answer = service.findAll();

            logger.debug( "getAllAccountType :: OUT" );

            return new ResponseEntity<>( answer, HttpStatus.OK );
        }
        catch ( Exception e )
        {
            logger.error( e.toString() );
            throw e;
        }
    }
}
