package com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize;

import java.util.Date;

import lombok.Data;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@Data
public class BookCaseLayerInsideSizeReqBody {

	private String name;
	private float length;
	private float wide;
	private float height;
	private float bookLength;
	private float bookWide;
	private float bookHeight;
	
}
