package bl.implementation;

import java.util.ArrayList;

import bl.dataservice.SearchDataService;
import bl.service.SearchBLService;
import other.*;
import other.RoomType;
import vo.*;

/**
 * Search功能的实现类
 * @author CROFF
 * @version 2016-11-27
 */
public class Search implements SearchBLService {
	
	private ArrayList<HotelVO> allHotelList;	//所有酒店的列表，暂时使用ArrayList存储
	private ArrayList<HotelVO> searchHotelList;	//搜索出来的酒店列表，暂时使用ArrayList存储
	private ArrayList<HotelVO> reservedHotelList;	//预定过的酒店列表，暂时使用ArrayList存储
	private SearchInfomation searchInfomation;	//搜索限制条件
	private SortStratedy sortStratedy;	// 排序条件
	private MemberVO memberVO;	//持有的客户信息
	private SearchDataService searchDataService;
	
	public Search(MemberVO memberVO) {
		allHotelList = null;
		searchInfomation = new SearchInfomation();
		this.memberVO = memberVO;
	}

	@Override
	public void setAddress(String address) {
		searchInfomation.setAddress(address);
	}
	
	@Override
	public void setDistrict(String district) {
		searchInfomation.setDistrict(district);
	}
	
	@Override
	public void setHotelName(String hotelName) {
		searchInfomation.setHotelName(hotelName);
	}
	
	@Override
	public void setLevel(int level) {
		searchInfomation.setLevel(level);
	}
	
	@Override
	public void setScore(double score) {
		searchInfomation.setScore(score);
	}
	
	@Override
	public void setRoomType(RoomType roomType) {
		searchInfomation.setRoomType(roomType);
	}
	
	@Override
	public void setLowerPrice(double lowerPrice) {
		searchInfomation.setLowerPrice(lowerPrice);
	}
	
	@Override
	public void setUpperPrice(double upperPrice) {
		searchInfomation.setUpperPrice(upperPrice);
	}
	
	@Override
	public void setCheckinTime(Date checkinTime) {
		searchInfomation.setCheckinTime(checkinTime);
	}
	
	@Override
	public void setCheckoutTime(Date checkoutTime) {
		searchInfomation.setCheckoutTime(checkoutTime);
	}
	
	@Override
	public void setOnlyReservationBefore(boolean onlyReservationBefore) {
		searchInfomation.setOnlyReservationBefore(onlyReservationBefore);
	}
	
	@Override
	public ArrayList<HotelVO> search() {
//		String address = searchInfomation.getAddress();
//		String district = searchInfomation.getDistrict();
//		ArrayList<HotelVO> resultList = new ArrayList<HotelVO>();
//
//		if(address==null && district==null) {
//			return null;
//		} else if(address==null) {
//			for(int i = 0; i< allHotelList.size(); i++) {
//				if(district.equals(allHotelList.get(i).getDistrict())) {
//					resultList.add(allHotelList.get(i));
//				}
//			}
//			return resultList;
//		} else {
//			for(int i = 0; i< allHotelList.size(); i++) {
//				if(address.equals(allHotelList.get(i).getAddress())) {
//					resultList.add(allHotelList.get(i));
//				}
//			}
//			return resultList;
//		}
		return null;
	}
	
	@Override
	public ArrayList<RoomVO> getRoomList(String hotelID) {
//		for(int i = 0; i< allHotelList.size(); i++) {
//			if(allHotelList.get(i).getHotelID().equals(hotelID)) {
//				return allHotelList.get(i).getRoomList();
//			}
//		}
		return null;
	}
	
	@Override
	public void setSelectedHotel(HotelVO hotelVO) {
		
	}
	
	@Override
	public void setSelectedRoom(RoomVO roomVO) {
		
	}
	
	@Override
	public ArrayList<HotelVO> sortByPriceHighToLow() {
		return null;
	}
	
	@Override
	public ArrayList<HotelVO> sortByPriceLowToHigh() {
		return null;
	}
	
	@Override
	public ArrayList<HotelVO> sortByScoreHighToLow() {
		return null;
	}
	
	@Override
	public ArrayList<HotelVO> sortByScoreLowToHigh() {
		return null;
	}
	
	@Override
	public ArrayList<HotelVO> sortByLevelHighToLow() {
		return null;
	}
	
	@Override
	public ArrayList<HotelVO> sortByLevelLowToHigh() {
		return null;
	}
	
	public void setAllHotelList(ArrayList<HotelVO> allHotelList) {
		this.allHotelList = allHotelList;
	}

	public String getAddress() {
		return searchInfomation.getAddress();
	}

	public String getDistrict() {
		return searchInfomation.getDistrict();
	}
	
	public MemberVO getMemberVO() {
		return memberVO;
	}
	
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	
	public SortStratedy getSortStratedy() {
		return sortStratedy;
	}
	
	public void setSortStratedy(SortStratedy sortStratedy) {
		this.sortStratedy = sortStratedy;
	}
}
