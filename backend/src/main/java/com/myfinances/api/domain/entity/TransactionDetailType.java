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
 * Name:                   TransactionDetailType
 * Description:            Class that represents a TransactionDetailType's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@Entity
@Table( name = "person", schema = "public" )
public class TransactionDetailType extends BaseEntity
{
    //region Attributes

    /**
     * Name:                   Name
     * Description:            TransactionDetailType's Name Attribute
     */
    @Column( name = "name", nullable = false )
    private String _name;

    /**
     * Name:                   Transaction List
     * Description:            List of TransactionDetail that contains a TransactionDetailType
     */
    @OneToMany( mappedBy = "_transactionDetail", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private List<TransactionDetail> _transactionDetailList;

    //endregion

    //region Constructors

    /**
     * Name:                TransactionDetailType
     * Description:         Method to initializes a TransactionDetailType Entity (Empty constructor)
     */
    public TransactionDetailType()
    {
        _transactionDetailList = new ArrayList<>();
    }

    /**
     * Name:                TransactionDetailType
     * Description:         Method to initializes a TransactionDetailType Entity
     */
    public TransactionDetailType( long id )
    {
        super( id );
        _transactionDetailList = new ArrayList<>();
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

    public List<TransactionDetail> getTransactionDetailList()
    {
        return _transactionDetailList;
    }

    public void setTransactionDetailList( List<TransactionDetail> transactionDetailList )
    {
        _transactionDetailList = transactionDetailList;
    }


    //endregion
}
