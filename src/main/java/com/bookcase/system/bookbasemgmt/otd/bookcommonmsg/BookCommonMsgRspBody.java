/**
 * Project Name:book-common
 * File Name:BookCommonMsgRspBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.otd.bookcommonmsg
 * Date:2017年5月24日下午10:01:27
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.otd.bookcommonmsg;

import java.sql.Timestamp;
import lombok.Data;

/**
 * ClassName:BookCommonMsgRspBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午10:01:27 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCommonMsgRspBody {

	private String id;

	private String anotherName;

	private String authorId;

	private String briefing;

	private String catalog;

	private Timestamp createTime;

	private String creator;

	private String name;

	private short pageCnt;

	private String publishHome;

	private short readOvertime;

	private short status;

	private String translatorId;

	private Timestamp updateTime;
	
}

