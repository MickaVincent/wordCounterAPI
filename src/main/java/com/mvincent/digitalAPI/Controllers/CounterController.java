package com.mvincent.digitalAPI.Controllers;

import com.mvincent.digitalAPI.KeywordNotFoundException;
import com.mvincent.digitalAPI.Models.CounterModel;
import com.mvincent.digitalAPI.Repositories.CounterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CounterController  {

    private final CounterRepository repository;

    public CounterController(CounterRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/initialize")
    public CounterModel initializeCounter(@RequestParam("keyword") String value){

        CounterModel newCounter = new CounterModel(value);
        return repository.save(newCounter);
    };

    @GetMapping("/getAll")
    public List<CounterModel> getAll(){
        return repository.findAll();
    }

    @GetMapping("/counter")
    public CounterModel getCounter(@RequestParam("keyword") String value){
        return repository.findById(value).orElseThrow(() -> new KeywordNotFoundException(value));
    };

    @PatchMapping("/increment")
    public CounterModel incrementCounter(String keyword){
        CounterModel counter = getCounter(keyword);

        counter.keywordCounter++;

        return repository.save(counter);
    };

    @DeleteMapping("/delete")
    public void deleteCounter(@RequestParam("keyword") String keyword){
        repository.deleteById(keyword);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll(){
        repository.deleteAll();
    }

}
