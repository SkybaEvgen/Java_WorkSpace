import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadFileXML {
    public static void main(String[] args) throws Exception {
        File fileXML = new File("file.xml");                            // Создание нового объекта
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();  // Document из файла XML.
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();                // Все последующие операции
        Document doc = dBuilder.parse(fileXML);                                   // выполняются для объекта Document

        getRootElement(doc);

        getAllPersons(doc);

        parseWholeXML(doc);

        getPersonByName(doc, "name", "Maria");

    }

    /* Получение корневого элемента из файла*/
    public static void getRootElement(Document doc){
            System.out.println(doc.getDocumentElement().getNodeName());           // Получение элемента из файла XML
    }

    /* Получение всех элементов c определенным именем тега из файла XML */
    public static void getAllPersons(Document doc){
            NodeList personNodes = doc.getElementsByTagName("persons");             // получаем все узлы с определенным именем тега (в нашем случае с persons)
            for (int i = 1; i < personNodes.getLength() ; i++) {
                Node personNode = personNodes.item(i);
                if(personNode.getNodeType() == Node.ELEMENT_NODE){
                    Element personElement = (Element) personNode;
                    String personName = personElement.getElementsByTagName("name").item(0).getTextContent();
                    String personGender = personElement.getElementsByTagName("gender").item(0).getTextContent();
                    String personStreet = personElement.getElementsByTagName("street").item(0).getTextContent();
                    String personHouseNumber = personElement.getElementsByTagName("house_number").item(0).getTextContent();

                    System.out.println("Name: " + personName);
                    System.out.println("Gender: " + personGender);
                    System.out.println("Street: " + personStreet + ", " + personHouseNumber);
                    System.out.println("----------------------------");
                }
            }
    }

    /* Получение всех имеющихся элементов */
    public static void parseWholeXML(Node startingNode){
        NodeList childNodes = startingNode.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if(childNode.getNodeType() == Node.ELEMENT_NODE){
                parseWholeXML(childNode);
            }else {
                if(!childNode.getTextContent().trim().isEmpty()){       // trim() - для игнорирования строк и пробелов
                    System.out.println(childNode.getTextContent());
                }
            }

        }
    }

    /* Получить элемент по значению */
    public static void getPersonByName(Document doc, String textNodeName, String textNodeValue){
        NodeList personNodes = doc.getElementsByTagName("persons");
        for(int i=1; i<personNodes.getLength(); i++)
        {
            Node personNode = personNodes.item(i);
            if(personNode.getNodeType() == Node.ELEMENT_NODE)
            {
                Element personElement = (Element) personNode;
                NodeList textNodes = personElement.getElementsByTagName(textNodeName);
                if(textNodes.getLength() > 0)
                {
                    if(textNodes.item(0).getTextContent().equalsIgnoreCase(textNodeValue))
                    {
                        System.out.println(textNodes.item(0).getTextContent());
                        System.out.println(personElement.getElementsByTagName("street").item(0).getTextContent() + ", " +
                                personElement.getElementsByTagName("house_number").item(0).getTextContent());
                    }
                }
            }
        }
    }
}
