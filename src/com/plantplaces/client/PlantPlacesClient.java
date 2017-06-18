package com.plantplaces.client;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import com.plantplaces.ui.PlantWSService;
import com.plantplaces.ui.PlantWSServiceServiceLocator;

public class PlantPlacesClient {
	
	public static void main(String[] args) {
		PlantWSServiceServiceLocator locator = new PlantWSServiceServiceLocator();
		try {
			PlantWSService service = locator.getPlantWSService();
			String plant = JOptionPane.showInputDialog("enter plant name");
			String string = service.fetchPlants(plant);
			JOptionPane.showMessageDialog(null, "plant name: "+string);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "inable to reach service"+e.getMessage());
		}
	}

}
