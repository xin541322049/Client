package vo;

import other.OrderStatus;

import java.util.ArrayList;
import java.util.Date;

public class OrderVO {
	
	private MemberVO memberVO;	//订单相关客户
	private HotelVO hotelVO;	//订单相关酒店
	
	private String orderID;	//订单编号
	private OrderStatus orderStatus;	//订单状态
	private Date createTime;	//订单创建时间
	private Date checkinTime; 	//预计入住时间
	private Date actualCheckinTime;	//实际入住时间
	private Date latestCheckinTime;	//最晚入住时间
	private Date checkoutTime;	//预计退房时间
	private Date actualCheckoutTime;	//实际退房时间
	private ArrayList<RoomVO> roomList;	//订单中房间类型及数量
	
	private int numberOfClient;	//预计入住人数
	private boolean hasKids;	//有无儿童
	private double score;	//订单评分
	private String evaluation;	//订单评价
	
	private PromotionVO promotion;	//使用的促销策略
	private double price;	//订单价值
	
	public OrderVO() {
		
	}
}
