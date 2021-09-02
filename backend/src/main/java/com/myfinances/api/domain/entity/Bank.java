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
 * Name:                   Bank
 * Description:            Class that represents a Bank's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "bank", schema = "public" )
public class Bank extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            Bank's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Account List
     * Description:            List of Account that contains a Bank
     */
    @OneToMany( mappedBy = "_bank", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Account> _accountList;

    //endregion

    //region Constructors

    /**
     * Name:                Bank
     * Description:         Method to initializes a Bank Entity (Empty constructor)
     */
    public Bank()
    {
        _accountList = new ArrayList<>();
    }

    /**
     * Name:                Bank
     * Description:         Method to initializes a Bank Entity
     */
    public Bank( long id )
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
