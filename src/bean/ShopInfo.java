package bean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding()
public class ShopInfo {
	@WebMethod
	@WebResult(name="lookupOutput")
	public String getShopInfo(@WebParam(name="lookupInput") String property) {
		String response = "Invalid property";
		if ("ShopName".equals(property)) {
			response = "TestMart";
		} else if ("since".equals(property)) {
			response = "since 2012";
		}
		return response;
	}
}
