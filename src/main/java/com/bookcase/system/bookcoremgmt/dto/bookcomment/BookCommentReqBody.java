/**
 * Project Name:book-common
 * File Name:BookCommentReqBody.java
 * Package Name:com.bookcase.system.bookcoremgmt.dto.bookcomment
 * Date:2017年5月23日下午8:04:36
 * Copyright (c) 2017, binbin.zou@hpe.com All Rights Reserved.
 *
*/

package com.bookcase.system.bookcoremgmt.dto.bookcomment;

import java.sql.Timestamp;

import lombok.Data;

/**
 * ClassName:BookCommentReqBody <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年5月23日 下午8:04:36 <br/>
 * @author   binbin
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Data
public class BookCommentReqBody {

	private String bookCommonmsgId;

	private String content;

	private int score;

	private short usefullCnt;
	
}

