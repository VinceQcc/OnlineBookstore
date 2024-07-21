package com.vinceqcc.bookstore.book

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor


@Table(name = "books")
@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, unique = true, nullable = false)
    var id: String?,

    @Column(unique = false)
    var title: String = "",
) {
    constructor() : this(id = "", title = "")

    class Builder {
        private var id: String = "";
        private var title: String = "";

        fun id(id: String) = apply { this.id = id }
        fun title(title: String) = apply { this.title = title }
        fun build() = Book(id, title)
    }
}