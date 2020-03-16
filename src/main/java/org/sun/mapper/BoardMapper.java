package org.sun.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.sun.boardVO.boardVO;

public interface BoardMapper {
	
	@Select("select count(*) from tbl_board")
	public int getDBTotal();
	
	@Insert("insert into bit_member values(#{id}, #{name}, #{pwd})")
	public void setdbsave(boardVO vo);
}
