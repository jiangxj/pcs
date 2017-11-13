package com.mzcm.pcs.notice.mapper;

import com.mzcm.pcs.notice.dto.Mzcm_notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Mapper
@Repository
public interface NoticeMapper {
    List getNoticeListByUsername(String username);

    Mzcm_notice getNoticeByNid(String nid);
}
