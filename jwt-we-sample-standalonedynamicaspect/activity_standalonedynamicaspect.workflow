<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:core="org.eclipse.jwt/core" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="MainPackage" fileversion="0.6.0">
  <elements xsi:type="processes:Activity" name="Diagram1">
    <nodes xsi:type="processes:Action" name="WS SA Action" in="//@elements.0/@edges.0" out="//@elements.0/@edges.1" performedBy="//@elements.1" referenceEdges="//@elements.0/@referenceEdges.0">
      <Location x="140" y="153"/>
      <Size width="71" height="31"/>
    </nodes>
    <nodes xsi:type="processes:InitialNode" out="//@elements.0/@edges.0">
      <Location x="41" y="158"/>
    </nodes>
    <nodes xsi:type="processes:FinalNode" in="//@elements.0/@edges.1">
      <Location x="294" y="157"/>
    </nodes>
    <edges source="//@elements.0/@nodes.1" target="//@elements.0/@nodes.0"/>
    <edges source="//@elements.0/@nodes.0" target="//@elements.0/@nodes.2"/>
    <references reference="//@elements.1" referenceEdges="//@elements.0/@referenceEdges.0">
      <Location x="164" y="56"/>
    </references>
    <referenceEdges reference="//@elements.0/@references.0" action="//@elements.0/@nodes.0"/>
  </elements>
  <elements xsi:type="organisations:Role" name="role" icon=""/>
</core:Model>
