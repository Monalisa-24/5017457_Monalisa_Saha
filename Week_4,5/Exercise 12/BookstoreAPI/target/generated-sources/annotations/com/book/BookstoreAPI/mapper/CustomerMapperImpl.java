package com.book.BookstoreAPI.mapper;

import com.book.BookstoreAPI.dto.CustomerDTO;
import com.book.BookstoreAPI.model.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T15:23:09+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240725-1906, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer toDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Customer.CustomerBuilder customer1 = Customer.builder();

        customer1.address( customer.getAddress() );
        customer1.email( customer.getEmail() );
        customer1.id( customer.getId() );
        customer1.name( customer.getName() );

        return customer1.build();
    }

    @Override
    public Customer toEntity(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.address( customerDTO.getAddress() );
        customer.email( customerDTO.getEmail() );
        customer.id( customerDTO.getId() );
        customer.name( customerDTO.getName() );

        return customer.build();
    }
}
