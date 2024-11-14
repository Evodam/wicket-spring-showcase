package de.evodam.wicketspringshowcase

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
open class MyService {

    @Autowired
    lateinit var myRepository: MyRepository
}
