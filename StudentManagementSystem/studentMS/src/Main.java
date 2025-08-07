
import com.studentMS.controller.StudentController;
import com.studentMS.model.StudentDatabase;

import View.StudentView;

	public class Main {
	    public static void main(String[] args) {
	        var model = new StudentDatabase();
	        var view = new StudentView();
	        var controller = new StudentController(model, view);
	        controller.start();
	    }
	}


