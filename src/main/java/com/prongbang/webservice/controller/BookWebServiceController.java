/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prongbang.webservice.controller;

import com.prongbang.entity.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author prongbang
 */
@RestController
@RequestMapping("/service/")
public class BookWebServiceController {

    @RequestMapping(value = "book", method = RequestMethod.GET)
    public List<Book> list() {

        List<Book> books = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("Book " + i);
            book.setPrice(1000d * i);
            books.add(book);
        }
        return books;
    }

}
