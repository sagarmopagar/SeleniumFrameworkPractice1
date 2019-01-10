package TestNG.LE;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OutboundDeliveries {

	@Test(groups="someDummy")
	@Parameters({"message","wishes"})
	@AfterGroups(groups="Logistics")
	public void someFITestsThatDependonGroupLogistics(String message, String wishes)
	{
		System.out.println(message+"--"+wishes);
		System.out.println("Some Tests that must be run after all Logistics Group test cases are run");
	}
	
	@Test(groups="Logistics")
	public void createDelivery() {
		System.out.println("Outbound Delivery Creaed!!");
	}
	
	@Test(groups="Logistics",dependsOnMethods="createDelivery")
	public void changeDelivery() {
		System.out.println("Outbound Delivery Changed!!");
	}
	
	@Test(groups="Logistics",dependsOnMethods="createDelivery")
	public void displayDelivery() {
		System.out.println("Outbound Delivery displayed!!");
	}
	
	@Test(groups="Logistics",dependsOnMethods="changeDelivery")
	public void postGoodsIssueDelivery() {
		System.out.println("Outbound Delivery PGIed!!");
//		System.out.println(0/0);
	}
	
	@Test(groups="Logistics",dependsOnMethods="postGoodsIssueDelivery",alwaysRun=false)
	public void billForDelivery() {
		System.out.println("Outbound Delivery Billed!!");
	}
	
	@Test(dataProvider="getData",groups="dataProvider")
	public void methodUsingDataFromProvider(String v1, String v2) {
		System.out.println(v1+"-"+v2);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] Data = new Object[3][2];
		Data[0][0] = "first_1";
		Data[0][1] = "first_2";
		
		Data[1][0] = "second_1";
		Data[1][1] = "second_2";
		
		Data[2][0] = "second_1";
		Data[2][1] = "second_2";
		return Data;
	}
	
	
	
}
