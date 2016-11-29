package po;

import java.util.ArrayList;

public class HotelPO {

	
	private String hotelID;
	private String name;
	private String address;
	private String level;
	private String district;
	private ArrayList<RoomPO> roomList;
	
	public HotelPO(String hotelID, String name, String address, String level, String district){
		this.setHotelID(hotelID);
		this.setName(name);
		this.setAddress(address);
		this.setLevel(level);
		this.setDistrict(district);
	}
	
	public String getHotelID() {
		return hotelID;
	}
	
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public ArrayList<RoomPO> getRoomList() {
		return roomList;
	}
	
	public void setRoomList(ArrayList<RoomPO> roomList) {
		this.roomList = roomList;
	}
}