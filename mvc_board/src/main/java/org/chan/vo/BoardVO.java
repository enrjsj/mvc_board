package org.chan.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private String userid,userpw,username;
	private Date regdate,updatedate;
}
