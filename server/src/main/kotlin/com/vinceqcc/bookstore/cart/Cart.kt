package com.vinceqcc.bookstore.cart

import com.vinceqcc.bookstore.user.User
import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository
import java.time.Instant

@Table(name = "carts")
@Entity
data class Cart(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false, unique = true)
    var id: String? = null,

    @OneToOne
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "id",
        nullable = false,
        unique = true,
    )
    val user: User? = null,

    val createdAt: Instant? = null,
    val updatedAt: Instant? = null,
)

interface CartRepository : CrudRepository<Cart, String> {}