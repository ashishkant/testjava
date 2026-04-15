package com.example.demo;

/**
 * Message class with msg property
 */
public class Message {
    
    private String msg;
    
    /**
     * Default constructor
     */
    public Message() {
    }
    
    /**
     * Constructor with message parameter
     * @param msg the message string
     */
    public Message(String msg) {
        this.msg = msg;
    }
    
    /**
     * Getter for msg
     * @return the message string
     */
    public String getMsg() {
        return msg;
    }
    
    /**
     * Setter for msg
     * @param msg the message string to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
