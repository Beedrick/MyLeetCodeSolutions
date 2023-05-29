/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EasyLeetProblems;

/**
 *
 * @author Gorilla Rig
 */
public class ParkingSystem {

    private int bigSpaces;
    private int mediumSpaces;
    private int smallSpaces;

    public ParkingSystem(int bigSpaces, int mediumSpaces, int smallSpaces) {

        this.bigSpaces = bigSpaces;
        this.mediumSpaces = mediumSpaces;
        this.smallSpaces = smallSpaces;

    }

    public boolean addCar(int carType) {

        if (carType == 1) {
            if (this.bigSpaces != 0) {
                --this.bigSpaces;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (this.mediumSpaces != 0) {
                --this.mediumSpaces;
                return true;
            } else {
                return false;
            }
        } else if (carType == 3) {
            if (this.smallSpaces != 0) {
                --this.smallSpaces;
                return true;
            } else {
                return false;
            }
        }
        
        return false;

    }

}
