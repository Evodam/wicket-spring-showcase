package de.evodam.wicketspringshowcase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyJavaService {

    @Autowired
    MyJavaRepository myJavaRepository;

    public MyJavaService() {
    }

    public MyJavaService(MyJavaRepository myJavaRepository) {
        this.myJavaRepository = myJavaRepository;
    }
}
