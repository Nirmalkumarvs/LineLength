package Controller;

import Model.Line;

public class LineController {
    public double getLength(Line lineObject){
        int xCoOrdinateOfStartingPointOfLine=lineObject.getxCoOrdinateOfStartingPointOfLine();
        int yCoOrdinateOfStartingPointOfLine=lineObject.getyCoOrdinateOfStartingPointOfLine();
        int xCoOrdinateOfEndingPointOfLine=lineObject.getxCoOrdinateOfEndingPointOfLine();
        int yCoOrdinateOfEndingPointOfLine=lineObject.getyCoOrdinateOfEndingPointOfLine();
        return Math.sqrt(((xCoOrdinateOfStartingPointOfLine-xCoOrdinateOfEndingPointOfLine)*(xCoOrdinateOfStartingPointOfLine-xCoOrdinateOfEndingPointOfLine))+((yCoOrdinateOfStartingPointOfLine-yCoOrdinateOfEndingPointOfLine)*(yCoOrdinateOfStartingPointOfLine-yCoOrdinateOfEndingPointOfLine)));
    }
}
