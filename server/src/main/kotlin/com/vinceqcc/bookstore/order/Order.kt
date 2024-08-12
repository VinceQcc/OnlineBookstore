package com.vinceqcc.bookstore.order

import com.vinceqcc.bookstore.book.Book
import com.vinceqcc.bookstore.user.User
import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository
import java.time.Instant

@Table(name = "orders")
@Entity
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false, unique = true)
    var id: String? = null,

    @ManyToOne
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        nullable = false,
    )
    val user: User? = null,

    @ManyToOne
    @JoinColumn(
        name = "book_id",
        referencedColumnName = "id",
        nullable = false,
    )
    val book: Book? = null,

    @Column(nullable = false)
    val orderedAt: Instant? = null,

    @Column(nullable = false)
    val quantity: Int? = null,
)

interface OrderRepository : CrudRepository<Order, String> {}