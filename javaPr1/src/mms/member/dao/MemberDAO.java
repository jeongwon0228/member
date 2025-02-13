package mms.member.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import mms.member.vo.Member;

public class MemberDAO {
	
	static List<Member> memberList = new CopyOnWriteArrayList<Member>();

	
	public boolean insertNewMember(Member newMember) {
		// ����� ���⼭ �����ϰ� 
		// ���񽺿��� ȣ�� 
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
//				System.out.println("���̵�"+memberID + "������ �����Ǿ����ϴ�");
				return true;
			}
		}
//		System.out.println("ȸ�� ID �� ��ġ���� �ʽ��ϴ�.");
		return false;
		
	}
	
	
	
	
	
	

	   
	


	
	
	
}
