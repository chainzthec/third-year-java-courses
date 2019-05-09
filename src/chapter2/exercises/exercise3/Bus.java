package chapter2.exercises.exercise3;

import java.util.ArrayList;

public class Bus {
    private int lineNumber;
    private String stationStart;
    private String stationEnd;
    private ArrayList<String> stopNames;
    private int maxCapacity;
    private int travellersNumber;
    private boolean normalOrientation;
    private int numberOfStops;
    private int currentStop;

    public Bus(int lineNumber, String stationStart, String stationEnd, int maxCapacity, boolean normalOrientation, ArrayList<String> stopNames){
        this.lineNumber = lineNumber;
        this.stationStart = stationStart;
        this.stationEnd = stationEnd;
        this.maxCapacity = maxCapacity;
        this.travellersNumber = 0;
        this.normalOrientation = normalOrientation;
        this.stopNames = stopNames;
        this.numberOfStops = this.stopNames.size();
    }

    public void addTravellers(int number){
        if(travellersNumber < maxCapacity)
            travellersNumber += number;
        else
            System.out.println("Impossible to add a new traveller to the bus");
    }
    public void removeTravellers(int number){
        if(travellersNumber > 0)
            travellersNumber--;
        else
            System.out.println("The number of travellers is 0 !");
    }

    public void travel(){
        if(numberOfStops != currentStop)
            currentStop++;
        else
            System.out.println("You have already arrived at the destination");
    }

    public int getCurrentStop() {
        return this.currentStop;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getStationStart() {
        return stationStart;
    }

    public String getStationEnd() {
        return stationEnd;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getTravellersNumber() {
        return travellersNumber;
    }

    public boolean isNormalOrientation() {
        return normalOrientation;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- ").append(this.lineNumber).append(" ----").append("\n");
        if(this.normalOrientation){
            sb.append("Starting station : ").append(this.stationStart).append("\n");
            sb.append("Ending station : ").append(this.stationEnd).append("\n");
        }else{
            sb.append("Starting station : ").append(this.stationEnd).append("\n");
            sb.append("Ending station : ").append(this.stationStart).append("\n");
        }
        //sb.append("Number of the current station : ").append(this.currentStop).append("\n");
        sb.append("Current station name :").append(this.stopNames.get(this.currentStop)).append("\n");
        sb.append("Current number of passengers : ").append(this.travellersNumber).append("\n");
        sb.append("Max capacity : ").append(this.maxCapacity).append("\n");
        sb.append("Number of stops : ").append(this.numberOfStops).append("\n");
        sb.append("------------------");
        return sb.toString();
    }

    public ArrayList<String> getStopNames() {
        return stopNames;
    }
}
