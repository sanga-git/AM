package com.kh.am.pay.model.service;

import java.util.List;

import com.kh.am.calendar.model.vo.WorkCalendar;
import com.kh.am.member.model.vo.Member;

public interface PayService {

	/** 알바생 조회 Service
	 * @param memberNo
	 * @return eList
	 */
	public abstract List<Member> selectEmployeeList(int storeNo);

	/** 알바생 이번달 총 근무시간, 총 근무일수 조회 Service
	 * @param memberNo
	 * @return wc
	 */
	public abstract WorkCalendar selectEmployeeWork(int memberNo);

	/** 알바생 일주일 근무시간 조회 Service
	 * @param memberNo
	 * @return
	 */
	public abstract int selectOneDay(int memberNo);

}
