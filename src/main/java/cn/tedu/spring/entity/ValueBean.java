package cn.tedu.spring.entity;

import java.util.List;

public class ValueBean {
	//来值CollectionEntity.tag
	public String tagValue;
	//来自CollectionEntity.names的第及个元素
	public String nameValue;
	//来自CollectionEntity.cities的第及个元素
	public String cityValue;
	//来自CollectionEntity.session的key=username的元素
	public String usernameValue;
	//来自CollectionEntity.session的key=password的元素
	public String passwordValue;
	
	
	public String getUsernameValue() {
		return usernameValue;
	}

	public void setUsernameValue(String usernameValue) {
		this.usernameValue = usernameValue;
	}

	public String getPasswordValue() {
		return passwordValue;
	}

	public void setPasswordValue(String passwordValue) {
		this.passwordValue = passwordValue;
	}

	public String getNameValue() {
		return nameValue;
	}

	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}

	public String getCityValue() {
		return cityValue;
	}

	public void setCityValue(String cityValue) {
		this.cityValue = cityValue;
	}

	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}
}
