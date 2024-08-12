package com.vinceqcc.bookstore.book

import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository
import java.time.LocalDate

@Table(name = "books")
@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, unique = true, nullable = false)
    var id: String? = null,

    val title: String,
    val author: String,
    val description: String? = null,
    val price: Double,
    val stockQuantity: Int? = 0,
    val publishedDate: LocalDate,
    val imageUrl: String? = null,
    val genre: String? = null,
)

interface BookRepository : CrudRepository<Book, String> {}