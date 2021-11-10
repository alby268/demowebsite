package com.albin.demowebsite.service;

import com.albin.demowebsite.model.Detail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List<Detail> getDetails() {

        List<Detail> details = new ArrayList<>();
        Detail detail1 = new Detail(1,"First Name");
        Detail detail2 = new Detail(2,"Last Name");
        Detail detail3 = new Detail(3,"Email");
        Detail detail4 = new Detail(4,"Password");
        Detail detail5 = new Detail(5,"Re-type Password");

        details.add(detail1);
        details.add(detail2);

        details.add(detail3);
        details.add(detail4);

        details.add(detail5);

        return details;


    }

}
