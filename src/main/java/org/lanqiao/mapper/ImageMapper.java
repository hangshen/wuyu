package org.lanqiao.mapper;

import org.lanqiao.entity.Image;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}