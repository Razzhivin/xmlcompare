

import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Test;

import java.util.ArrayList;


public class SomeTest extends XMLTestCase {
    @Test
    public void test() throws Exception {
        String xml1 = "<abc        attr=\"value1\" attr1=\"value2\" title=\"something\">       <div> <zz>  123 </zz> </div> </abc>";
        String xml2 = "<abc attr1=\"value2\" attr=\"value1\" title=\"something\"> <div>  <zz>123</zz> </div> </abc>";

        //TestXml.assertXMLEquals(xml1, xml2);  // assertXMLEquals comes from XMLTestCase
        XmlDiff xmlDiff = new XmlDiff();
        ArrayList<String> listDiffs = new ArrayList();
        xmlDiff.diff(xml1, xml2, listDiffs);
        assertTrue(listDiffs.size() == 0);
    }

}