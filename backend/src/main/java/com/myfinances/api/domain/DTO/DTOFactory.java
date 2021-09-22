package com.myfinances.api.domain.DTO;

/**
 * System:                 MyFinancesAPI
 * Name:                   DTOFactory
 * Description:            Class that handles the use of the Factory pattern for the DTO module
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class DTOFactory
{
    /**
     * Method that returns a new instance of AccountTypeDTO Class
     */
    static public AccountTypeDTO createAccountTypeDTO()
    {
        return new AccountTypeDTO();
    }

    /**
     * Method that returns a new instance of AccountTypeDTO Class
     */
    static public AccountTypeDTO createAccountTypeDTO( long id )
    {
        return new AccountTypeDTO( id );
    }
}
