package org.sun.service;

import org.springframework.stereotype.Service;
import org.sun.boardVO.boardVO;
import org.sun.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class BoardServiceImpl implements BoardService{

	private BoardMapper mapper;
	
	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		
		log.info("서비스 진입하니?");
		
		
		return mapper.getDBTotal();
	}

	@Override
	public void dbsave(boardVO vo) {
		// TODO Auto-generated method stub
		
		mapper.setdbsave(vo);
	}

}
