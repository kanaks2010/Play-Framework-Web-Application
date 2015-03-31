package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready.You can change your app within a minute"));
    }

    
    public static Result pprofile() {
        return ok(patientprofile2.render("Your new application is ready.You can change your app within a minute"));
    }
    
    public static Result dprofile() {
        return ok(doctorprofile2.render("Your new application is ready.You can change your app within a minute"));
    }
    public static Result main() {
        return ok(index.render("Your new application is ready.You can change your app within a minute"));
    }
}
