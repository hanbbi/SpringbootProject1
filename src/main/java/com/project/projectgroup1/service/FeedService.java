package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.FeedDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FeedService {

    List<FeedDto> list();
    FeedDto detail(int FeedNum);
    int modify(FeedDto feedDto);
    int remove(int FeedNum);
    int register(FeedDto feedDto);

    List<FeedDto> trendList();
    List<FeedDto> findLatest();
}
