package de.evodam.wicketspringshowcase;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;

@WicketHomePage
public class JavaHomePage extends WebPage {

    @SpringBean
    private MyJavaRepository myJavaRepository;

    @SpringBean
    private MyJavaService myJavaService;

    @Override
    protected void onInitialize() {
        super.onInitialize();

        System.out.println(myJavaRepository);

        System.out.println(myJavaService);
        System.out.println(myJavaService.myJavaRepository);
    }
}
