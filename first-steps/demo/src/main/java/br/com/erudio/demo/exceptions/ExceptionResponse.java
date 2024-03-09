package br.com.erudio.demo.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

        private static final long serialVersionUID = 1L;

        private Date timestamp;
        private String details;
        private String message;

        public ExceptionResponse() {
        }

        public ExceptionResponse(Date timestamp, String details, String message) {
            this.timestamp = timestamp;

            this.details = details;
            this.message = message;

        }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getDetails() {
        return details;
    }

    public String getMessage() {
        return message;
    }
}
