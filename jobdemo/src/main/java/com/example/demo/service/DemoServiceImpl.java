package com.example.demo.service;

import com.example.demo.domain.DemoEntity;
import com.example.demo.dao.DemoDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DemoServiceImpl implements DemoService{

    private DemoDao demoDao;

    DemoServiceImpl(DemoDao demoDao) {
        this.demoDao = demoDao;
    }
    /**************************create********************************/
    @Override
    public DemoEntity save(DemoEntity demoEntity) {
        return demoDao.save(demoEntity);
    }

    /**************************read********************************/
    @Override
    public List<DemoEntity> findAll() {
        return demoDao.findAll();
    }

    @Override
    public List<DemoEntity> findByAuthor(String author) {
        return demoDao.findByAuthor(author);
    }

    @Override
    public List<DemoEntity> findByBook(String book) {
        return demoDao.findByBook(book);
    }

    @Override
    public List<DemoEntity> findByPublishing(String publishing) {
        return demoDao.findByPublishing(publishing);
    }


    /*******update***********/
    @Override
    public void updateDemoByAuthor(String book, String author) {
        demoDao.updateDemo(book, author);
    }
    /***********delete*********/
    @Override
    public void deleteById(int id) {
        demoDao.deleteById(id);
    }

    @Override
    public void deleteByAuthor(String author) {
        demoDao.deleteByAuthor(author);
    }

    @Override
    public void deleteByBook(String book) {
        demoDao.deleteByBook(book);
    }



}
