<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="org.eclipse.jwt/application" xmlns:core="org.eclipse.jwt/core" xmlns:data="org.eclipse.jwt/data" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="Workflow" author="" version="" fileversion="1.2.0">
  <subpackages name="Applications">
    <ownedComment text="The standard package for applications"/>
    <elements xsi:type="application:Application" name="Internet Browser" icon="" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.BrowserUi" method=""/>
    <elements xsi:type="application:Application" name="Generic GUI" icon="" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.GenericUi" method=""/>
  </subpackages>
  <subpackages name="Roles">
    <ownedComment text="The standard package for roles"/>
    <elements xsi:type="organisations:Role" name="TestRole" icon=""/>
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
      <elements xsi:type="data:Data" name="google url" icon="" value="www.google.com" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
      <elements xsi:type="data:Data" name="Decision" icon="" value="'google'|'bing'" dataType="//@subpackages.2/@subpackages.0/@elements.1"/>
    </subpackages>
  </subpackages>
  <elements xsi:type="processes:Activity" name="test1">
    <ownedComment text="This is a basic activity"/>
    <nodes xsi:type="processes:InitialNode" out="//@elements.0/@edges.0"/>
    <nodes xsi:type="processes:Action" name="Action1" in="//@elements.0/@edges.2" out="//@elements.0/@edges.5" performedBy="//@subpackages.1/@elements.0" executedBy="//@subpackages.0/@elements.0" inputs="//@subpackages.2/@subpackages.0/@elements.5"/>
    <nodes xsi:type="processes:Action" name="Make Decision" in="//@elements.0/@edges.0" out="//@elements.0/@edges.1" performedBy="//@subpackages.1/@elements.0" executedBy="//@subpackages.0/@elements.1" inputs="//@subpackages.2/@subpackages.0/@elements.6"/>
    <nodes xsi:type="processes:Action" name="Action2" in="//@elements.0/@edges.3" out="//@elements.0/@edges.4" performedBy="//@subpackages.1/@elements.0" executedBy="//@subpackages.0/@elements.0" inputs="//@elements.1"/>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.12"/>
    <nodes xsi:type="processes:Action" name="Action3" in="//@elements.0/@edges.6" out="//@elements.0/@edges.7"/>
    <nodes xsi:type="processes:JoinNode" in="//@elements.0/@edges.4 //@elements.0/@edges.5" out="//@elements.0/@edges.6"/>
    <nodes xsi:type="processes:ForkNode" in="//@elements.0/@edges.7" out="//@elements.0/@edges.8 //@elements.0/@edges.9"/>
    <nodes xsi:type="processes:Action" name="Action4" in="//@elements.0/@edges.8" out="//@elements.0/@edges.10"/>
    <nodes xsi:type="processes:Action" name="Action5" in="//@elements.0/@edges.9" out="//@elements.0/@edges.11"/>
    <nodes xsi:type="processes:MergeNode" in="//@elements.0/@edges.10 //@elements.0/@edges.11" out="//@elements.0/@edges.12"/>
    <nodes xsi:type="processes:ForkNode" in="//@elements.0/@edges.1" out="//@elements.0/@edges.2 //@elements.0/@edges.3"/>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.2"/>
    <edges source="//@elements.0/@nodes.2" target="//@elements.0/@nodes.11"/>
    <edges source="//@elements.0/@nodes.11" target="//@elements.0/@nodes.1"/>
    <edges source="//@elements.0/@nodes.11" target="//@elements.0/@nodes.3"/>
    <edges source="//@elements.0/@nodes.3" target="//@elements.0/@nodes.6"/>
    <edges source="//@elements.0/@nodes.1" target="//@elements.0/@nodes.6"/>
    <edges source="//@elements.0/@nodes.6" target="//@elements.0/@nodes.5"/>
    <edges source="//@elements.0/@nodes.5" target="//@elements.0/@nodes.7"/>
    <edges source="//@elements.0/@nodes.7" target="//@elements.0/@nodes.8"/>
    <edges source="//@elements.0/@nodes.7" target="//@elements.0/@nodes.9"/>
    <edges source="//@elements.0/@nodes.8" target="//@elements.0/@nodes.10"/>
    <edges source="//@elements.0/@nodes.9" target="//@elements.0/@nodes.10"/>
    <edges source="//@elements.0/@nodes.10" target="//@elements.0/@nodes.4"/>
  </elements>
  <elements xsi:type="data:Data" name="bing url" value="www.bing.com" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
</core:Model>
