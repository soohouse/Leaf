package com.spring.leaf.company.mapper;

import java.util.Map;

import com.spring.leaf.company.command.CompanyLogoVO;
import com.spring.leaf.company.command.CompanyVO;
import com.spring.leaf.user.command.UserProfileVO;


// 기업회원 매퍼 인터페이스 : 2022-07-28 생성

public interface ICompanyMapper {

	// 기업 회원가입 요청
	void companyRegist(CompanyVO vo);
			
			
	// 기업 아이디 중복체크 요청
	int companyIDCheck(String companyID);
			
			
	// 기업 이메일 중복체크 요청
	int companyEmailCheck(Map<String, Object> emails);
	
	
	// 기업 정보 불러오기 요청
	CompanyVO companyGetInfo(String companyID);
	
	
	// 기업회원 회원번호 얻는 요청
	int companyNOGet();
		
		
	// 기업 로고 등록 요청
	void companyLogo(CompanyLogoVO vo);
}
