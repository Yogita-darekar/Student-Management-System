
import com.yogitaDarekar.studentManagement.controller.StudentController;
import com.yogitaDarekar.studentManagement.model.StudentDatabase;
import com.yogitaDarekar.studentManagement.view.StudentView;
public class Main {

	public class Main {
	    public static void main(String[] args) {
	        var model = new StudentDatabase();  // Model
	        var view = new StudentView();       // View
	        var controller = new StudentController(model, view);  // Controller

	        controller.start(); // Start the app
	    }
	}

}
