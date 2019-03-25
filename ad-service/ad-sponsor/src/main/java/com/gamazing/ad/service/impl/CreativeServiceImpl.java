package com.gamazing.ad.service.impl;

import com.gamazing.ad.dao.CreativeRepository;
import com.gamazing.ad.entity.Creative;
import com.gamazing.ad.service.ICreativeService;
import com.gamazing.ad.vo.CreativeRequest;
import com.gamazing.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements ICreativeService {

    @Autowired
    private CreativeRepository creativeRepository;

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(request.convertToEntity());

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
