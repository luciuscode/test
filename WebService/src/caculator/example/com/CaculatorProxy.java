package caculator.example.com;

public class CaculatorProxy implements caculator.example.com.Caculator {
  private String _endpoint = null;
  private caculator.example.com.Caculator caculator = null;
  
  public CaculatorProxy() {
    _initCaculatorProxy();
  }
  
  public CaculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCaculatorProxy();
  }
  
  private void _initCaculatorProxy() {
    try {
      caculator = (new caculator.example.com.CaculatorServiceLocator()).getcaculatorPort();
      if (caculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)caculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)caculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (caculator != null)
      ((javax.xml.rpc.Stub)caculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public caculator.example.com.Caculator getCaculator() {
    if (caculator == null)
      _initCaculatorProxy();
    return caculator;
  }
  
  public caculator.example.com.CaculatorResponse process(caculator.example.com.CaculatorRequest payload) throws java.rmi.RemoteException{
    if (caculator == null)
      _initCaculatorProxy();
    return caculator.process(payload);
  }
  
  
}