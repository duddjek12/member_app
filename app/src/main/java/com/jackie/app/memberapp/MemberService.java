package com.jackie.app.memberapp;

import java.util.List;

/**
 * Created by admin on 7/27/2016.
 */
public interface MemberService {
    public String regist(MemberBean mem);
    public void update(MemberBean mem);
    public void delete(MemberBean mem);
    public MemberBean detail(String mem);
    public MemberBean getSession();
    public void logoutSession(MemberBean member);
    public List<?> findByName(String findName);
}
