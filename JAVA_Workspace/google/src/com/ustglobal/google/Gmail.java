package com.ustglobal.google;

public class Gmail extends Google {

	@Override
	void shareDocument() {
		System.out.println("You can share only 25 mb of document");
	}
}
