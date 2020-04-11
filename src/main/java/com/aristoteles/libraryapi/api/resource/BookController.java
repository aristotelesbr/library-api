package com.aristoteles.libraryapi.api.resource;

import com.aristoteles.libraryapi.api.dto.BookDTO;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public BookDTO create() {
    BookDTO dto = new BookDTO();
    dto.setId((long) 1);
    dto.setAuthor("Autor");
    dto.setTitle("Meu Livro");
    dto.setIsbn("123123");
    return dto;
  }
}
