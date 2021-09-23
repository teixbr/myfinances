package com.myfinances.api.logic.mapper;

import com.myfinances.api.domain.DTO.TransactionDetailTypeDTO;
import com.myfinances.api.domain.DTO.DTOFactory;
import com.myfinances.api.domain.entity.TransactionDetailType;
import com.myfinances.api.domain.entity.EntityFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * System:                 MyFinancesAPI
 * Name:                   TransactionDetailTypeMapper
 * Description:            Class for handling mapping between Dto´s and TransactionDetailType Entity classes
 *
 * @author teixbr
 * @version 1.0
 * @since 21/09/21
 */
public class TransactionDetailTypeMapper extends BaseMapper
{
    public static List<TransactionDetailTypeDTO> mapEntityToDtoList( List<TransactionDetailType> entityList )
    {
        return new ArrayList<TransactionDetailTypeDTO>()
        {{
            if ( !entityList.isEmpty() )
            {
                for ( TransactionDetailType entity : entityList )
                {
                    add( mapEntityToDto( entity ) );
                }
            }
        }};
    }

    public static TransactionDetailTypeDTO mapEntityToDto( TransactionDetailType entity )
    {
        final TransactionDetailTypeDTO answer = DTOFactory.createTransactionDetailTypeDTO( entity.getId() );

        answer.setName( entity.getName() );

        return answer;
    }

    public static TransactionDetailType mapIdToEntity( long id )
    {
        BaseMapper.validate( id, "transactionDetailTypeId" );

        return EntityFactory.createTransactionDetailType( id );
    }
}