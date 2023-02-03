package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.FeedDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper extends CRUD<FeedDto,String> {

    List<FeedDto> findAll();
    List<FeedDto> findTrend();
    List<FeedDto> findLatest();
    FeedDto findById (int feedNum);

    int deleteById(String id);

    int updateById(FeedDto dto);

    int insert(FeedDto dto);

    int updateViews(int feedNum);
}
