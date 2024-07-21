package com.vinceqcc.bookstore

import com.vinceqcc.bookstore.book.Book
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookstoreApplication

fun main(args: Array<String>) {
	val book = Book("haha" , "lol")
	val book1 = Book.Builder().id("haha").title("lol").build()
	runApplication<BookstoreApplication>(*args)
}
