package com.example.module.books.mapper;

import com.example.module.books.dto.BookDetailsDto;
import com.example.module.books.entity.BooksDetailsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BookDetailsMapperTest {

    @InjectMocks
    private BookDetailsMapper bookDetailsMapper;

    private static final String ISBN = "000";
    private static final String LANG = "PL";


    @Test
    public void shouldReturnNotNullObject() {
        //given
        BooksDetailsEntity details = null;
        //when
        BookDetailsDto dto = bookDetailsMapper.map(details);
        //then
        assertThat(dto).isNotNull();
    }

    @Test
    public void name(){
        //given
        BooksDetailsEntity details= new BooksDetailsEntity()
                .setIsbn(ISBN)
                .setLang(LANG);
        //when
        BookDetailsDto dto= bookDetailsMapper.map(details);
        //then
        assertThat(dto.getIsbn()).isEqualTo(ISBN);
        assertThat(dto.getLang()).isEqualTo(LANG);
    }


}