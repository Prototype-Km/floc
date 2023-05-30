package com.app.floc.service.notice;

import com.app.floc.domain.DTO.AdminPagination;
import com.app.floc.domain.DTO.NoticeDTO;
import com.app.floc.domain.DTO.Search;
import com.app.floc.domain.VO.UserVO;

import java.util.List;
import java.util.Optional;

public interface NoticeService {

    // 게시글 목록
    public List<NoticeDTO> getList(AdminPagination adminPagination, Search search);

    //게시글 조회
    public Optional<NoticeDTO> read(Long id);

    //    게시글 추가
    public void write(NoticeDTO noticeDTO);

    //    게시글 수정
    public void modify(NoticeDTO noticeDTO);

    //    게시글 삭제
    public void remove(Long id);
//
//    default NoticeDTO toDTO(NoticeVO noticeVO){
//        NoticeDTO noticeDTO = new NoticeDTO();
//
//        noticeDTO.setId(noticeVO.getId());
//        noticeDTO.setNoticeTitle(noticeVO.getNoticeTitle());
//        noticeDTO.setNoticeContent(noticeVO.getNoticeContent());
//        noticeDTO.setAdminId(noticeVO.getAdminId());
//        noticeDTO.setNoticeViewedCount(noticeVO.getNoticeViewedCount());
//        noticeDTO.setNoticeCreatedDate(noticeVO.getNoticeCreatedDate());
//        noticeDTO.setNoticeUpdatedDate(noticeVO.getNoticeUpdatedDate());
//        return noticeDTO;
//    }
    //게시글 전체 개수 조회
    public int getTotal(Search search);

    //게시글 삭제
    public void deleteNoticeByIds(List<Long> noticeIds);

    public List<NoticeDTO> selectByRecent();


}
