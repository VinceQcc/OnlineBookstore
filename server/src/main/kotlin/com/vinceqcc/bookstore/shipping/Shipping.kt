package com.vinceqcc.bookstore.shipping

import jakarta.persistence.*
import org.springframework.data.repository.CrudRepository

enum class ShippingStatus {
    PENDING, SHIPPED, DELIVERED
}

@Table(name = "shippings")
@Entity
data class Shipping(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false, unique = true)
    var id: String? = null,

    @Column(nullable = false)
    val address: String? = null,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val status: ShippingStatus? = null,
)

interface ShippingRepository : CrudRepository<Shipping, String> {}