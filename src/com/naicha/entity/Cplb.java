package com.naicha.entity;

public class Cplb {
	
	
	private int cplbid;
	private String cplbname;
	
	
	/**
	 * get����
	 * @return
	 */
	public int getCplbid() {
		return cplbid;
	}
	public void setCplbid(int cplbid) {
		this.cplbid = cplbid;
	}
	public String getCplbname() {
		return cplbname;
	}
	public void setCplbname(String cplbname) {
		this.cplbname = cplbname;
	}
	
	/**
	 * �޲���
	 */
	
	public Cplb() {
		
	}
	
	
	
	/**
	 * �в���
	 * @param cplbid
	 * @param cplbname
	 */
	public Cplb(int cplbid, String cplbname) {
		super();
		this.cplbid = cplbid;
		this.cplbname = cplbname;
	}
	
	
	
	@Override
	public String toString() {
		return "Cplb [cplbid=" + cplbid + ", cplbname=" + cplbname + "]";
	}
	
	
	
	
	
}


