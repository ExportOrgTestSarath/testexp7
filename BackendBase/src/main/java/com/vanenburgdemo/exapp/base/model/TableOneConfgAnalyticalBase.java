package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.model.BaseAnalyticalModel;


@Table(name="TableOneConfg")
public class TableOneConfgAnalyticalBase extends BaseAnalyticalModel {
	private static final long serialVersionUID = -1653584662510644834L;
		private String value1;
	private String value2;

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getValue2() {
		return value2;
	}


}