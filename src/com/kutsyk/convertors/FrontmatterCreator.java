package com.kutsyk.convertors;

import com.kutsyk.grammar.LaTEXLexer;
import com.kutsyk.grammar.LaTEXParser;
import com.kutsyk.windows.MainWindow;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

// TODO: Auto-generated Javadoc
/**
 * The Class FrontmatterCreator.
 *
 * @author Vasyl
 * This class creates front.xml file where it saves all information
 * that will be inserted in result xml before tag <body>
 */

public class FrontmatterCreator {

	/** The writer. */
	private PrintWriter writer;
	
	/** The journal title. */
	private String journalTitle = "";
	
	/** The meta data file. */
	private String metaDataFile = "";
	
	/**
	 * Instantiates a new frontmatter creator.
	 *
	 * @param metaDataFile the meta data file
	 */
	FrontmatterCreator(String metaDataFile) {
		this.metaDataFile = metaDataFile;
	}
	
	/**
	 * Run.
	 */
	public void run()
	{
		openFileForWritting();
		openMetaDataXMLFile(metaDataFile);
		writer.close();
	}

	/**
	 * Open file for writting.
	 */
	private void openFileForWritting() {
		try {
			writer = new PrintWriter(MainWindow.mainPath + "/LaTEXtoXML/front.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open meta data xml file.
	 *
	 * @param metaDataFile the meta data file
	 */
	private void openMetaDataXMLFile(String metaDataFile) {
		try {
			Document doc = getDocumentXML(metaDataFile);
			createFront(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the document xml.
	 *
	 * @param metaDataFile the meta data file
	 * @return the document xml
	 * @throws Exception the exception
	 */
	private Document getDocumentXML(String metaDataFile) throws Exception {
		File metaFile = new File(metaDataFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(metaFile);
		doc.getDocumentElement().normalize();

		return doc;
	}

	/**
	 * Calls all methods which write information to front.xml file  
	 *
	 * @param doc the doc
	 */
	private void createFront(Document doc) {
		writeFixedFrontInfo();
		writeJnlTlAndAbrv(doc);
		writeVolumeAndIssueAndDate(doc);
		writeIssn();
		writeMedlineJnTl();
		writeUnitinfo(doc);
		writeFront(doc);
	}

	/**
	 * Write fixed front info.
	 */
	private void writeFixedFrontInfo() {
		writer.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<!DOCTYPE doc SYSTEM \"http://www.charlesworth-group.com/hch-jnl/hch.dtd\">"
				+ "<?xmlspysps http://www.charlesworth-group.com/hch-jnl/hch-jnl.sps?>"
				+ "<doc xmlns=\"urn:hch-jnl-BB4C2D71-E80A-4fe7-B7D8-FDAF121D7AD6\""
				+ "xmlns:tbl=\"urn:hch:table-470CC8FB-4DFD-4003-9403-2FE04FAB5760\""
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
				+ "xsi:schemaLocation=\"urn:hch-jnl-BB4C2D71-E80A-4fe7-B7D8-FDAF121D7AD6"
				+ "http://www.charlesworth-group.com/hch-jnl/hch-journal.xsd\"><jnl-info>");
		writer.println("<pub-name>Public Library of Science</pub-name>"
				+ "<pub-loc><address>San Francisco, USA</address></pub-loc>");
	}
	
	/**
	 * Write jnl tl and abrv.
	 *
	 * @param doc the doc
	 */
	private void writeJnlTlAndAbrv(Document doc) {
		NodeList nList = doc.getElementsByTagName("journal-title");
		String title = getNodesValue(nList);
		journalTitle = title;
		writer.println("<jnl-tl>" + title + "</jnl-tl>");
		String abrv = "";
		if (title.contains("PLoS Computational Biology")
				|| title.contains("PLOS Computational Biology"))
			abrv = "PCBI";
		writer.println("<abrv-jnl-tl>" + abrv + "</abrv-jnl-tl>");
	}

	/**
	 * Write volume and issue and date.
	 *
	 * @param doc the doc
	 */
	private void writeVolumeAndIssueAndDate(Document doc) {
		NodeList nList = doc.getElementsByTagName("volume");
		String vol = getNodesValue(nList);
		if (vol.isEmpty())
			vol = "XXX";
		writer.println("<vol>" + vol + "</vol>");
		writer.println("<issue-no>XXX</issue-no>");
		writer.println("<date><year>XXX</year><month>XXX</month></date>");
	}

	/**
	 * Write issn.
	 */
	private void writeIssn() {
		writer.println("<issn type=\"print\">1553-734X</issn><issn type=\"online\">1553-7358</issn>");
	}

	/**
	 * Write medline jn tl.
	 */
	private void writeMedlineJnTl() {
		if (journalTitle.contains("PLoS Computational Biology")
				|| journalTitle.contains("PLOS Computational Biology"))
			writer.println("<medline-jnl-tl>PLoS Comput Biol</medline-jnl-tl>");

		writer.println("</jnl-info><article>");
	}

	/**
	 * Write unitinfo.
	 *
	 * @param doc the doc
	 */
	private void writeUnitinfo(Document doc) {
		writer.println("<unit-info>");
		writeCounters();
		writeSici(doc);
		writeDoi(doc);
		writeCateg(doc);
		writeTopic(doc);
		writeCrypt(doc);
		writeUnitId();
		writeRhRfInfo(doc);
		writeCTrakerId();
		writer.println("</unit-info>");
	}

	/**
	 * Write counters.
	 */
	private void writeCounters() {
		writer.println("<fpage>000</fpage>");
		writer.println("<lpage>000</lpage>");
		writer.println("<pag-cnt>000</pag-cnt>");
		File counter = new File(MainWindow.mainPath + "/LaTEXtoXML/figures");
		writer.println("<fig-cnt>" + counter.list().length + "</fig-cnt>");
		writer.println("<equ-cnt>000</equ-cnt>");
		counter = new File(MainWindow.mainPath + "/LaTEXtoXML/bibliography");
		writer.println("<ref-cnt>" + counter.list().length + "</ref-cnt>");
		writer.println("<wrd-cnt>000</wrd-cnt>");
		counter = new File(MainWindow.mainPath + "/LaTEXtoXML/tables");
		writer.println("<tbl-cnt>" + counter.list().length + "</tbl-cnt>");
	}

	/**
	 * Write sici.
	 *
	 * @param doc the doc
	 */
	private void writeSici(Document doc) {
		writer.print("<sici>");
		NodeList nList = doc.getElementsByTagName("article-id");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("pub-id-type").equals("publisher-id")) {
					String content = node.getTextContent();
					writer.print(workoutString(content));
				}
			}
		}
		writer.println("</sici>");
	}

	/** The doi. */
	private String doi = "";

	/**
	 * Write doi.
	 *
	 * @param doc the doc
	 */
	private void writeDoi(Document doc) {
		writer.print("<doi>");
		NodeList nList = doc.getElementsByTagName("article-id");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("pub-id-type").equals("doi")) {
					String content = node.getTextContent();
					doi = content;
					writer.print(workoutString(content));
				}
			}
		}
		writer.println("</doi>");
	}

	/**
	 * Write categ.
	 *
	 * @param doc the doc
	 */
	private void writeCateg(Document doc) {
		writer.print("<categ>");
		NodeList nList = doc.getElementsByTagName("subj-group");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("subj-group-type").equals(
						"Article Type")) {
					String content = node.getTextContent();
					writer.print(content);
				}
			}
		}
		writer.println("</categ>");
	}

	/**
	 * Write topic.
	 *
	 * @param doc the doc
	 */
	private void writeTopic(Document doc) {
		writer.print("<topic id=\"topic1\">");
		NodeList nList = doc.getElementsByTagName("subj-group");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("subj-group-type").equals(
						"Classification")) {
					String content = "";
					writer.print("&lt;subj&hyphen;groupsubj&hyphen;group&hyphen;type&equals;&quot;Discipline&hyphen;v2&quot;&gt;");
					getTopicInformation(eElement.getChildNodes());
					writer.print("&lt;&sol;subj&hyphen;group&gt;");
					writer.print(content);
				}
			}
		}
		writer.println("</topic>");
	}

	/**
	 * Gets the topic information.
	 *
	 * @param nodeList the node list
	 * @return the topic information
	 */
	private void getTopicInformation(NodeList nodeList) {
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			// make sure it's element node.
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
				if (tempNode.getNodeName().equals("subj-group")) {
					Element element = (Element) tempNode;
					writer.print("&lt;subj&hyphen;group&gt;");
					if (element.getAttribute("subj-group-type").equals(
							"Classification"))
						writer.print("subj&hyphen;group&hyphen;type&equals;&quot;Discipline&hyphen;v2&quot;&gt;");
				} else if (tempNode.getNodeName().equals("subject")) {
					writer.print("&lt;subject&gt;");
					writer.print(tempNode.getTextContent());
					writer.print("&lt;&sol;subject&gt;");
				}
				getTopicInformation(tempNode.getChildNodes());
				writer.println("&lt;&sol;subj&hyphen;group&gt;");
			}
		}
	}

	/**
	 * Write crypt.
	 *
	 * @param doc the doc
	 */
	private void writeCrypt(Document doc) {
		writer.print("<cpyrt>");
		writeCryptDate();
		writeCryptName(doc);
		writer.println("</cpyrt>");
	}

	/**
	 * Write crypt date.
	 */
	private void writeCryptDate() {

		writer.print("<date>");
		writer.println("<year>XXX</year>");
		writer.println("</date>");
	}

	/**
	 * Write crypt name.
	 *
	 * @param doc the doc
	 */
	private void writeCryptName(Document doc) {
		writer.print("<cpyrt-name>");
		writeOrgName(doc);
		writer.println("</cpyrt-name>");
	}

	/**
	 * Write org name.
	 *
	 * @param doc the doc
	 */
	private void writeOrgName(Document doc) {
		writer.print("<org-name>");
		writeAuthorList(doc);
		writer.println("</org-name>");
	}

	/**
	 * Write author list.
	 *
	 * @param doc the doc
	 */
	private void writeAuthorList(Document doc) {
		NodeList nList = doc.getElementsByTagName("surname");

		if (nList.getLength() == 1)
			writeOneAuthor(doc);

		if (nList.getLength() == 2)
			writeTwoAuthors(doc);

		if (nList.getLength() > 2)
			writeMoteThanTwoAuthors(doc);

		writerEmploeeInfo(doc);
	}

	/**
	 * Write one author.
	 *
	 * @param doc the doc
	 */
	private void writeOneAuthor(Document doc) {
		NodeList nList = doc.getElementsByTagName("surname");
		Node node = nList.item(0);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			String content = node.getTextContent();
			writer.print(content);
		}
	}

	/**
	 * Write two authors.
	 *
	 * @param doc the doc
	 */
	private void writeTwoAuthors(Document doc) {
		NodeList nList = doc.getElementsByTagName("surname");
		Node node = nList.item(0);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			String content = node.getTextContent();
			writer.print(content + ", ");
		}
		node = nList.item(1);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			String content = node.getTextContent();
			writer.print(content);
		}
	}

	/**
	 * Write mote than two authors.
	 *
	 * @param doc the doc
	 */
	private void writeMoteThanTwoAuthors(Document doc) {
		NodeList nList = doc.getElementsByTagName("surname");
		Node node = nList.item(0);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			String content = node.getTextContent();
			writer.print(content + " et al.");
		}
	}

	/**
	 * Writer emploee info.
	 *
	 * @param doc the doc
	 */
	private void writerEmploeeInfo(Document doc) {
		NodeList nList = doc.getElementsByTagName("custom-meta");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("id").equals("copyright-statement")) {
					String content = getMetaValue(eElement.getChildNodes());
					writer.print(content);
				}
			}
		}
	}

	/**
	 * Gets the meta value.
	 *
	 * @param nList the n list
	 * @return the meta value
	 */
	private String getMetaValue(NodeList nList) {
		String result = "";
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				if (node.getNodeName().equals("meta-value")) {
					String content = node.getTextContent();
					content = content.replace("\n", "");
					content = content.replaceAll("\\s+", " ");					
					if (content.equals("No - I am not an employee of the United States government"))
						
						return "This is an open&hyphen;access article distributed under the	terms of the"
								+ "<?up?><?show +\"linkList\"tpmkset \"web1\",\"description\",\"\",\"*http://creativecommons.org/licenses/by/4.0/\",0,0,2$10#?>"
								+ "<?show $60#?tbklnk==\"web1\"$62#><?><url url=\"http://creativecommons.org/licenses/by/4.0/\">Creative Commons Attribution License</url>"
								+ "<?tbklnk?><?down?>, which permits unrestricted use, distribution, and reproduction"
								+ " in any medium, provided the original author and source are credited.";
				}
			}
		}
		return result;
	}

	/**
	 * Write unit id.
	 */
	private void writeUnitId() {
		writer.print("<unit-id>");
		String id = doi.substring(doi.lastIndexOf('.') + 1, doi.length());
		int j = 0;
		while (id.charAt(j) == 48)
			++j;
		id = id.substring(j, id.length());
		writer.print('e' + id);
		writer.println("</unit-id>");
	}

	/**
	 * Write rh rf info.
	 *
	 * @param doc the doc
	 */
	private void writeRhRfInfo(Document doc) {
		writer.println("<rf-recto></rf-recto>");
		writer.println("<rf-verso></rf-verso>");

		writer.print("<rh-recto>");
		String content = getAltTitle(doc);
		writer.print(content);
		writer.println("</rh-recto>");
		writer.println("<rh-verso></rh-verso>");
	}

	/**
	 * Gets the alt title.
	 *
	 * @param doc the doc
	 * @return the alt title
	 */
	private String getAltTitle(Document doc) {
		String result = "";
		NodeList nList = doc.getElementsByTagName("alt-title");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getAttribute("alt-title-type").equals(
						"running-head")) {
					String content = node.getTextContent();
					writer.print(content);
				}
			}
		}
		return result;
	}

	/**
	 * Write c traker id.
	 */
	private void writeCTrakerId() {
		writer.print("<c-tracker-id>");
		String firstPart = doi.substring(0, doi.lastIndexOf('.'));
		firstPart = firstPart.substring(firstPart.lastIndexOf('.') + 1,
				firstPart.length());
		String secondPart = doi.substring(doi.lastIndexOf('.'), doi.length());
		int j = 0;
		while (secondPart.charAt(j) == 48)
			++j;
		secondPart = secondPart.substring(j, secondPart.length());
		writer.print(firstPart + secondPart);
		writer.println("</c-tracker-id>");
	}

	/**
	 * Write front.
	 *
	 * @param doc the doc
	 */
	private void writeFront(Document doc) {
		writer.println("<front>");
		writeTitle(doc);
		writeAuthorGroup(doc);
		writeEditorGroup(doc);
		writeHistory(doc);
		writeGrant(doc);
		writeAbstract(doc);
		writer.println("</front>");
	}

	/**
	 * Write title.
	 *
	 * @param doc the doc
	 */
	private void writeTitle(Document doc) {
		writer.print("<title-grp>");
		writer.print("<title>");
		NodeList nList = doc.getElementsByTagName("article-title");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				String content = node.getTextContent();
				writer.print(workoutString(content));
			}
		}
		writer.println("</title>");
		writer.println("</title-grp>");
	}

	/**
	 * Write author group.
	 *
	 * @param doc the doc
	 */
	private void writeAuthorGroup(Document doc) {
		writer.print("<author-grp>");
		writeAuthors(doc);
		writer.println("</author-grp>");
	}

	/**
	 * Write editor group.
	 *
	 * @param doc the doc
	 */
	private void writeEditorGroup(Document doc) {
		writer.print("<author-grp type=\"editor\">");
		writeEditor(doc);
		writer.println("</author-grp>");
	}

	/**
	 * Write authors.
	 *
	 * @param doc the doc
	 */
	private void writeAuthors(Document doc) {
		String authDataList = getAuthordata();
		String[] dataList = authDataList.split(",\n");

		NodeList nList = doc.getElementsByTagName("contrib");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("contrib")
						&& !eElement.getAttribute("contrib-type").equals(
								"author"))
					continue;
			}
            if(i>=dataList.length)
                return;
            if(dataList[i].indexOf("{")<dataList[i].indexOf("$^{"))
                dataList[i] = dataList[i].substring(dataList[i].indexOf("{") + 1,
                        dataList[i].lastIndexOf("}"));
			dataList[i] = dataList[i].substring(dataList[i].indexOf("$^{") + 3,
					dataList[i].indexOf("}$"));
			String[] values = dataList[i].split(",");
			String affs = "affs=\"";
			boolean isCorrespondingAuthor = false;

			for (int j = 0; j < values.length; ++j)
				if (Character.isDigit(values[j].charAt(0)))
					affs += "aff" + values[j] + ' ';
				else
					isCorrespondingAuthor = true;

			affs += "\"";
			if (isCorrespondingAuthor)
				writer.print("<corresponding-author " + affs + ">");
			else
				writer.print("<author " + affs + ">");

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("contrib")
						&& eElement.getAttribute("contrib-type").equals(
								"author"))
					writeAuthorData(eElement.getChildNodes(), isCorrespondingAuthor);
			}
			if (isCorrespondingAuthor)
				writer.println("</corresponding-author>");
			else
				writer.println("</author>");
		}
	}

	/**
	 * Write editor.
	 *
	 * @param doc the doc
	 */
	private void writeEditor(Document doc) {
		NodeList nList = doc.getElementsByTagName("contrib");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("contrib")
						&& eElement.getAttribute("contrib-type").equals(
								"editor"))
					writeEditorData(eElement.getChildNodes());
			}
		}
		writeAffEditorInfo(doc);
	}

	/**
	 * Write author data.
	 *
	 * @param nList the n list
	 * @param correspAuthor the corresp author
	 */
	private void writeAuthorData(NodeList nList, boolean correspAuthor) {
		String surname = "";
		String name = "";
		String email = "";
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeName().equals("name"))
				writeAuthorData(node.getChildNodes(), correspAuthor);

			if (node.getNodeName().equals("surname")) {
				surname += "<surname>";
				surname += node.getTextContent();
				surname += "</surname>";
			} else if (node.getNodeName().equals("given-names")) {
				name += "<forename>";
				name += node.getTextContent();
				name += "</forename>";
			}else if (node.getNodeName().equals("email")) {
				email += "<note type=\"email\">";
				email += workoutString(node.getTextContent());
				email += "</note>";
			}
		}
		writer.print(name);
		writer.print(surname);
		if(correspAuthor)
			writer.print(email);
	}

	/** The aff id. */
	private String affId = "";

	/**
	 * Write editor data.
	 *
	 * @param nList the n list
	 */
	private void writeEditorData(NodeList nList) {
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeName().equals("role"))
				if (!node.getTextContent().equals("Associate Editor"))
					return;
		}
		String surname = "";
		String name = "";
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);

			if (node.getNodeName().equals("xref"))
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					if (eElement.getTagName().equals("xref"))
						affId = eElement.getAttribute("rid");
				}

			if (node.getNodeName().equals("name"))
				writeEditorData(node.getChildNodes());

			if (node.getNodeName().equals("surname")) {
				surname += "<surname>";
				surname += node.getTextContent();
				surname += "</surname>";
			} else if (node.getNodeName().equals("given-names")) {
				name += "<forename>";
				name += node.getTextContent();
				name += "</forename>";
			}
		}
		if (name.isEmpty() || surname.isEmpty())
			return;

		writer.print("<author affs=\"e1\">");
		writer.print(name);
		writer.print(surname);
		writer.println("</author>");
	}

	/**
	 * Write aff editor info.
	 *
	 * @param doc the doc
	 */
	private void writeAffEditorInfo(Document doc) {
		writer.print("<aff id=\"e1\" num=\"1\">");
		writeAffInfo(doc);
		writer.println("</aff>");
	}
	
	/**
	 * Write aff info.
	 *
	 * @param doc the doc
	 */
	private void writeAffInfo(Document doc) {
		NodeList nList = doc.getElementsByTagName("aff");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("aff")
						&& eElement.getAttribute("id").equals(affId))
					getAffData(eElement.getChildNodes());
			}
		}
	}

	/**
	 * Gets the aff data.
	 *
	 * @param nList the n list
	 * @return the aff data
	 */
	private void getAffData(NodeList nList) {
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("institution")
						&& !eElement.hasAttributes()) {
					writer.print("<org-name num=\"\" type=\"\">");
					writer.print(eElement.getTextContent());
					writer.println("</org-name>");
				} else if (eElement.getTagName().equals("country")) {
					String country = eElement.getTextContent();
					if(country.equals("UNITED STATES"))
						country = "United States of America";
					
					writer.print("<address>");
					writer.print(country);
					writer.println("</address>");
				}
			}
		}
	}

	/**
	 * Write history.
	 *
	 * @param doc the doc
	 */
	private void writeHistory(Document doc) {
		writer.print("<history>");
		writeAllHistoryData(doc);
//		writeMiscData(doc);
		writer.println("</history>");
	}
	
	/**
	 * Write all history data.
	 *
	 * @param doc the doc
	 */
	private void writeAllHistoryData(Document doc)
	{
		NodeList nList = doc.getElementsByTagName("date");
		for (int i = 0; i < nList.getLength(); ++i) {
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("date"))
					if(eElement.getAttribute("date-type").equals("received"))
						writeReceived(eElement.getChildNodes());
					else if(eElement.getAttribute("date-type").equals("accepted"))
						writeAccepted(eElement.getChildNodes());
				
			}
		}
	}
	
	/**
	 * Write received.
	 *
	 * @param nList the n list
	 */
	private void writeReceived(NodeList nList)
	{
		writer.print("<received>");
		writer.print("<date-text>Received</date-text>");
		writeHistoryDate(nList);
		writer.println("</received>");
	}
	
	/**
	 * Write accepted.
	 *
	 * @param nList the n list
	 */
	private void writeAccepted(NodeList nList)
	{
		writer.print("<accepted>");
		writer.print("<date-text>Accepted</date-text>");
		writeHistoryDate(nList);
		writer.println("</accepted>");
	}
	
	/**
	 * Write misc.
	 *
	 * @param nList the n list
	 */
	private void writeMisc(NodeList nList)
	{
		writer.print("<published>");
		writer.print("<date-text>Published</date-text>");
		writeHistoryDate(nList);
		writer.println("</published>");
	}
	
	/**
	 * Write history date.
	 *
	 * @param nList the n list
	 */
	private void writeHistoryDate(NodeList nList)
	{
		writer.print("<date>");
		String day = "";
		String month = "";
		String year = "";
		for(int i=0;i<nList.getLength();++i)
		{
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("day"))
					day = eElement.getTextContent();
				else if (eElement.getTagName().equals("month"))
					month = eElement.getTextContent();
				else if (eElement.getTagName().equals("year"))
					year = eElement.getTextContent();
			}
		}
		writer.print("<day>");
		writer.print(day);
		writer.println("</day>");
		writer.print("<month>");
		writer.print(month);
		writer.println("</month>");
		writer.print("<year>");
		writer.print(year);
		writer.println("</year>");
		writer.println("</date>");
	}
	
	/**
	 * Write grant.
	 *
	 * @param doc the doc
	 */
	private void writeGrant(Document doc) {
		writer.print("<grant id=\"grant1\">");
		writeGrantData(doc);
		writer.println("</grant>");
	}
	
	/**
	 * Write grant data.
	 *
	 * @param doc the doc
	 */
	private void writeGrantData(Document doc)
	{
		NodeList nList = doc.getElementsByTagName("custom-meta");
		for(int i=0;i<nList.getLength();++i)
		{
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("custom-meta") 
					&& eElement.getAttribute("id").equals("financial-disclosure"))
					getGrant(eElement.getChildNodes());
			}
		}
	}
	
	/**
	 * Gets the grant.
	 *
	 * @param nList the n list
	 * @return the grant
	 */
	private void getGrant(NodeList nList)
	{
		for(int i=0;i<nList.getLength();++i)
		{
			Node node = nList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				if (eElement.getTagName().equals("meta-value"))
					writer.print(workoutString(eElement.getTextContent()));
			}
		}
	}
	
	/**
	 * Write abstract.
	 *
	 * @param doc the doc
	 */
	private void writeAbstract(Document doc) {
		writer.print("<abstract>");
		writer.print("<p id=\"para1\">");
		writeAbstractData(doc);
		writer.println("</p>");
		writer.println("</abstract>");
	}
	
	/**
	 * Write abstract data.
	 *
	 * @param doc the doc
	 */
	private void writeAbstractData(Document doc)
	{
		NodeList nList = doc.getElementsByTagName("abstract");
		for(int i=0;i<nList.getLength();++i)
		{
			Node node = nList.item(i);
			writer.print(workoutString(node.getTextContent()));
		}
	}
	
	
	/**
	 * Gets the authordata list.
	 *
	 * @return the authordata list
	 */
	private String getAuthordata() {
		InputStream in;
		String authors = "";
		try {
			in = new FileInputStream(new File(Translator.texFile));
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			String line = "";
			boolean beginOfDoc = false;
			while ((line = reader.readLine()) != null) {
				if (line.contains("$^{"))
						authors += line + "\n";
				if (line.contains("\\begin{abstract}")
						|| line.contains("\\section{Abstract}")
						|| line.contains("\\section*{Abstract}"))
					break;
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return authors;
	}

	/**
	 * Workout string.
	 *
	 * @param data the data
	 * @return the string
	 */
	protected static String workoutString(String data) {
		StringBuilder result = new StringBuilder();
		String input = "\\begin{document}\n" + data + "\n\\end{document}"; 
		ANTLRInputStream mainInput = new ANTLRInputStream(input);
		LaTEXLexer mainLexer = new LaTEXLexer(mainInput);
		CommonTokenStream mainTokens = new CommonTokenStream(mainLexer);
		LaTEXParser mainParser = new LaTEXParser(mainTokens);
		ParseTree mainTree = mainParser.compilationUnit();// parse

		ParseTreeWalker walker = new ParseTreeWalker(); // create standard

		return result.toString();
	}
	
	/**
	 * Gets the nodes value.
	 *
	 * @param nodeList the node list
	 * @return the nodes value
	 */
	private String getNodesValue(NodeList nodeList) {
		String value = "";
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			if (tempNode.getNodeType() == Node.ELEMENT_NODE)
				value += tempNode.getTextContent();
		}

		return value;
	}
}
