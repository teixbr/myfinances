package com.myfinances.api.domain.entity;

/**
 * System:                 MyFinancesAPI
 * Name:                   EntityFactory
 * Description:            Class that handles the use of the Factory pattern for the Entity module
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
public class EntityFactory
{
    /**
     * Method that returns a new instance of Account Class
     */
    static public Account createAccount()
    {
        return new Account();
    }

    /**
     * Method that returns a new instance of Account Class
     */
    static public Account createAccount( long id )
    {
        return new Account( id );
    }

    /**
     * Method that returns a new instance of AccountType Class
     */
    static public AccountType createAccountType()
    {
        return new AccountType();
    }

    /**
     * Method that returns a new instance of AccountType Class
     */
    static public AccountType createAccountType( long id )
    {
        return new AccountType( id );
    }

    /**
     * Method that returns a new instance of Bank Class
     */
    static public Bank createBank()
    {
        return new Bank();
    }

    /**
     * Method that returns a new instance of Bank Class
     */
    static public Bank createBank( long id )
    {
        return new Bank( id );
    }

    /**
     * Method that returns a new instance of Currency Class
     */
    static public Currency createCurrency()
    {
        return new Currency();
    }

    /**
     * Method that returns a new instance of Currency Class
     */
    static public Currency createCurrency( long id )
    {
        return new Currency( id );
    }

    /**
     * Method that returns a new instance of Person Class
     */
    static public Person createPerson()
    {
        return new Person();
    }

    /**
     * Method that returns a new instance of Person Class
     */
    static public Person createPerson( long id )
    {
        return new Person( id );
    }

    /**
     * Method that returns a new instance of Transaction Class
     */
    static public Transaction createTransaction()
    {
        return new Transaction();
    }

    /**
     * Method that returns a new instance of Transaction Class
     */
    static public Transaction createTransaction( long id )
    {
        return new Transaction( id );
    }

    /**
     * Method that returns a new instance of TransactionDetail Class
     */
    static public TransactionDetail createTransactionDetail()
    {
        return new TransactionDetail();
    }

    /**
     * Method that returns a new instance of TransactionDetail Class
     */
    static public TransactionDetail createTransactionDetail( long id )
    {
        return new TransactionDetail( id );
    }
    
    /**
     * Method that returns a new instance of TransactionDetailType Class
     */
    static public TransactionDetailType createTransactionDetailType()
    {
        return new TransactionDetailType();
    }

    /**
     * Method that returns a new instance of TransactionDetailType Class
     */
    static public TransactionDetailType createTransactionDetailType( long id )
    {
        return new TransactionDetailType( id );
    }

    /**
     * Method that returns a new instance of TransactionMethod Class
     */
    static public TransactionMethod createTransactionMethod()
    {
        return new TransactionMethod();
    }

    /**
     * Method that returns a new instance of TransactionMethod Class
     */
    static public TransactionMethod createTransactionMethod( long id )
    {
        return new TransactionMethod( id );
    }

    /**
     * Method that returns a new instance of TransactionReason Class
     */
    static public TransactionReason createTransactionReason()
    {
        return new TransactionReason();
    }

    /**
     * Method that returns a new instance of TransactionReason Class
     */
    static public TransactionReason createTransactionReason( long id )
    {
        return new TransactionReason( id );
    }
    
    /**
     * Method that returns a new instance of TransactionType Class
     */
    static public TransactionType createTransactionType()
    {
        return new TransactionType();
    }

    /**
     * Method that returns a new instance of TransactionType Class
     */
    static public TransactionType createTransactionType( long id )
    {
        return new TransactionType( id );
    }
}
