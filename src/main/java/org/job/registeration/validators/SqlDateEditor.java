package org.job.registeration.validators;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;

import org.apache.log4j.Logger;
import org.job.registeration.loggerc.Colors;

public class SqlDateEditor extends PropertyEditorSupport{
	private DateFormat dateFormat;
	private static final Logger logger = Logger.getLogger(SqlDateEditor.class);
	public SqlDateEditor(final DateFormat dateFormat){
		this.dateFormat = dateFormat;
	}
	
	@Override
	public void setAsText(String text) {
        try {
        	if(text.equals("")){
        		logger.debug(Colors.ANSI_GREEN+"Null date is found :-> " + text);
        	}else{        		
        		logger.debug(Colors.ANSI_GREEN+"date not null :-> "+text);
                setValue(new java.sql.Date(this.dateFormat.parse(text).getTime()));
        	}
        } catch (ParseException e) {
            throw new IllegalArgumentException("Could not parse date: ");
        }
    }

    @Override
    public String getAsText() {
        java.sql.Date value = (java.sql.Date) getValue();
        return (value != null ? this.dateFormat.format(value) : "");
    }
	
}