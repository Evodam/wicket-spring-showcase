package de.evodam.wicketspringshowcase;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyJavaService {

    @SpringBean
    public MyJavaRepository myJavaRepository;

    public MyJavaService() {
        Injector.get().inject(this);
    }

    @Autowired
    public MyJavaService(MyJavaRepository myJavaRepository) {
        this.myJavaRepository = myJavaRepository;
    }
}
