package com.spring.leaf.message.service;

import java.util.List;

import com.spring.leaf.message.command.CompanyMessageVO;
import com.spring.leaf.message.command.UserMessageVO;

//기업 쪽지 서비스 인터페이스 : 2022-08-04 생성
public interface ICompanyMessageService {
	
		//쪽지 전송하기(기업 -> 일반 UserMessage 테이블에 전송)
		void userSendMessage(UserMessageVO vo);
		
		//쪽지 목록보기 (관리자로부터 받은 쪽지를 CompanyMessage 테이블에서 꺼내오기)
		List<CompanyMessageVO> companyMessageList();
		
		//쪽지 상세보기 (쪽지목록 상세보기)
		CompanyMessageVO companyMessageContent(int companyMessageNO);

		//쪽지 삭제하기 (관리자로부터 받은 쪽지를 CompanyMessage 테이블에서 삭제하기)
		void companyMessageDelete(int companyMessageNO);
}
