package agemanager;

import agemanager.database.connector.DatabaseConnector;
import agemanager.ui.HomeScreen;

public class StartingPoint extends HomeScreen {

	public static void main(String[] args) {
		DatabaseConnector.connectingWithSQLDatabaseUsingJDBC();
		HomeScreen.main(args);

	}

}
