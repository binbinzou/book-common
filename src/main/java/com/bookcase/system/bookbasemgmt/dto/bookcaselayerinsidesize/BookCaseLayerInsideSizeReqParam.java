package com.bookcase.system.bookbasemgmt.dto.bookcaselayerinsidesize;

import java.util.Date;
import java.util.List;

import lombok.Data;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@Data
public class BookCaseLayerInsideSizeReqParam {

	private List<String> ids;
	
}
