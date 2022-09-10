/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPproject;

/**
 *
 * @author Dell4
 */
public class RoomDataPOJO {
    private int id;
    private String roomType;
    private int totalRooms;
    private int availRooms;

    public RoomDataPOJO(int id, String roomType, int totalRooms, int availRooms) {
        this.id = id;
        this.roomType = roomType;
        this.totalRooms = totalRooms;
        this.availRooms = availRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getAvailRooms() {
        return availRooms;
    }

    public void setAvailRooms(int availRooms) {
        this.availRooms = availRooms;
    }
    
    
    
}
