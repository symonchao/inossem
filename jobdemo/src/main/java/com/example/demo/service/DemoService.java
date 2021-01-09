package com.example.demo.service;

import com.example.demo.domain.DemoEntity;
import java.util.List;


public interface DemoService {

    /**********save**********/
    DemoEntity save(DemoEntity demoEntity);

    /***********query************/
    List<DemoEntity> findAll();

    List<DemoEntity> findByAuthor(String author);

    List<DemoEntity> findByBook(String book);

    List<DemoEntity> findByPublishing(String publishing);


    /***********update***********/
    void updateDemoByAuthor(String book, String author);
    /*********delete*************/
    void deleteById(int id);

    void deleteByAuthor(String author);

    void deleteByBook(String book);




}
