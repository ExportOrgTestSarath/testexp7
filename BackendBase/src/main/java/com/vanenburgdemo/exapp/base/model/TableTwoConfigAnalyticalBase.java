package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.model.BaseAnalyticalModel;


@Table(name="TableTwoConfig")
public class TableTwoConfigAnalyticalBase extends BaseAnalyticalModel {
	private static final long serialVersionUID = -1653584662510644834L;
		private String embed;
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