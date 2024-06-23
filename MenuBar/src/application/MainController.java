/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController.java
 *   Project:  JavaFX Application Controller
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * The MainController class implements the Initializable interface and handles
 * the UI events for the JavaFX application. It includes methods to open new
 * views and close the application.
 */
public class MainController implements Initializable {

	/**
	 * Initializes the controller class. This method is automatically called after
	 * the FXML file has been loaded.
	 * 
	 * @param location  the location used to resolve relative paths for the root
	 *                  object, or null if the location is not known.
	 * @param resources the resources used to localize the root object, or null if
	 *                  the root object was not localized.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}

	/**
	 * Handles the action of opening a new view. This method will be connected to an
	 * event in the FXML file.
	 * 
	 * @param event the event that triggered this method.
	 */
	public void Opens(ActionEvent event) {
		// Code to open a new view goes here
	}

	/**
	 * Handles the action of closing the application. This method will be connected
	 * to an event in the FXML file.
	 * 
	 * @param event the event that triggered this method.
	 */
	public void CloseApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}
}
