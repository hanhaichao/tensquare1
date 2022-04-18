package com.tensquare.sms;

import com.tensquare.sms.client.LabelClient;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
    @Autowired
    private LabelClient labelClient;

    @RequestMapping(value = "/label/{labelid}")
    public Result findLabelById(@PathVariable String labelid) {
        Result result = labelClient.findById(labelid);
        return result;
    }
}
