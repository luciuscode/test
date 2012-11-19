<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="org.eclipse.jwt/application" xmlns:core="org.eclipse.jwt/core" xmlns:data="org.eclipse.jwt/data" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="BuyBook" author="Eclipse.org JWT Project Team" version="0.6.0" description="This process has been used for a presentation at EclipseCon 2009 and Eclipse Forum Europe 2009 to show how a modeled process with integrated web services can be executed on a process engine.&#xD;&#xA;&#xD;&#xA;Please have a look at http://www.eclipse.org/jwt/press to find some more information and a video that explains this process." fileversion="1.2.0">
  <subpackages name="Applications">
    <ownedComment text="The standard package for applications"/>
    <elements xsi:type="application:Application" name="AmazonWS" icon="" jarArchive="" javaClass="http://soap.amazon.com/schemas2/AmazonWebServices.wsdl" method=""/>
    <elements xsi:type="application:Application" name="MailService"/>
    <elements xsi:type="application:WebServiceApplication" name="GetISBN" Interface="http://localhost:8081/AmazonWS?wsdl" Operation="getAsin"/>
    <elements xsi:type="application:WebServiceApplication" name="ValidateCreditCard" Interface="http://localhost:8081/CreditCard?wsdl" Operation="validateCardNumber"/>
    <elements xsi:type="application:WebServiceApplication" name="ValidateEmailAddress" Interface="http://localhost:8081/ValidateEMail?wsdl" Operation="isValidEmail"/>
  </subpackages>
  <subpackages name="Roles">
    <elements xsi:type="organisations:Role" name="john" icon=""/>
  </subpackages>
  <subpackages name="Data">
    <subpackages name="Datatypes">
      <elements xsi:type="data:DataType" name="STRING"/>
      <elements xsi:type="data:DataType" name="BOOLEAN"/>
    </subpackages>
    <elements xsi:type="data:Data" name="creditCard" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="creditCardValid" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="request" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="mailAddress" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="mailAddressValid" dataType="//@subpackages.2/@subpackages.0/@elements.1"/>
    <elements xsi:type="data:Data" name="VISA" value="VISA" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="ASIN" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="PurchaseURL" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
  </subpackages>
  <elements xsi:type="processes:Activity" name="MainProcess">
    <nodes xsi:type="processes:ForkNode" name="split" in="//@elements.0/@edges.12" out="//@elements.0/@edges.1 //@elements.0/@edges.2"/>
    <nodes xsi:type="processes:JoinNode" name="join" in="//@elements.0/@edges.3 //@elements.0/@edges.4" out="//@elements.0/@edges.9"/>
    <nodes xsi:type="processes:Action" name="VerifyMailAddress" in="//@elements.0/@edges.1" out="//@elements.0/@edges.3" executedBy="//@subpackages.0/@elements.4" inputs="//@subpackages.2/@elements.3" outputs="//@subpackages.2/@elements.4"/>
    <nodes xsi:type="processes:FinalNode" name="end" in="//@elements.0/@edges.8"/>
    <nodes xsi:type="processes:Action" name="GetOrder" in="//@elements.0/@edges.0" out="//@elements.0/@edges.5" performedBy="//@subpackages.1/@elements.0" outputs="//@subpackages.2/@elements.0 //@subpackages.2/@elements.3 //@subpackages.2/@elements.2"/>
    <nodes xsi:type="processes:Action" name="SendConfirmation" in="//@elements.0/@edges.7" out="//@elements.0/@edges.6" performedBy="//@subpackages.1/@elements.0" inputs="//@subpackages.2/@elements.7"/>
    <nodes xsi:type="processes:InitialNode" name="start" out="//@elements.0/@edges.0"/>
    <nodes xsi:type="processes:Action" name="CheckCreditCard" in="//@elements.0/@edges.2" out="//@elements.0/@edges.4" executedBy="//@subpackages.0/@elements.3" inputs="//@subpackages.2/@elements.0 //@subpackages.2/@elements.5" outputs="//@subpackages.2/@elements.1"/>
    <nodes xsi:type="processes:Action" name="PlaceOrder" in="//@elements.0/@edges.10" out="//@elements.0/@edges.7" executedBy="//@elements.2" inputs="//@subpackages.2/@elements.6" outputs="//@subpackages.2/@elements.7"/>
    <nodes xsi:type="processes:DecisionNode" name="decision" in="//@elements.0/@edges.9" out="//@elements.0/@edges.10 //@elements.0/@edges.11"/>
    <nodes xsi:type="processes:MergeNode" name="merge" in="//@elements.0/@edges.6 //@elements.0/@edges.11" out="//@elements.0/@edges.8"/>
    <nodes xsi:type="processes:Action" name="GetASIN" in="//@elements.0/@edges.5" out="//@elements.0/@edges.12" executedBy="//@subpackages.0/@elements.2" inputs="//@subpackages.2/@elements.2" outputs="//@subpackages.2/@elements.6"/>
    <edges source="//@elements.0/@nodes.6" target="//@elements.0/@nodes.4"/>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.2"/>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.7"/>
    <edges source="//@elements.0/@nodes.2" target="//@elements.0/@nodes.1"/>
    <edges source="//@elements.0/@nodes.7" target="//@elements.0/@nodes.1"/>
    <edges source="//@elements.0/@nodes.4" target="//@elements.0/@nodes.11"/>
    <edges source="//@elements.0/@nodes.5" target="//@elements.0/@nodes.10"/>
    <edges source="//@elements.0/@nodes.8" target="//@elements.0/@nodes.5"/>
    <edges source="//@elements.0/@nodes.10" target="//@elements.0/@nodes.3"/>
    <edges source="//@elements.0/@nodes.1" target="//@elements.0/@nodes.9"/>
    <edges source="//@elements.0/@nodes.9" target="//@elements.0/@nodes.8">
      <guard textualdescription="credit card and mail address valid" shortdescription="creditCardValid == true &amp;&amp; mailAddressValid == true">
        <detailedSpecification attribute="">
          <subSpecification attribute="creditCardValid" value="true"/>
          <subSpecification attribute="mailAddressValid" value="true"/>
        </detailedSpecification>
      </guard>
    </edges>
    <edges source="//@elements.0/@nodes.9" target="//@elements.0/@nodes.10">
      <guard textualdescription="Credit card or mail address invalid" shortdescription="creditCardValid == invalid || mailAddressValid == false">
        <detailedSpecification attribute="" subSpecificationConnector="||">
          <subSpecification attribute="creditCardValid" value="invalid"/>
          <subSpecification attribute="mailAddressValid" value="false"/>
        </detailedSpecification>
      </guard>
    </edges>
    <edges source="//@elements.0/@nodes.11" target="//@elements.0/@nodes.0"/>
  </elements>
  <elements xsi:type="application:WebServiceApplication" name="AmazonWS" Interface="http://webservices.amazon.com/AWSECommerceService/AWSECommerceService.wsdl" Operation="CartAdd"/>
  <elements xsi:type="application:WebServiceApplication" name="CreateCart" Interface="http://localhost:8081/AmazonWS?wsdl" Operation="placeOrder"/>
</core:Model>
