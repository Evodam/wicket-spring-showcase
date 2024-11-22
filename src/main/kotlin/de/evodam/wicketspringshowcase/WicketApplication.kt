package de.evodam.playground.de.evodam.wicketspringshowcase

import com.giffing.wicket.spring.boot.starter.app.WicketBootStandardWebApplication
import de.evodam.wicketspringshowcase.HomePage
import de.evodam.wicketspringshowcase.JavaHomePage
import org.apache.wicket.Page
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder


fun main() {
    SpringApplicationBuilder()
        .sources(WicketApplication::class.java)
        .run()
}

@SpringBootApplication(scanBasePackages = ["de.evodam.wicketspringshowcase"])
open class WicketApplication : WicketBootStandardWebApplication() {

    override fun getHomePage(): Class<out Page> {
        return JavaHomePage::class.java
    }
}
