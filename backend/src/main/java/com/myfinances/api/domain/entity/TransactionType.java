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
 * Name:                   TransactionType
 * Description:            Class that represents a TransactionType's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "transaction_type", schema = "public" )
public class TransactionType extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            TransactionType's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Transaction List
     * Description:            List of Transaction that contains a TransactionType
     */
    @OneToMany( mappedBy = "_transactionType", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<Transaction> _transactionList;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionType
     * Description:         Method to initializes a TransactionType Entity (Empty constructor)
     */
    public TransactionType()
    {
        _transactionList = new ArrayList<>();
    }

    /**
     * Name:                TransactionType
     * Description:         Method to initializes a TransactionType Entity
     */
    public TransactionType( long id )
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
