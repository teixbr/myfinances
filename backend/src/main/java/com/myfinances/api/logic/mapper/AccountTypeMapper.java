package com.myfinances.api.logic.mapper;

import com.myfinances.api.domain.DTO.AccountTypeDTO;
import com.myfinances.api.domain.DTO.DTOFactory;
import com.myfinances.api.domain.entity.AccountType;
import com.myfinances.api.domain.entity.EntityFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * System:                 FlexiTest
 * Name:                   AccountTypeMapper
 * Description:            Class for handling mapping between Dto´s and AccountType Entity classes
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
public class AccountTypeMapper extends BaseMapper
{
    public static List<AccountTypeDTO> mapEntityToDtoList( List<AccountType> entityList )
    {
        return new ArrayList<AccountTypeDTO>() {{
            if ( !entityList.isEmpty() )
            {
                for( AccountType entity : entityList )
                {
                    add( mapEntityToDto( entity ) );
                }
            }
        }};
    }

    public static AccountTypeDTO mapEntityToDto( AccountType entity )
    {
        final AccountTypeDTO answer = DTOFactory.createAccountTypeDTO( entity.getId() );

        answer.setName( entity.getName() );

        return answer;
    }

    public static AccountType mapIdToEntity( long id )
    {
        BaseMapper.validate( id, "accountTypeId" );

        return EntityFactory.createAccountType( id );
    }
}