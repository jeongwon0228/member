package mms.member.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import mms.member.vo.Member;

public class MemberDAO {
	
	static List<Member> memberList = new CopyOnWriteArrayList<Member>();

	
	public boolean insertNewMember(Member newMember) {
		// 기능을 여기서 정의하고 
		// 서비스에서 호출 
		return memberList.add(newMember);
	}
	
	public boolean showMember(int memberId ) {
		for(Member member : memberList) {
			if (member.getId() == memberId) {
				System.out.println(member);
				return true;
			}
		}
		return false;
	}
	
	public boolean showAllMember() {
		for(Member member : memberList) {
				System.out.println(member);
			}
		
		return true;	
	}
	
	public static List<Member> getMemberList() {
		return memberList;
	}
	
	
	
	public boolean deleteMember(int memberID) {
		for(Member member : memberList) {
			if (member.getId() == memberID) {
				memberList.remove(member);
//				System.out.println("아이디"+memberID + "정보가 삭제되었습니다");
				return true;
			}
		}
//		System.out.println("회원 ID 가 일치하지 않습니다.");
		return false;
		
	}
	
	
	
	
	
	

	   
	


	
	
	
}
