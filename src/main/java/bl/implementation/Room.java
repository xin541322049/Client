package bl.implementation;

import bl.dataservice.RoomDataService;
import bl.service.RoomBLService;
import other.RoomType;
import po.RoomPO;
import vo.RoomVO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room implements RoomBLService {
	
	private ArrayList<RoomVO> roomVOList;
	private ArrayList<RoomPO> roomPOList;
	private RoomDataService roomDataService;
	private RoomVO room;

	public Room() {
		
	}
	
	@Override
	public ArrayList<RoomVO> getRoomList(String hotelID) {
		return null;
	}
	
	/**
	 * 根据房间号查找房间
	 * @return RoomVO
	 * @author 张新悦
	 * @version 2016-11-13 16:17
	 */
	@Override
	public RoomVO getRoomInformation(String num){
		if(room.getNumber().equals(num)) return room;
		RoomPO temp = roomDataService.getRoomInformation(num);
		//room = new RoomVO(temp.getValid(), temp.getNumber(), temp.getRoomType(), temp.getPrice());
		return room;
	}

	/**
	 * 更新房间信息
	 * @author 张新悦
	 * @version 2016-11-13 17:23
	 */
	@Override
	public boolean updateRoom(String roomID, RoomVO room) {
		// TODO Auto-generated method stub
		this.room=room;
		//RoomPO temp = new RoomPO(room.isAvailable(), room.getNumber(), room.getType(), room.getPrice());
		//new RoomPO(room.isAvailable(), room.getNumber(), room.getType(), room.getPrice());
		//roomDataService.updateRoom(temp);
		return true;
	}

	@Override
	public boolean deleteRoom(String roomNUM) {
		return false;
	}

	/**
	 * 增加房间
	 * @author 张新悦
	 * @version 2016-11-13 17:33
	 */
	@Override
	public boolean addRoom(RoomVO room) {
		// TODO Auto-generated method stub
		this.room=room;
		//RoomPO temp = new RoomPO(room.isAvailable(), room.getNumber(), room.getType(), room.getPrice());
		//new RoomPO(room.isAvailable(), room.getNumber(), room.getType(), room.getPrice());
		//roomDataService.addRoom(temp);
		return true;
	}
	
}
