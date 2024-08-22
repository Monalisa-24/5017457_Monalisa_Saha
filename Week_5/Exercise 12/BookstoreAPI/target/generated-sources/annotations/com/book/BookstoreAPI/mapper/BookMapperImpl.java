package com.book.BookstoreAPI.mapper;

import com.book.BookstoreAPI.dto.BookDTO;
import com.book.BookstoreAPI.model.Book;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T15:23:10+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240725-1906, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDTO toDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO.BookDTOBuilder bookDTO = BookDTO.builder();

        bookDTO.author( book.getAuthor() );
        bookDTO.id( book.getId() );
        bookDTO.isbn( book.getIsbn() );
        if ( book.getPrice() != null ) {
            bookDTO.price( book.getPrice() );
        }
        bookDTO.title( book.getTitle() );

        return bookDTO.build();
    }

    @Override
    public Book toEntity(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Book book = new Book();

        book.setAuthor( bookDTO.getAuthor() );
        book.setId( bookDTO.getId() );
        book.setIsbn( bookDTO.getIsbn() );
        book.setPrice( bookDTO.getPrice() );
        book.setTitle( bookDTO.getTitle() );

        return book;
    }
}
