package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.ReplyDAO;
import com.board.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;

	// ๋๊ธ ์กฐํ
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
	    return dao.list(bno);
	}

	@Override
	public String write(ReplyVO vo) throws Exception {
	    
		return dao.write(vo);
	}

	@Override
	public void modify(ReplyVO vo) throws Exception {
	    dao.modify(vo);
	}

	@Override
	public void delete(ReplyVO vo) throws Exception {
	    dao.delete(vo);
	}

	@Override
	public void replyDelete(ReplyVO vo) throws Exception {
		dao.replyDelete(vo);
	}

}