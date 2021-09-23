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

    /**
     * Method that returns a new instance of CurrencyDTO Class
     */
    static public CurrencyDTO createCurrencyDTO()
    {
        return new CurrencyDTO();
    }

    /**
     * Method that returns a new instance of CurrencyDTO Class
     */
    static public CurrencyDTO createCurrencyDTO( long id )
    {
        return new CurrencyDTO( id );
    }

    /**
     * Method that returns a new instance of TransactionDetailTypeDTO Class
     */
    static public TransactionDetailTypeDTO createTransactionDetailTypeDTO()
    {
        return new TransactionDetailTypeDTO();
    }

    /**
     * Method that returns a new instance of TransactionDetailTypeDTO Class
     */
    static public TransactionDetailTypeDTO createTransactionDetailTypeDTO( long id )
    {
        return new TransactionDetailTypeDTO( id );
    }

    /**
     * Method that returns a new instance of TransactionMethodDTO Class
     */
    static public TransactionMethodDTO createTransactionMethodDTO()
    {
        return new TransactionMethodDTO();
    }

    /**
     * Method that returns a new instance of TransactionMethodDTO Class
     */
    static public TransactionMethodDTO createTransactionMethodDTO( long id )
    {
        return new TransactionMethodDTO( id );
    }

    /**
     * Method that returns a new instance of TransactionTypeDTO Class
     */
    static public TransactionTypeDTO createTransactionTypeDTO()
    {
        return new TransactionTypeDTO();
    }

    /**
     * Method that returns a new instance of TransactionTypeDTO Class
     */
    static public TransactionTypeDTO createTransactionTypeDTO( long id )
    {
        return new TransactionTypeDTO( id );
    }

    /**
     * Method that returns a new instance of TransactionReasonDTO Class
     */
    static public TransactionReasonDTO createTransactionReasonDTO()
    {
        return new TransactionReasonDTO();
    }

    /**
     * Method that returns a new instance of TransactionReasonDTO Class
     */
    static public TransactionReasonDTO createTransactionReasonDTO( long id )
    {
        return new TransactionReasonDTO( id );
    }
}
