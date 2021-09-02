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
 * Name:                   Person
 * Description:            Class that represents a Person's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "person", schema = "public" )
public class Person extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            Person's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Last Name
     * Description:            Person's Last Name Attribute
     */
    @Column( name = "lastname", nullable = false )
    private String _lastName;

    /**
     * Name:                   Transaction List
     * Description:            List of Transaction that contains a Person
     */
    @OneToMany( mappedBy = "_person", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Transaction> _transactionList;

    //endregion

    //region Constructors

    /**
     * Name:                Person
     * Description:         Method to initializes a Person Entity (Empty constructor)
     */
    public Person()
    {
        _transactionList = new ArrayList<>();
    }

    /**
     * Name:                Person
     * Description:         Method to initializes a Person Entity
     */
    public Person( long id )
    {
        super( id );
        _transactionList = new ArrayList<>();
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

    public String getLastName()
    {
        return _lastName;
    }

    public void setLastName( String lastName )
    {
        _lastName = lastName;
    }

    public List<Transaction> getTransactionList()
    {
        return _transactionList;
    }

    public void setTransactionList( List<Transaction> transactionList )
    {
        _transactionList = transactionList;
    }

    //endregion
}
