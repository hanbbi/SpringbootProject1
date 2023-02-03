package com.project.projectgroup1.service;

import com.project.projectgroup1.dto.FeedDto;
import com.project.projectgroup1.mapper.FeedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.PrimitiveIterator;

@Service
public class FeedServiceImp implements FeedService{
    @Autowired
    private FeedMapper feedMapper;

    @Override
    public List<FeedDto> list() {
        return feedMapper.findAll();
    }

    @Override
    public FeedDto detail(int feedNum) {
        feedMapper.updateViews(feedNum);
        return feedMapper.findById(feedNum);
    }

    @Override
    public int modify(FeedDto feedDto) {
        return 0;
    }

    @Override
    public int remove(int FeedNum) {
        return 0;
    }

    @Override
    public int register(FeedDto feedDto) {
        return feedMapper.insert(feedDto);
    }

    @Override
    public List<FeedDto> trendList() {
        return feedMapper.findTrend();
    }

    @Override
    public List<FeedDto> findLatest() {
        return feedMapper.findLatest();
    }
}
