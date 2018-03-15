/**
 * Created by Aaron on 3/9/2018.
 */
public class Driver {
    //Set up the MVC structure and start the controller
    public static void main(String[] args) {
        //Size of window
        int width = 1000;
        int height = 1000;
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m, v);
        v.setController(c);
        v.setModel(m);
        c.init(width, height);
    }
}