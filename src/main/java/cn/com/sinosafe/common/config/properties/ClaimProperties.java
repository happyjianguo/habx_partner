package cn.com.sinosafe.common.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能说明：邮件发送的相关配置
 * @author Hirson
 * @version 1.0.0
 * @time 2018年8月14日
 */
@Component
@ConfigurationProperties(prefix = "claim")
public class ClaimProperties {

	/**
	 *发件人邮箱地址
	 */
	private String from;
	
	/**
	 * 发件人昵称
	 */
	private String personal;
	
	/**
	 * 异常警报接收人
	 */
	private String reciverAddress;
	
	/**
	 * 异常警报抄送人
	 */
	private String ccAddress;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getReciverAddress() {
		return reciverAddress;
	}

	public void setReciverAddress(String reciverAddress) {
		this.reciverAddress = reciverAddress;
	}

	public String getCcAddress() {
		return ccAddress;
	}

	public void setCcAddress(String ccAddress) {
		this.ccAddress = ccAddress;
	}
	
}
