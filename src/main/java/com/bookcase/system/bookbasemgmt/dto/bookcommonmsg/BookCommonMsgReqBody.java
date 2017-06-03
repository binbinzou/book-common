/**
 * Project Name:book-common
 * File Name:BookCommonMsgReqBody.java
 * Package Name:com.bookcase.system.bookbasemgmt.dto.bookcommonmsg
 * Date:2017年5月24日下午9:48:29
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookbasemgmt.dto.bookcommonmsg;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookCommonMsgReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月24日 下午9:48:29 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCommonMsgReqBody {

	private String anotherName;

	private String authorId;

	private String briefing;

	private String catalog;

	private String name;

	private short pageCnt;

	private String publishHome;

	private short readOvertime;

	private String translatorId;

}

