/*
 * $Id: Test.java,v 1.1 2006/04/15 14:40:06 platform Exp $
 * Created on 2006-4-15
 */
package org.json.simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.parser.Yytoken;
import org.junit.Test;

public class TestJson {

    @Test
    public void testDecode() throws Exception {
        System.out.println("=======decode=======");

        String s = "[0,10]";
        Object obj = JSONValue.parse(s);
        JSONArray array = (JSONArray) obj;
        System.out.println("======the 2nd element of array======");
        System.out.println(array.get(1));
        System.out.println();
        assertEquals("10", array.get(1).toString());
    }

    @Test
    public void testJSONArrayCollection() {
        final ArrayList<String> testList = new ArrayList<String>();
        testList.add("First item");
        testList.add("Second item");
        final JSONArray jsonArray = new JSONArray(testList);

        assertEquals("[\"First item\",\"Second item\"]", jsonArray.toJSONString());
    }

	@Test
	public void testShortArrayToJsonString() {
		short[] testArray = {20, 12, 9, 213};
		String stringArray = JSONArray.toJSONString(testArray);
		assertEquals("[20,12,9,213]", stringArray);
	}

    @Test
    public void testStringToMmap() {
        String s = "{\"x\": 3, \"y\": 5}";
        Object obj = JSONValue.parse(s);
        Map map = (Map) obj;
        assertEquals(3L, map.get("x"));
    }

    @Test
    public void testMapToString() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 12);
        map.put("c", 17);
        final JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject.toJSONString());
        assertEquals("{\"a\":10,\"b\":12,\"c\":17}", jsonObject.toJSONString());
    }

    @Test
    public void testParseException() {
        String s = "[0,10";
        Object obj = JSONValue.parse(s);
        assertNull(obj);
    }

    @Test
    public void testYytokenToString() {
        Yytoken testYytoken = new Yytoken(Yytoken.TYPE_VALUE, 1.27D);
        String str = testYytoken.toString();
        assertEquals("VALUE(1.27)", str);
    }
}
