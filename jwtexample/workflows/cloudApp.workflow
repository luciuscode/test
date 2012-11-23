<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="org.eclipse.jwt/application" xmlns:core="org.eclipse.jwt/core" xmlns:data="org.eclipse.jwt/data" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="Workflow" author="xi" version="1.0" description="" fileversion="1.2.0">
  <subpackages name="Applications">
    <ownedComment text="The standard package for applications"/>
  </subpackages>
  <subpackages name="Roles">
    <ownedComment text="The standard package for roles"/>
    <elements xsi:type="organisations:Role" name="" icon=""/>
    <elements xsi:type="organisations:Role" name="PaaS" icon=""/>
    <elements xsi:type="organisations:Role" name="Tenant1" icon=""/>
    <elements xsi:type="organisations:Role" name="Tenant2" icon=""/>
    <elements xsi:type="organisations:Role" name="User1" icon=""/>
    <elements xsi:type="organisations:Role" name="User2" icon=""/>
    <elements xsi:type="organisations:Role" name="User3" icon=""/>
    <elements xsi:type="organisations:Role" name="User4" icon=""/>
  </subpackages>
  <subpackages name="Data">
    <ownedComment text="The standard package for data"/>
    <subpackages name="Datatypes">
      <ownedComment text="The standard package for datatypes"/>
      <elements xsi:type="data:DataType" name="URL"/>
      <elements xsi:type="data:DataType" name="dioParameter"/>
      <elements xsi:type="data:DataType" name="qualifier"/>
      <elements xsi:type="data:DataType" name="searchquery"/>
      <elements xsi:type="data:DataType" name="filename"/>
    </subpackages>
  </subpackages>
  <elements xsi:type="processes:Activity" name="cloudApp">
    <ownedComment text="This is a basic activity"/>
    <nodes xsi:type="processes:InitialNode" out="//@elements.0/@edges.0"/>
    <nodes xsi:type="processes:Action" name="Declaration" in="//@elements.0/@edges.0" out="//@elements.0/@edges.1" performedBy="//@subpackages.1/@elements.1" executedBy="//@elements.3" inputs="//@elements.2" outputs="//@elements.4"/>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.2"/>
    <nodes xsi:type="processes:Action" name="Configuration" in="//@elements.0/@edges.1" out="//@elements.0/@edges.2" performedBy="//@subpackages.1/@elements.1" executedBy="//@elements.5" inputs="//@elements.4" outputs="//@elements.6"/>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.1"/>
    <edges source="//@elements.0/@nodes.1" target="//@elements.0/@nodes.3"/>
    <edges source="//@elements.0/@nodes.3" target="//@elements.0/@nodes.2"/>
  </elements>
  <elements xsi:type="organisations:Role"/>
  <elements xsi:type="data:Data" name="initial fm"/>
  <elements xsi:type="application:Application" name="declare" jarArchive="" javaClass=""/>
  <elements xsi:type="data:Data" name="fm1"/>
  <elements xsi:type="application:Application" name="preConfig"/>
  <elements xsi:type="data:Data" name="fm2"/>
</core:Model>
