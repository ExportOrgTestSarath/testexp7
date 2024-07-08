package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.model.BaseAnalyticalModel;


@Table(name="Ntab")
public class NtabAnalyticalBase extends BaseAnalyticalModel {
	private static final long serialVersionUID = -1653584662510644834L;
		private String one;
	private String two;

	public void setOne(String one) {
		this.one = one;
	}

	public String getOne() {
		return one;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	public String getTwo() {
		return two;
	}


}