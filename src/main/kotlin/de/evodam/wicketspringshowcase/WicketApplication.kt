package de.evodam.wicketspringshowcase

import com.giffing.wicket.spring.boot.starter.app.WicketBootStandardWebApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder


fun main() {
    SpringApplicationBuilder()
        .sources(WicketApplication::class.java)
        .run()
}

@SpringBootApplication(scanBasePackages = ["de.evodam.wicketspringshowcase"])
open class WicketApplication :WicketBootStandardWebApplication() {

}
