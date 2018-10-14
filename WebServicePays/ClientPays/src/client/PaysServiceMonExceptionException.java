/**
 * PaysServiceMonExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package client;

public class PaysServiceMonExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1539439142335L;
    private client.PaysServiceStub.PaysServiceMonException faultMessage;

    public PaysServiceMonExceptionException() {
        super("PaysServiceMonExceptionException");
    }

    public PaysServiceMonExceptionException(java.lang.String s) {
        super(s);
    }

    public PaysServiceMonExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public PaysServiceMonExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        client.PaysServiceStub.PaysServiceMonException msg) {
        faultMessage = msg;
    }

    public client.PaysServiceStub.PaysServiceMonException getFaultMessage() {
        return faultMessage;
    }
}
