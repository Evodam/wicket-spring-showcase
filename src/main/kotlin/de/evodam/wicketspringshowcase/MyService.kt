package de.evodam.wicketspringshowcase

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.io.Serializable

@Component
open class MyService {

    @Autowired
    lateinit var myRepository: MyRepository

    // ByteBuddy needs an empty constructor
    constructor(
    ) {
    }
}
