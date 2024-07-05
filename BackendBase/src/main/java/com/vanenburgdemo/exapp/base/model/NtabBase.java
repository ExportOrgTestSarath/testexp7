package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="Ntab", keys={"sid"})
public class NtabBase extends BaseModel {

	@Searchable(index = true)
	private String one;
	@Searchable(index = true)
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