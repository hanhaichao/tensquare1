package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
//相当于mapper
public interface SpitDao extends MongoRepository<Spit, String> {
    public Page<Spit> findByParentid(String parentid, Pageable pageable);
    //自定义的方法
}
