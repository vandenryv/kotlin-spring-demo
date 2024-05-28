package ex.kotlin.spring.demo

import org.springframework.data.repository.CrudRepository


interface CarRepository :CrudRepository<Car,Int> {
    fun findAllByColor(color: String): List<Car>
}