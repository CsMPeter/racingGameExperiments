package racingGameExperiments;


//inheritance is-a relationship
public class Car extends racingGameExperiments.AutoVehicle {
    int doorCount;
    String seatCover;//leather or cloth
    String lightType;//LED, HID, Halogen

    public Car(Engine engine) {
        super(engine);
    }
    //has-a relationship

}