package com.najeeb.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
    //timestamp
    private Date timestampe;
    //message
    private String message;
    //detail
    private String details;

    public ExceptionResponse(Date timestampe, String message, String details) {
        super();
        this.timestampe = timestampe;
        this.message = message;
        this.details = details;
    }

    public Date getTimestampe() {
        return timestampe;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
