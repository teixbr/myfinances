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
 * Name:                   TransactionReason
 * Description:            Class that represents a TransactionReason's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "transaction_reason", schema = "public" )
public class TransactionReason extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            TransactionReason's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Transaction List
     * Description:            List of Transaction that contains a TransactionReason
     */
    @OneToMany( mappedBy = "_transactionReason", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Transaction> _transactionList;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionReason
     * Description:         Method to initializes a TransactionReason Entity (Empty constructor)
     */
    public TransactionReason()
    {
        _transactionList = new ArrayList<>();
    }

    /**
     * Name:                TransactionReason
     * Description:         Method to initializes a TransactionReason Entity
     */
    public TransactionReason( long id )
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
