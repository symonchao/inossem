package com.example.demo.controller;

import com.example.demo.domain.DemoEntity;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;
    /********save*********/

    /*@RequestMapping(value = "/save/{author}/{book}/{publishing}",method = RequestMethod.GET)
    @Transactional
    public DemoEntity save(@PathVariable String author, @PathVariable String book, @PathVariable String publishing) {
        DemoEntity demoEntity = new DemoEntity();//Id自增
        demoEntity.setAuthor(author);
        demoEntity.setBook(book);
        demoEntity.setPublishing(publishing);
        return demoService.save(demoEntity);
    }*/

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    @Transactional
    public DemoEntity save( String author,  String book,  String publishing) {
        DemoEntity demoEntity = new DemoEntity();//Id自增
        demoEntity.setAuthor(author);
        demoEntity.setBook(book);
        demoEntity.setPublishing(publishing);
        return demoService.save(demoEntity);
    }



    /**********query******/

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<DemoEntity> findAll() {

        return demoService.findAll();
    }


    /*@RequestMapping(value = "/findByAuthor/{author}", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public List<DemoEntity> findByAuthor(@PathVariable(name = "author")  String author) {
        return demoService.findByAuthor(author);
    }*/

    @RequestMapping(value = "/findByAuthor", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public List<DemoEntity> findByAuthor(String author) {
        return demoService.findByAuthor(author);
    }

    /*@RequestMapping(value = "/findByBook/{book}", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public List<DemoEntity> findByBook(@PathVariable(name = "book") String book) {
        return demoService.findByBook(book);
    }*/

    @RequestMapping(value = "/findByBook", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public List<DemoEntity> findByBook(String book) {
        return demoService.findByBook(book);
    }

    /*@RequestMapping(value = "/findByPublishing/{publishing}", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public List<DemoEntity> findByPublishing(@PathVariable(name = "publishing") String publishing) {
        return demoService.findByPublishing(publishing);
    }*/

    @RequestMapping(value = "/findByPublishing", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public List<DemoEntity> findByPublishing(String publishing) {
        return demoService.findByPublishing(publishing);
    }


    /***********update**************/
    /*@RequestMapping(value = "/updateDemoByAuthor/{book}/{author}", method = RequestMethod.GET)
    @Transactional
    public String updateDemoByAuthor(@PathVariable String book, @PathVariable String author) {
         demoService.updateDemoByAuthor(book, author);
         return "SUCCESS";
    }*/

    @RequestMapping(value = "/updateDemoByAuthor", method = RequestMethod.GET)
    @Transactional
    public String updateDemoByAuthor(String book, String author) {
        demoService.updateDemoByAuthor(book, author);
        return "SUCCESS";
    }
    /************delete***********/

    /*@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.GET)
    @Transactional
    public String deleteById(@PathVariable int id) {
        demoService.deleteById(id);
        return "SUCCESS";
    }*/

    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    @Transactional
    public String deleteById(int id) {
        demoService.deleteById(id);
        return "SUCCESS";
    }

    /*@RequestMapping(value = "/deleteByAuthor/{author}", method = RequestMethod.GET)
    @Transactional
    public String deleteByAuthor(@PathVariable String author) {
        demoService.deleteByAuthor(author);
        return "SUCCESS";
    }*/

    @RequestMapping(value = "/deleteByAuthor", method = RequestMethod.GET)
    @Transactional
    public String deleteByAuthor(String author) {
        demoService.deleteByAuthor(author);
        return "SUCCESS";
    }

    /*@RequestMapping(value = "/deleteByBook/{book}", method = RequestMethod.GET)
    @Transactional
    public String deleteByBook(@PathVariable String book) {
        demoService.deleteByBook(book);
        return "SUCCESS";
    }*/

    @RequestMapping(value = "/deleteByBook", method = RequestMethod.GET)
    @Transactional
    public String deleteByBook(String book) {
        demoService.deleteByBook(book);
        return "SUCCESS";
    }



}
