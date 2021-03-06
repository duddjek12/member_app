package com.jackie.app.memberapp;

import java.util.List;

/**
 * Created by admin on 7/27/2016.
 */
public class MemberServiceImpl implements MemberService {
    private MemberDAO dao = MemberDAO.getInstance();
    private MemberBean session;
    private static MemberServiceImpl instanceImpl = new MemberServiceImpl();

    private MemberServiceImpl() {
        session = new MemberBean();
    }

    public MemberBean getSession() {
        return session;
    }

    public void logoutSession(MemberBean member) {
        if (member.getId().equals(session.getId()) && member.getPw().equals(session.getPw())) {
            session = null;
        }
    }

    public static MemberServiceImpl getInstanceImpl() {
        return instanceImpl;
    }

    public String regist(MemberBean mem) {
        String msg = "";
        if (dao.insert(mem)==1) {
            msg = dao.findById(mem.getId()).getName();
        }
        return msg;
    }

    public void update(MemberBean mem) {
        mem.setId(session.getId());
        dao.update(mem);
        session = dao.findById(mem.getId());
    }

    public void delete(MemberBean mem) {
        dao.delete(mem);
        session = dao.findById(mem.getId());
    }


    public int count() {
        return dao.count();
    }
    public MemberBean detail(String mem) {
        return dao.findById(mem);
    }
    public List<?> list() {
        return dao.list();
    }
    public List<?> findByName(String findName) {
        return dao.findByName(findName);
    }
    public List<?> findBy(String keyword) {
        return null;
    }

    public String myAccount() {
        return session.toString();
    }


}
