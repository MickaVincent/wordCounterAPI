package com.mvincent.digitalAPI;

import com.mvincent.digitalAPI.Controllers.CounterController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterRestService {

    private static final Logger logger = LoggerFactory.getLogger(CounterRestService.class);

}

