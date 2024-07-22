package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="TableTwoConfig", keys={"sid"})
public class TableTwoConfigBase extends BaseModel {

	@Searchable(index = true)
	private String embed;
	@Searchable(index = true)
	private String tribber;

	public void setEmbed(String embed) {
		this.embed = embed;
	}

	public String getEmbed() {
		return embed;
	}

	public void setTribber(String tribber) {
		this.tribber = tribber;
	}

	public String getTribber() {
		return tribber;
	}



}