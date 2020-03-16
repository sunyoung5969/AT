package org.sun.service;

import org.sun.boardVO.boardVO;

public interface BoardService {
	
	public int getTotal();
	
	public void dbsave(boardVO vo);
}
