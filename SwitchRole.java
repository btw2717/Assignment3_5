import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

/**
 * The SwithRole class prompts a user to select a user role from a dropdown box in a javafx Choice Dialog.
 * This class extends Application to inherit the javafx capabilities.
 *
 * @author Sapper
 * @version 16OCT2017
 * email: email
 */

public class SwitchRole extends Application {

	/**
	 * The main() method is not used but is present as a backup to launch the application.
	 * @param args command line arguments
	 */

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * The start() method is the entry point of the application.  
	 * This method initializes a Stage object, an ArrayList object, and a Choice Dialog object.
	 * The user is prompted to choose a user level and then an alert box 
	 * displays a welcome message which includes the chosen role.
	 *
	 * @param primaryStage the stage object which displays the created objects
	 */

	@Override
	public void start(Stage primaryStage) {
		//instantiate ArrayList object
		List<String> choices = new ArrayList<>();
		//add selections to ArrayList object
		choices.add("Administrator");
		choices.add("Faculty");
		choices.add("Staff");
		choices.add("Student");
		choices.add("Guest");

		//instantiate a ChoiceDialog and populate it with the ListArray object
		ChoiceDialog<String> dialog = new ChoiceDialog<>("Administrator", choices);
		dialog.setTitle("Choice Dialog");
		dialog.setHeaderText("User level selection");
		dialog.setContentText("Please identify your user level:");
		
		Optional<String> result = dialog.showAndWait();
		
			//creating a switch statement for control of flow 
			switch(result.get()) {
				case "Administrator":
   	           	        	Alert case1 = new Alert(Alert.AlertType.INFORMATION);
					case1.setContentText("Welcome Administrator!");
					case1.showAndWait();
					break;
				case "Faculty":
					Alert case2 = new Alert(Alert.AlertType.INFORMATION, "Welcome Faculty!");
					case2.showAndWait();
					break;
				case "Staff":
					Alert case3 = new Alert(Alert.AlertType.INFORMATION, "Welcome Staff!");
					case3.showAndWait();
					break;
				case "Student":
					Alert case4 = new Alert(Alert.AlertType.INFORMATION, "Welcome Student!");
					case4.showAndWait();
					break;
				default:
					Alert case5 = new Alert(Alert.AlertType.INFORMATION, "Welcome Guest!");
					case5.showAndWait();
					break;
			}    
	}
}
