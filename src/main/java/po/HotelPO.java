package po;

import other.District;
import other.Enterprise;
import other.HotelService;
import other.User;

import java.util.ArrayList;

public class HotelPO extends User {
	
	private String name;
	private String address;
	private int level;
	private District district;
	private double score;	//酒店评分
	private HotelService hotelService;	//酒店设施服务
	private String introduction;	//酒店简介
	private String managerID;	//酒店管理人员的ID
	
	private ArrayList<RoomPO> roomList;
	private ArrayList<Enterprise> enterpriseArrayList;	//合作企业列表
	private ArrayList<OrderPO> orderList;
	
	public HotelPO() {
		
	}
}