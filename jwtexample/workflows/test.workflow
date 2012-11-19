<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="org.eclipse.jwt/application" xmlns:core="org.eclipse.jwt/core" xmlns:data="org.eclipse.jwt/data" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="Workflow" author="xi" version="1,0" fileversion="1.2.0">
  <subpackages name="Applications">
    <ownedComment text="The standard package for applications"/>
    <elements xsi:type="application:Application" name="test" icon="" jarArchive="" javaClass="asd" method=""/>
  </subpackages>
  <subpackages name="Roles">
    <ownedComment text="The standard package for roles"/>
    <elements xsi:type="organisations:Role" name="test1" icon=""/>
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
    <elements xsi:type="data:Data" name="test" icon="" value="" dataType="//@subpackages.2/@subpackages.0/@elements.4"/>
  </subpackages>
  <elements xsi:type="processes:Activity" name="Diagram1">
    <ownedComment text="This is a basic activity"/>
    <nodes xsi:type="processes:InitialNode" out="//@elements.0/@edges.3"/>
    <nodes xsi:type="processes:Action" name="action1" in="//@elements.0/@edges.4" out="//@elements.0/@edges.1"/>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.1"/>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.2"/>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.7"/>
    <nodes xsi:type="processes:Action" name="action2" in="//@elements.0/@edges.5" out="//@elements.0/@edges.2"/>
    <nodes xsi:type="processes:Action" name="action3" in="//@elements.0/@edges.6" out="//@elements.0/@edges.7"/>
    <nodes xsi:type="processes:Action" in="//@elements.0/@edges.3" out="//@elements.0/@edges.0"/>
    <nodes xsi:type="processes:ForkNode" in="//@elements.0/@edges.0" out="//@elements.0/@edges.4 //@elements.0/@edges.5 //@elements.0/@edges.6"/>
    <edges source="//@elements.0/@nodes.7" target="//@elements.0/@nodes.8"/>
    <edges source="//@elements.0/@nodes.1" target="//@elements.0/@nodes.2"/>
    <edges source="//@elements.0/@nodes.5" target="//@elements.0/@nodes.3"/>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.7"/>
    <edges source="//@elements.0/@nodes.8" target="//@elements.0/@nodes.1"/>
    <edges source="//@elements.0/@nodes.8" target="//@elements.0/@nodes.5"/>
    <edges source="//@elements.0/@nodes.8" target="//@elements.0/@nodes.6"/>
    <edges source="//@elements.0/@nodes.6" target="//@elements.0/@nodes.4"/>
  </elements>
</core:Model>
