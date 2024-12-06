public class App {
    public static void main(String[] args) {
        Model m=new Model("Sugira",
              "Herve");
        View v=new View("My First MVC Swing Application");
        Controller c=new Controller(m,v);
        c.initController();
    }
}
