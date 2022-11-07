import directory1.*;
import thesislib.Diagram;
public class Main {
    
    public static void main(String[] args) {
    Diagram d = new Diagram("Diagram", "diagram.plantuml", ClassE.class);
    d.printDiagram();
    }
}
