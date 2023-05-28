package com.app.floc.mapper;

import com.app.floc.domain.VO.CouponVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponMapper {

    //쿠폰 발급
    public void insert(CouponVO couponVO);

    //쿠폰 사용시 valid, 사용날짜 update
    public void update(CouponVO couponVO);

    //쿠폰 가져오기


}
