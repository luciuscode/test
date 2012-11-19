<?xml version="1.0" encoding="UTF-8"?>
<core:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:application="org.eclipse.jwt/application" xmlns:core="org.eclipse.jwt/core" xmlns:data="org.eclipse.jwt/data" xmlns:organisations="org.eclipse.jwt/organisations" xmlns:processes="org.eclipse.jwt/processes" name="PP" author="Eclipse.org JWT project team" version="0.6.0" description="PP = Personal Processes:&#xD;&#xA;This is an example process of the Java Workflow Tooling (JWT) project. This workflow model has already some predefined roles, applications and data that can be used for modeling business and private processes.&#xD;&#xA;&#xD;&#xA;Please have a look at the tab &quot;Trip organisation&quot; to see a concrete example of a process model." fileversion="1.2.0">
  <subpackages name="Roles">
    <elements xsi:type="organisations:Role" name="Business" icon="pawn_glass_blue.png"/>
    <elements xsi:type="organisations:Role" name="Private" icon="pawn_glass_yellow.png"/>
  </subpackages>
  <subpackages name="Applications">
    <elements xsi:type="application:Application" name="Microsoft Word" icon="notebook.png" javaClass="eu.emundo.agilpro.fw.fe.intf.WordUi"/>
    <elements xsi:type="application:Application" name="Microsoft Excel" icon="chart.png" javaClass="eu.emundo.agilpro.fw.fe.intf.ExcelUi"/>
    <elements xsi:type="application:Application" name="OpenOffice Writer" icon="notebook.png" javaClass="eu.emundo.agilpro.fw.fe.intf.WriterUi"/>
    <elements xsi:type="application:Application" name="OpenOffice Calc" icon="line-chart.png" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.CalcUi"/>
    <elements xsi:type="application:Application" name="Adobe Acrobat" icon="contract.png" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.AcrobatUi"/>
    <elements xsi:type="application:Application" name="Internet Explorer" icon="window_earth.png" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.BrowserUi"/>
    <elements xsi:type="application:Application" name="Google search" icon="earth_find.png" jarArchive="" javaClass="eu.emundo.agilpro.fw.be.intf.GoogleWs"/>
    <elements xsi:type="application:Application" name="Search" icon="earth_view.png" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.MetaSearchUi"/>
    <elements xsi:type="application:Application" name="Generic GUI" icon="window_gear.png" jarArchive="" javaClass="eu.emundo.agilpro.fw.fe.intf.GenericUi"/>
  </subpackages>
  <subpackages name="Data">
    <subpackages name="Data types">
      <elements xsi:type="data:DataType" name="eu.emundo.agilpro.fw.fe.dto.FileDTO"/>
      <elements xsi:type="data:DataType" name="eu.emundo.agilpro.fw.be.dto.GoogleDTO"/>
      <elements xsi:type="data:DataType" name="eu.emundo.agilpro.fw.be.dto.MetaSearchDTO"/>
      <elements xsi:type="data:DataType" name="eu.emundo.agilpro.fw.fe.dto.BrowserDTO"/>
      <elements xsi:type="data:DataType" name="eu.emundo.agilpro.fw.fe.dio.GenericDIO"/>
    </subpackages>
    <subpackages name="WWW Services">
      <elements xsi:type="data:DataType" name="searchquery"/>
      <elements xsi:type="data:DataType" name="qualifier"/>
      <elements xsi:type="data:DataType" name="URL"/>
      <elements xsi:type="data:Data" name="Siemens Portal" icon="help_earth.png" value="http://www.click2procure.de" dataType="//@subpackages.2/@subpackages.1/@elements.2"/>
      <elements xsi:type="data:Data" name="Train connection" icon="help_earth.png" value="http://reiseauskunft.bahn.de/bin/query.exe/d?S=$start&amp;Z=$destination&amp;REQ0JourneyDate=$date&amp;start=1" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Google Parameter" icon="help_earth.png" value="System München" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Wikipedia" icon="help_earth.png" value="http://de.wikipedia.org/wiki/$" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Dictionary" icon="help_earth.png" value="http://dict.leo.org/ende?lp=ende&amp;search=$" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Weather" icon="help_earth.png" value="http://www.viamichelin.com/viamichelin/deu/dyn/controller/localeWeather?strLocation=$ziel&amp;strCountry=eur&amp;google=1" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Flight connection" icon="help_earth.png" value="http://www.expedia.de/pub/agent.dll?qscr=fexp&amp;flag=q&amp;city1=$start&amp;citd1=$ziel&amp;date1=$datum&amp;date2=$datum" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Map" icon="help_earth.png" value="http://www.viamichelin.com/viamichelin/deu/dyn/controller/mapPerformPage?strLocation=$ziel&amp;strCountry=eur" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Route" icon="help_earth.png" value="http://www.viamichelin.com/viamichelin/deu/dyn/controller/ItiWGPerformPage?strStartCity=$start&amp;strDestCity=$destination" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Hotels" icon="help_earth.png" value="http://www.viamichelin.com/viamichelin/deu/dyn/controller/hbListPerformPage?strLocation=$destination&amp;strCountry=eur" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Restaurants" icon="help_earth.png" value="http://www.viamichelin.com/viamichelin/deu/dyn/controller/poiListPerformPage?productId=41102&amp;strLocation=$destination&amp;strCountry=eur" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Google News" icon="help_earth.png" value="http://news.google.de/news?hl=de&amp;ned=de&amp;q=$firma&amp;btnG=News-Suche" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Company homepage" icon="help_earth.png" value="http://www.google.de/search?q=$firma&amp;btnI=1" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Sights" icon="help_earth.png" value="http://www.viamichelin.com/viamichelin/deu/dyn/controller/poiListPerformPage?productId=41104&amp;strLocation=$ziel" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="GBI Company" icon="help_earth.png" value="http://www.gbi.de/r_profisuche/firmenkontor.ein?ST0_CO=$firma&amp;START=A00&amp;DBN=CRXHRBA" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="GBI Press" icon="help_earth.png" value="http://www.gbi.de/r_profisuche/pressekontor.ein?ST0_=$firma&amp;DBN=CRX076&amp;STARTA00=Suche" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
      <elements xsi:type="data:Data" name="Google Map" icon="help_earth.png" value="http://maps.google.de/maps?f=l&amp;hl=de&amp;q=$firma&amp;near=$ort&amp;ie=UTF8&amp;z=12&amp;om=1&amp;iwloc=A" dataType="//@subpackages.2/@subpackages.1/@elements.1"/>
    </subpackages>
    <subpackages name="Input parameters">
      <elements xsi:type="data:DataType" name="dioParameter"/>
      <elements xsi:type="data:Data" name="Destination" icon="component.png" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="Start" icon="component.png" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="Street" icon="component.png" value="strasse" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="Company" icon="component.png" value="" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="Industrial sector" icon="component.png" value="'Handel' | 'Industrie' | 'Dienstleistung'" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="Date" icon="component.png" value="" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="PublicTransport" icon="component.png" value="'Train' | 'Flight'" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
      <elements xsi:type="data:Data" name="City" icon="component.png" value="" dataType="//@subpackages.2/@subpackages.2/@elements.0"/>
    </subpackages>
    <elements xsi:type="data:Data" name="File" icon="document_plain.png" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="Browser data" icon="window_environment.png" dataType="//@subpackages.2/@subpackages.0/@elements.3"/>
    <elements xsi:type="data:Data" name="Google data" icon="environment.png" dataType="//@subpackages.2/@subpackages.0/@elements.1"/>
    <elements xsi:type="data:Data" name="Meta search data" icon="environment_view.png" value="" dataType="//@subpackages.2/@subpackages.0/@elements.2"/>
    <elements xsi:type="data:Data" name="Generic data" icon="gear.png" value="" dataType="//@subpackages.2/@subpackages.0/@elements.4"/>
    <elements xsi:type="data:Data" name="Word/Writer file" icon="document_notebook.png" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="Excel/Calc file" icon="document_chart.png" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
    <elements xsi:type="data:Data" name="PDF file" icon="document_text.png" dataType="//@subpackages.2/@subpackages.0/@elements.0"/>
  </subpackages>
  <subpackages name="Processes Business">
    <elements xsi:type="processes:Activity" name="Trip organisation">
      <nodes xsi:type="processes:InitialNode" out="//@subpackages.3/@elements.0/@edges.1"/>
      <nodes xsi:type="processes:Action" name="Decide destination" in="//@subpackages.3/@elements.0/@edges.1" out="//@subpackages.3/@elements.0/@edges.0" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.8" inputs="//@subpackages.2/@subpackages.2/@elements.1 //@subpackages.2/@subpackages.2/@elements.2 //@subpackages.2/@subpackages.2/@elements.6"/>
      <nodes xsi:type="processes:Action" name="View route" in="//@subpackages.3/@elements.0/@edges.0" out="//@subpackages.3/@elements.0/@edges.2" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.11"/>
      <nodes xsi:type="processes:Action" name="Book transport" in="//@subpackages.3/@elements.0/@edges.2" out="//@subpackages.3/@elements.0/@edges.3" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.4"/>
      <nodes xsi:type="processes:Action" name="Book hotel" in="//@subpackages.3/@elements.0/@edges.3" out="//@subpackages.3/@elements.0/@edges.4" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.12"/>
      <nodes xsi:type="processes:Action" name="Find restaurant" in="//@subpackages.3/@elements.0/@edges.4" out="//@subpackages.3/@elements.0/@edges.5" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.13"/>
      <nodes xsi:type="processes:FinalNode" in="//@subpackages.3/@elements.0/@edges.5"/>
      <edges source="//@subpackages.3/@elements.0/@nodes.1" target="//@subpackages.3/@elements.0/@nodes.2"/>
      <edges source="//@subpackages.3/@elements.0/@nodes.0" target="//@subpackages.3/@elements.0/@nodes.1"/>
      <edges source="//@subpackages.3/@elements.0/@nodes.2" target="//@subpackages.3/@elements.0/@nodes.3"/>
      <edges source="//@subpackages.3/@elements.0/@nodes.3" target="//@subpackages.3/@elements.0/@nodes.4"/>
      <edges source="//@subpackages.3/@elements.0/@nodes.4" target="//@subpackages.3/@elements.0/@nodes.5"/>
      <edges source="//@subpackages.3/@elements.0/@nodes.5" target="//@subpackages.3/@elements.0/@nodes.6"/>
    </elements>
    <elements xsi:type="processes:Activity" name="Company research">
      <nodes xsi:type="processes:InitialNode" out="//@subpackages.3/@elements.1/@edges.0"/>
      <nodes xsi:type="processes:FinalNode" in="//@subpackages.3/@elements.1/@edges.4"/>
      <nodes xsi:type="processes:Action" name="Specify company" in="//@subpackages.3/@elements.1/@edges.0" out="//@subpackages.3/@elements.1/@edges.5" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.8" inputs="//@subpackages.2/@subpackages.2/@elements.4 //@subpackages.2/@subpackages.2/@elements.5 //@subpackages.2/@subpackages.2/@elements.8"/>
      <nodes xsi:type="processes:Action" name="Find company homepage" in="//@subpackages.3/@elements.1/@edges.6" out="//@subpackages.3/@elements.1/@edges.1" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.15"/>
      <nodes xsi:type="processes:Action" name="Find company news" in="//@subpackages.3/@elements.1/@edges.1" out="//@subpackages.3/@elements.1/@edges.2" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.14"/>
      <nodes xsi:type="processes:Action" name="Find entries in GBI" in="//@subpackages.3/@elements.1/@edges.2" out="//@subpackages.3/@elements.1/@edges.3" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.17"/>
      <nodes xsi:type="processes:Action" name="Find press articles" in="//@subpackages.3/@elements.1/@edges.3" out="//@subpackages.3/@elements.1/@edges.4" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.18"/>
      <nodes xsi:type="processes:Action" name="Find company" in="//@subpackages.3/@elements.1/@edges.5" out="//@subpackages.3/@elements.1/@edges.6" performedBy="//@subpackages.0/@elements.0" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.19"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.0" target="//@subpackages.3/@elements.1/@nodes.2"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.3" target="//@subpackages.3/@elements.1/@nodes.4"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.4" target="//@subpackages.3/@elements.1/@nodes.5"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.5" target="//@subpackages.3/@elements.1/@nodes.6"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.6" target="//@subpackages.3/@elements.1/@nodes.1"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.2" target="//@subpackages.3/@elements.1/@nodes.7"/>
      <edges source="//@subpackages.3/@elements.1/@nodes.7" target="//@subpackages.3/@elements.1/@nodes.3"/>
    </elements>
  </subpackages>
  <subpackages name="Processes private">
    <elements xsi:type="processes:Activity" name="Trip organisation private">
      <nodes xsi:type="processes:Action" name="Specify target" in="//@subpackages.4/@elements.0/@edges.0" out="//@subpackages.4/@elements.0/@edges.1" performedBy="//@subpackages.0/@elements.1" executedBy="//@subpackages.1/@elements.8" inputs="//@subpackages.2/@subpackages.2/@elements.1 //@subpackages.2/@subpackages.2/@elements.2 //@subpackages.2/@subpackages.2/@elements.6 //@subpackages.2/@subpackages.2/@elements.7"/>
      <nodes xsi:type="processes:Action" name="Define route" in="//@subpackages.4/@elements.0/@edges.2" out="//@subpackages.4/@elements.0/@edges.4" performedBy="//@subpackages.0/@elements.1" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.4"/>
      <nodes xsi:type="processes:Action" name="Define route" in="//@subpackages.4/@elements.0/@edges.3" out="//@subpackages.4/@elements.0/@edges.5" performedBy="//@subpackages.0/@elements.1" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.9"/>
      <nodes xsi:type="processes:Action" name="Show weather" in="//@subpackages.4/@elements.0/@edges.6" out="//@subpackages.4/@elements.0/@edges.7" performedBy="//@subpackages.0/@elements.1" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.8"/>
      <nodes xsi:type="processes:Action" name="Show sights" in="//@subpackages.4/@elements.0/@edges.7" out="//@subpackages.4/@elements.0/@edges.8" performedBy="//@subpackages.0/@elements.1" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.16"/>
      <nodes xsi:type="processes:Action" name="Book room" in="//@subpackages.4/@elements.0/@edges.8" out="//@subpackages.4/@elements.0/@edges.9" performedBy="//@subpackages.0/@elements.1" executedBy="//@subpackages.1/@elements.7" inputs="//@subpackages.2/@subpackages.1/@elements.12"/>
      <nodes xsi:type="processes:InitialNode" out="//@subpackages.4/@elements.0/@edges.0"/>
      <nodes xsi:type="processes:FinalNode" in="//@subpackages.4/@elements.0/@edges.9"/>
      <nodes xsi:type="processes:DecisionNode" in="//@subpackages.4/@elements.0/@edges.1" out="//@subpackages.4/@elements.0/@edges.2 //@subpackages.4/@elements.0/@edges.3"/>
      <nodes xsi:type="processes:MergeNode" in="//@subpackages.4/@elements.0/@edges.4 //@subpackages.4/@elements.0/@edges.5" out="//@subpackages.4/@elements.0/@edges.6"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.6" target="//@subpackages.4/@elements.0/@nodes.0"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.0" target="//@subpackages.4/@elements.0/@nodes.8"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.8" target="//@subpackages.4/@elements.0/@nodes.1">
        <guard textualdescription="Transportation via train" shortdescription="PublicTransport.PublicTransport == Train">
          <detailedSpecification data="//@subpackages.2/@subpackages.2/@elements.7" attribute="PublicTransport" value="Train"/>
        </guard>
      </edges>
      <edges source="//@subpackages.4/@elements.0/@nodes.8" target="//@subpackages.4/@elements.0/@nodes.2">
        <guard textualdescription="Transportation via flight" shortdescription="PublicTransport.PublicTransport == Flight">
          <detailedSpecification data="//@subpackages.2/@subpackages.2/@elements.7" attribute="PublicTransport" value="Flight"/>
        </guard>
      </edges>
      <edges source="//@subpackages.4/@elements.0/@nodes.1" target="//@subpackages.4/@elements.0/@nodes.9"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.2" target="//@subpackages.4/@elements.0/@nodes.9"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.9" target="//@subpackages.4/@elements.0/@nodes.3"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.3" target="//@subpackages.4/@elements.0/@nodes.4"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.4" target="//@subpackages.4/@elements.0/@nodes.5"/>
      <edges source="//@subpackages.4/@elements.0/@nodes.5" target="//@subpackages.4/@elements.0/@nodes.7"/>
    </elements>
  </subpackages>
</core:Model>