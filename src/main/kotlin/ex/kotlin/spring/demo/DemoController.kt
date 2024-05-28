package ex.kotlin.spring.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/hello")
    fun hello_world(): String {
        return "hello_world"
    }
}