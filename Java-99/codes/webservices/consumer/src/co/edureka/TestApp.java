package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class TestApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums numsRef = locator.getNums();
		
		System.out.println("sum = " + numsRef.add(12,23));
		System.out.println("diff = " + numsRef.sub(12.3f,23.5f));
	}

}
