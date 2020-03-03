package org.chan.service;

import java.util.List;

import org.chan.dto.PageDTO;
import org.chan.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getPageList(PageDTO dto);
}
