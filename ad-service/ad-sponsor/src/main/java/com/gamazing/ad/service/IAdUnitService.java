package com.gamazing.ad.service;

import com.gamazing.ad.exception.AdException;
import com.gamazing.ad.vo.*;

/**
 *
 * Created by Qinyi.
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request) throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request) throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request) throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request) throws AdException;
}
