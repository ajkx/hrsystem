package com.victory.hr.common.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ajkx
 * Date: 2017/5/3.
 * Time:10:13
 */
public interface BaseDao<M,ID extends Serializable> {

    /**
     * 保存持久化实体
     * @param entity
     * @return
     */
    Serializable save(M entity);

    /**
     * 删除实体
     * @param entity
     */
    void delete(M entity);

    /**
     * 根据ID删除实体
     * @param id
     */
    void delete(Serializable id);

    /**
     * 更新实体
     * @param entity
     */
    void update(M entity);

    /**
     * 根据传入ID找出对应实体
     * @param id
     * @return
     */
    M findOne(Serializable id);

    /**
     * 找出所有的实体
     * @return
     */
    List<M> findAll();

    /**
     * 找出该表总条数
     * @return
     */
    long findCount();
}
