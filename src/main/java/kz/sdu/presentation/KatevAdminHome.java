package kz.sdu.presentation;

import javax.faces.model.DataModel;

import kz.sdu.entities.School;

public class KatevAdminHome {
	private DataModel<School> schools;
	
	public DataModel<School> getBooks() {		
		return schools;
	}
}
