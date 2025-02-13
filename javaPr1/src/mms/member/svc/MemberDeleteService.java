package mms.member.svc;

import mms.member.dao.MemberDAO;
import mms.member.vo.Member;

public class MemberDeleteService {

public boolean deleteMember(int memberId) throws Exception {
		
		boolean isDeleteSuccess = false;
		
		MemberDAO memberDAO = new MemberDAO();
		
		isDeleteSuccess = memberDAO.deleteMember(memberId);
		
		return isDeleteSuccess;
	}		
	
}