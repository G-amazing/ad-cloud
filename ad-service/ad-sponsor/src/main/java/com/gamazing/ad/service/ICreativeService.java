package com.gamazing.ad.service;

import com.gamazing.ad.vo.CreativeRequest;
import com.gamazing.ad.vo.CreativeResponse;

public interface ICreativeService {
    CreativeResponse createCreative(CreativeRequest request);
}
