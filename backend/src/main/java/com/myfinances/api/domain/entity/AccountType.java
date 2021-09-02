package com.myfinances.api.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

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
@Table( name = "account_type", schema = "public" )
public class AccountType extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            AccountType's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Account List
     * Description:            List of Account that contains an AccountType
     */
    @OneToMany( mappedBy = "_accountType", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Account> _accountList;

    //endregion

    //region Constructors

    /**
     * Name:                AccountType
     * Description:         Method to initializes a AccountType Entity (Empty constructor)
     */
    public AccountType()
    {
        _accountList = new ArrayList<>();
    }

    /**
     * Name:                AccountType
     * Description:         Method to initializes a AccountType Entity
     */
    public AccountType( long id )
    {
        super( id );
        _accountList = new ArrayList<>();
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

    public List<Account> getAccountList()
    {
        return _accountList;
    }

    public void setAccountList( List<Account> accountList )
    {
        _accountList = accountList;
    }

    //endregion
}
