package com.myfinances.api.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   Transaction
 * Description:            Class that represents a Transaction's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "transaction", schema = "public" )
public class Transaction extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Date
     * Description:            Transaction's Date Attribute
     */
    @Column( name = "date", nullable = false )
    private LocalDateTime _date;

    /**
     * Name:                   Merchant
     * Description:            Transaction's Merchant Attribute
     */
    @Column( name = "merchant", nullable = false )
    private String _merchant;

    /**
     * Name:                   Description
     * Description:            Transaction's Description Attribute
     */
    @Column( name = "description", nullable = false )
    private String _description;

    /**
     * Name:                   Amount
     * Description:            Transaction's Amount Attribute
     */
    @Column( name = "amount", nullable = false )
    private double _amount;

    /**
     * Name:                   Month
     * Description:            Transaction's Month Attribute
     */
    @Column( name = "month" )
    private int _month;

    /**
     * Name:                   FK_TransactionType
     * Description:            Foreign key of Transaction-TransactionType
     */
    @ManyToOne
    @JoinColumn( name = "fk_transactiontype", nullable = false )
    private TransactionType _transactionType;

    /**
     * Name:                   FK_TransactionMethod
     * Description:            Foreign key of Transaction-TransactionMethod
     */
    @ManyToOne
    @JoinColumn( name = "fk_transactionmethod", nullable = false )
    private TransactionMethod _transactionMethod;

    /**
     * Name:                   FK_Currency
     * Description:            Foreign key of Transaction-Currency
     */
    @ManyToOne
    @JoinColumn( name = "fk_currency", nullable = false )
    private Currency _currency;

    /**
     * Name:                   FK_Person
     * Description:            Foreign key of Transaction-Person
     */
    @ManyToOne
    @JoinColumn( name = "fk_person" )
    private Person _person;

    /**
     * Name:                   FK_Account
     * Description:            Foreign key of Transaction-Account
     */
    @ManyToOne
    @JoinColumn( name = "fk_account" )
    private Account _account;

    /**
     * Name:                   FK_TransactionReason
     * Description:            Foreign key of Transaction-TransactionReason
     */
    @ManyToOne
    @JoinColumn( name = "fk_transactionreason", nullable = false )
    private TransactionReason _transactionReason;

    /**
     * Name:                   TransactionDetail List
     * Description:            List of TransactionDetail that contains a Transaction
     */
    @OneToMany( mappedBy = "_transaction", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<TransactionDetail> _transactionDetailList;

    //endregion

    //region Constructors

    /**
     * Name:                Transaction
     * Description:         Method to initializes a Transaction Entity (Empty constructor)
     */
    public Transaction()
    {
        _transactionDetailList = new ArrayList<>();
    }

    /**
     * Name:                Transaction
     * Description:         Method to initializes a Transaction Entity
     */
    public Transaction( long id )
    {
        super( id );
        _transactionDetailList = new ArrayList<>();
    }

    //endregion

    //Getters & Setters

    public LocalDateTime getDate()
    {
        return _date;
    }

    public void setDate( LocalDateTime date )
    {
        _date = date;
    }

    public String getMerchant()
    {
        return _merchant;
    }

    public void setMerchant( String merchant )
    {
        _merchant = merchant;
    }

    public String getDescription()
    {
        return _description;
    }

    public void setDescription( String description )
    {
        _description = description;
    }

    public double getAmount()
    {
        return _amount;
    }

    public void setAmount( double amount )
    {
        _amount = amount;
    }

    public int getMonth()
    {
        return _month;
    }

    public void setMonth( int month )
    {
        _month = month;
    }

    public TransactionType getTransactionType()
    {
        return _transactionType;
    }

    public void setTransactionType( TransactionType transactionType )
    {
        _transactionType = transactionType;
    }

    public TransactionMethod getTransactionMethod()
    {
        return _transactionMethod;
    }

    public void setTransactionMethod( TransactionMethod transactionMethod )
    {
        _transactionMethod = transactionMethod;
    }

    public Currency getCurrency()
    {
        return _currency;
    }

    public void setCurrency( Currency currency )
    {
        _currency = currency;
    }

    public TransactionReason getTransactionReason()
    {
        return _transactionReason;
    }

    public void setTransactionReason( TransactionReason transactionReason )
    {
        _transactionReason = transactionReason;
    }

    public List<TransactionDetail> getTransactionDetailList()
    {
        return _transactionDetailList;
    }

    public void setTransactionDetailList( List<TransactionDetail> transactionDetailList )
    {
        _transactionDetailList = transactionDetailList;
    }

    public Person getPerson()
    {
        return _person;
    }

    public void setPerson( Person person )
    {
        _person = person;
    }

    public Account getAccount()
    {
        return _account;
    }

    public void setAccount( Account account )
    {
        _account = account;
    }

    //endregion
}
