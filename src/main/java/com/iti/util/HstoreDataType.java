package com.iti.util;
import java.io.Serializable;
import java.util.Map;

import javax.persistence.AttributeConverter;

import org.postgresql.util.HStoreConverter;
import org.springframework.stereotype.Component;

@Component
public class HstoreDataType implements AttributeConverter<Map<String, String>, String>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String convertToDatabaseColumn(Map<String, String> attribute) {
		// TODO Auto-generated method stub
		return HStoreConverter.toString(attribute);
	}

	@Override
	public Map<String, String> convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		if (dbData != null) {
			return HStoreConverter.fromString(dbData);
		}
		return null;
	}

}
