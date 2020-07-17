package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno> -")
	public List<BoardVO> getList();
	//삽입
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	//조회
	public BoardVO read(Long bno);
	//삭제
	public int delete(Long bno);
	//수정
	public int update(BoardVO board);
	
}
