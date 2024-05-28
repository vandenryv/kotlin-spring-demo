package ex.kotlin.spring.demo

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Car (
    @Id
    var id: Int,
    var color: String,
    var weight: Int,
    var maxSpeed: Int?
)