package com.myfinances.api.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * System:                 MyFinancesAPI
 * Name:                   Account
 * Description:            Class that represents a Account's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "account", schema = "public" )
public class Account extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            Account's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   FK_AccountType
     * Description:            Foreign key of Account-AccountType
     */
    @ManyToOne
    @JoinColumn( name = "fk_acountype" )
    private AccountType _accountType;

    /**
     * Name:                   FK_Account
     * Description:            Foreign key of Account-Bank
     */
    @ManyToOne
    @JoinColumn( name = "fk_bank" )
    private Bank _bank;

    //endregion

    //region Constructors

    /**
     * Name:                Account
     * Description:         Method to initializes a Account Entity (Empty constructor)
     */
    public Account()
    {

    }

    /**
     * Name:                Account
     * Description:         Method to initializes a Account Entity
     */
    public Account( long id )
    {
        super( id );
    }

    //endregion

    //Getters & Setters

    public String getName()
    {
        return _name;
    }

    public void setName( String name )
    {
        _name = name;
    }

    public AccountType getAccountType()
    {
        return _accountType;
    }

    public void setAccountType( AccountType accountType )
    {
        _accountType = accountType;
    }

    public Bank getBank()
    {
        return _bank;
    }

    public void setBank( Bank bank )
    {
        _bank = bank;
    }

    //endregion
}
