package mms.member.action;

import java.util.Scanner;

import mms.member.svc.MemberShowService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberShowAction implements Action{
	
	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		
		int MemberId = cu.getMemberId(sc,"조회하실 회원 번호를 입력해주세요(전체는 0)");
		// id 까지 받아왔고 0이면 전체 목록을 조회
		// 아니면 특정 목록만 불러올것
		boolean isShowSuccess = false;
		
		MemberShowService memberShowService = new MemberShowService();
		if(MemberId == 0) {
			// 전체 목록 조회
			isShowSuccess = memberShowService.showAllMember(MemberId);
		} else {
			isShowSuccess = memberShowService.showMember(MemberId);
		}
		
		if(isShowSuccess) {
			System.out.println("회원 정보 보기 성공");
		} else {
			System.out.println("회원 정보를 불러올 수 없습니다.");
			System.out.println("없는 아이디거나 음수를 입력하였습니다.");
		}
	}
	
}
