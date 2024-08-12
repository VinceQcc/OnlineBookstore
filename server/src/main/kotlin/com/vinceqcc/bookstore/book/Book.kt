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

    @Column(nullable = false)
    val title: String? = null,

    @Column(nullable = false)
    val author: String? = null,

    @Column(nullable = false)
    val price: Double? = null,

    @Column(nullable = false)
    val stockQuantity: Int? = 0,

    @Column(nullable = false)
    val publishedDate: LocalDate? = null,

    val description: String? = null,
    val imageUrl: String? = null,
    val genre: String? = null,
)

interface BookRepository : CrudRepository<Book, String> {}