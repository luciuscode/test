/**
 * CaculatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package caculator.example.com;

public class CaculatorServiceLocator extends org.apache.axis.client.Service implements caculator.example.com.CaculatorService {

    public CaculatorServiceLocator() {
    }


    public CaculatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CaculatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for caculatorPort
    private java.lang.String caculatorPort_address = "http://localhost:8080/ode/processes/caculator";

    public java.lang.String getcaculatorPortAddress() {
        return caculatorPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String caculatorPortWSDDServiceName = "caculatorPort";

    public java.lang.String getcaculatorPortWSDDServiceName() {
        return caculatorPortWSDDServiceName;
    }

    public void setcaculatorPortWSDDServiceName(java.lang.String name) {
        caculatorPortWSDDServiceName = name;
    }

    public caculator.example.com.Caculator getcaculatorPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(caculatorPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcaculatorPort(endpoint);
    }

    public caculator.example.com.Caculator getcaculatorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            caculator.example.com.CaculatorBindingStub _stub = new caculator.example.com.CaculatorBindingStub(portAddress, this);
            _stub.setPortName(getcaculatorPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcaculatorPortEndpointAddress(java.lang.String address) {
        caculatorPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (caculator.example.com.Caculator.class.isAssignableFrom(serviceEndpointInterface)) {
                caculator.example.com.CaculatorBindingStub _stub = new caculator.example.com.CaculatorBindingStub(new java.net.URL(caculatorPort_address), this);
                _stub.setPortName(getcaculatorPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("caculatorPort".equals(inputPortName)) {
            return getcaculatorPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("com.example.caculator", "caculatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("com.example.caculator", "caculatorPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("caculatorPort".equals(portName)) {
            setcaculatorPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
