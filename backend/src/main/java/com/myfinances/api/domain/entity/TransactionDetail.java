package com.myfinances.api.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionDetail
 * Description:            Class that represents a TransactionDetail's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "transaction_detail", schema = "public" )
public class TransactionDetail extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Amount
     * Description:            TransactionDetail's Amount Attribute
     */
    @Column( name = "amount", nullable = false )
    private double _amount;

    /**
     * Name:                   FK_TransactionDetailType
     * Description:            Foreign key of TransactionDetail-TransactionDetailType
     */
    @ManyToOne
    @JoinColumn( name = "fk_transactiondetailtype", nullable = false )
    private TransactionDetailType _transactionDetailType;

    /**
     * Name:                   FK_Transaction
     * Description:            Foreign key of TransactionDetail-Transaction
     */
    @ManyToOne
    @JoinColumn( name = "fk_transaction", nullable = false )
    private Transaction _transaction;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionDetail
     * Description:         Method to initializes a TransactionDetail Entity (Empty constructor)
     */
    public TransactionDetail()
    {

    }

    /**
     * Name:                TransactionDetail
     * Description:         Method to initializes a TransactionDetail Entity
     */
    public TransactionDetail( long id )
    {
        super( id );
    }

    //endregion

    //Getters & Setters

    public double getAmount()
    {
        return _amount;
    }

    public void setAmount( double amount )
    {
        _amount = amount;
    }

    public TransactionDetailType getTransactionDetailType()
    {
        return _transactionDetailType;
    }

    public void setTransactionDetailType( TransactionDetailType transactionDetailType )
    {
        _transactionDetailType = transactionDetailType;
    }

    public Transaction getTransaction()
    {
        return _transaction;
    }

    public void setTransaction( Transaction transaction )
    {
        _transaction = transaction;
    }

    //endregion
}
