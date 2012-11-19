/**
 * CaculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package caculator.example.com;

public interface CaculatorService extends javax.xml.rpc.Service {
    public java.lang.String getcaculatorPortAddress();

    public caculator.example.com.Caculator getcaculatorPort() throws javax.xml.rpc.ServiceException;

    public caculator.example.com.Caculator getcaculatorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
