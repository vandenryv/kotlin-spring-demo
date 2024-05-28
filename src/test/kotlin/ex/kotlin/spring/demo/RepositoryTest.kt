package ex.kotlin.spring.demo

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoryTest (
    @Autowired val entityManager: TestEntityManager,
    @Autowired val repository: CarRepository)
{
    @Test
    fun findById(){
        entityManager.persist(Car(123,"Red",1200,null))
        entityManager.flush()

        val fetched = repository.findByIdOrNull(123)
        assertThat(fetched?.color).isEqualTo("Red")
    }

    @Test
    fun findByColor(){
        entityManager.persist(Car(123,"Red",1200,null))
        entityManager.flush()

        val fetched = repository.findAllByColor("Red")
        assertThat(fetched.getOrNull(0)?.id).isEqualTo(123)

        val fetchedBlue = repository.findAllByColor("Blue")
        assertThat(fetchedBlue.size).isEqualTo(0)
    }
}