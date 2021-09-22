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
 * Name:                   TransactionMethod
 * Description:            Class that represents a TransactionMethod's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "transaction_method", schema = "public" )
public class TransactionMethod extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            TransactionMethod's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Transaction List
     * Description:            List of Transaction that contains a TransactionMethod
     */
    @OneToMany( mappedBy = "_transactionMethod", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Transaction> _transactionList;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionMethod
     * Description:         Method to initializes a TransactionMethod Entity (Empty constructor)
     */
    public TransactionMethod()
    {
        _transactionList = new ArrayList<>();
    }

    /**
     * Name:                TransactionMethod
     * Description:         Method to initializes a TransactionMethod Entity
     */
    public TransactionMethod( long id )
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
