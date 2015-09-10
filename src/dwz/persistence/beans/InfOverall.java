package dwz.persistence.beans;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class InfOverall implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8263483789054979468L;
	private Integer dau;
	private Integer pv;
	private Integer newuser;
	private java.util.Date date;

	public Integer getDau() {
		return dau;
	}

	public void setDau(Integer dau) {
		this.dau = dau;
	}

	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public Integer getNewuser() {
		return newuser;
	}

	public void setNewuser(Integer newuser) {
		this.newuser = newuser;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String toString() {
		return new ToStringBuilder("")
			.append("Date",getDate())
			.append("Dau",getDau())
			.append("Pv",getPv())
			.append("Newuser",getNewuser())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getDate())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof InfNews == false) return false;
		if(this == obj) return true;
		InfOverall other = (InfOverall)obj;
		return new EqualsBuilder()
			.append(getDate(),other.getDate())
			.isEquals();
	}
}
