package stepDefinations;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test {
	
	public int valueFinder(String value, String valueToSearch){
		
		value = value.replace("[", "");
		value = value.replace("]", "");
		value = value.replace(" ", "");
		List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		
		return list.indexOf(valueToSearch);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		 RestAssured.baseURI = "https://slack.com";
//		 RequestSpecification request = RestAssured.given();
//		 Response response = request.post("/api/auth.test?token=xoxp-1054713556071-1082072627489-1069512983842-ca8129e791c3f3904b2d6612f49253ed&pretty=1");
//		
//		FileReader json = new FileReader("src/main/java/resources/test.json");
//		JSONObject rawSchema = new JSONObject(json);
//		Schema schema = SchemaLoader.load(rawSchema);
//		try {
//			schema.validate(response.getBody());
//			System.out.println("nice");
//		} catch (ValidationException exception) {
//			assertEquals(true, false,
//					"Schema Validation Failed while checking is the Response schema is same or Not");
//		}

//		String a = "[general, mychanneltest, mychanneltestnice, newchanneltest11rename, newchanneltest12, newchanneltest13, newchanneltest14rename, newchanneltest15rename, newchanneltest16, newchanneltest17, newchanneltest18rename, newchanneltest19rename, newchanneltest1rename, newchanneltest2, newchanneltest20rename, newchanneltest21, newchanneltest22rename, newchanneltest23, newchanneltest23rename, newchanneltest24rename, newchanneltest25, newchanneltest25rename, newchanneltest26rename, newchanneltest27rename, newchanneltest28rename, newchanneltest29rename, newchanneltest30rename, newchanneltest31rename, newchanneltest32rename, newchanneltest33rename, newchanneltest34rename, newchanneltest35rename, newchanneltest36rename, newchanneltest38rename, newchanneltest39rename, newchanneltest40rename, random, self-development]";
//		a = a.replace("[", "");
//		a = a.replace("]", "");
//		a = a.replace(" ", "");
//		 List<String> list = new ArrayList<String>(Arrays.asList(a.split(",")));
//		 System.out.println(list);
//		System.out.println(list.indexOf("newchanneltest40rename"));
//		System.out.println(list.contains("newChannelTest40Rename"));
//		 
//		
		
//		 for(String n1 : list)
//			 {
//			 System.out.print(n1);
//			 }
//		
		FileReader json = null;
		try{
//			json = new FileReader("src/main/java/resources/testJson.json");
			JSONObject jsonObj = new JSONObject("{id=C012GLKEKCZ, name=nice9rename, is_channel=true, created=1587310734, is_archived=false, is_general=false, unlinked=0, creator=U012E24JFED, name_normalized=nice9rename, is_shared=false, is_org_shared=false, is_member=true, is_private=false, is_mpim=false, members=['U012E24JFED'], topic={value=, creator=, last_set=0}, purpose={value=, creator=, last_set=0}, previous_names=['nice9'], num_members=1}");
			System.out.println(jsonObj.toString());
			String pageName =  JsonPath.read(jsonObj, "$.id");
			System.out.println(pageName);
//			System.out.println(jsonObj.getString("id"));
//			System.out.println(jsonObj.getString("name"));
//			System.out.println(jsonObj.getString("creator"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
