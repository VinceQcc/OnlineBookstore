package com.vinceqcc.bookstore.user

import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository
import java.time.Instant

@Table(name = "users")
@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, unique = true, nullable = false)
    var id: String?,

    @Column(nullable = false)
    val username: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val email: String,

    @Column(updatable = false, nullable = false)
    val createdAt: Instant? = null,
)

interface UserRepository : CrudRepository<User, String> {}