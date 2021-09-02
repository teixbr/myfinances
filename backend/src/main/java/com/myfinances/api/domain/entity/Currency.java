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
 * Name:                   Currency
 * Description:            Class that represents a Currency's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "currency", schema = "public" )
public class Currency extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            Currency's Name Attribute
     */
    @Column( name = "symbol", nullable = false )
    private String _symbol;

    /**
     * Name:                   Name
     * Description:            Currency's Abbreviation Attribute
     */
    @Column( name = "abbreviation", nullable = false )
    private String _abbreviation;

    /**
     * Name:                   Transaction List
     * Description:            List of Transaction that contains a Currency
     */
    @OneToMany( mappedBy = "_currency", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Transaction> _transactionList;

    //endregion

    //region Constructors

    /**
     * Name:                Currency
     * Description:         Method to initializes a Currency Entity (Empty constructor)
     */
    public Currency()
    {
        _transactionList = new ArrayList<>();
    }

    /**
     * Name:                Currency
     * Description:         Method to initializes a Currency Entity
     */
    public Currency( long id )
    {
        super( id );
        _transactionList = new ArrayList<>();
    }

    //endregion

    //Getters & Setters

    public String getSymbol()
    {
        return _symbol;
    }

    public void setSymbol( String symbol )
    {
        _symbol = symbol;
    }

    public String getAbbreviation()
    {
        return _abbreviation;
    }

    public void setAbbreviation( String abbreviation )
    {
        _abbreviation = abbreviation;
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
