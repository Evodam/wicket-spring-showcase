package de.evodam.wicketspringshowcase

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.spring.injection.annot.SpringBean
import org.springframework.stereotype.Component

open class HomePage : WebPage(){

//    @SpringBean
//    lateinit var myService: MyService

    @SpringBean
    lateinit var myJavaService: MyJavaService

    override fun onInitialize() {
        super.onInitialize()

//        println(myService)
//        println(myService.myRepository)
        println(myJavaService.myJavaRepository)
    }
}
