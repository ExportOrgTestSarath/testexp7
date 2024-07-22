package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="TableOneConfg", keys={"sid"})
public class TableOneConfgBase extends BaseModel {

	@Searchable(index = true)
	private String value1;
	@Searchable(index = true)
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