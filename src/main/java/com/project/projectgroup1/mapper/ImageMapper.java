package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.FeedDto;
import com.project.projectgroup1.dto.ImageDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImageMapper {
    ImageDto findByFeedNum(int feedNum);

    ImageDto findOne(int imgNum);    // 게시글 수정에서 삭제할 이미지를 찾을 떄

    int deleteOne(int imgNum);

    int insertOne(ImageDto dto);
}
