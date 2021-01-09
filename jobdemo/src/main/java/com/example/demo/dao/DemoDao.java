package com.example.demo.dao;

import com.example.demo.domain.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import java.util.List;

public interface DemoDao extends JpaRepository<DemoEntity,Integer> {

    /*********create**********/
    @Override
    DemoEntity save(DemoEntity demoEntity);
    /************query*********/

    /**
     * find all
     * @param
     * @return
     */
    @Override
    List<DemoEntity> findAll();

    /**
     *
     */
    @Query("select u from DemoEntity u  where u.author=:author")
    List<DemoEntity> findByAuthor(@Param("author") String author);

    /**
     * Native Queries
     * The @Query annotation allows for running native queries by setting the nativeQuery flag to true
     * @param book
     * @return
     */
    @Query("select u from DemoEntity u  where u.book = ?1")
    List<DemoEntity> findByBook(String book);

    /**
     * Using @Query
     * @param publishing
     * @return
     */
    @Query("select u from DemoEntity u where u.publishing = ?1")
    List<DemoEntity> findByPublishing(String publishing);


    /****************************update*****************************************/
    /**
     * update a usr by Modifying Queries
     * @param book
     * @param author
     * @return
     */
    @Modifying
    @Query("update DemoEntity u set u.book = ?1 where u.author = ?2")
    void updateDemo(String book, String author);
    /****************************delete*****************************************/
    /**
     * delete a user by id
     * @param id
     */

    @Modifying
    @Query("delete from DemoEntity where id = ?1")
    void deleteById(int id);


    /**
     * delete a user by idCard
     * @param author
     */
    @Modifying
    @Query("delete from DemoEntity u where u.author = ?1")
    void deleteByAuthor(String author);

    /**
     * Using a derived delete query
     * @param book
     */
    @Modifying
    @Query("delete from DemoEntity u where u.book = ?1")
    void deleteByBook(String book);




}
