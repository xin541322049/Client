package bl.stub;

import java.util.ArrayList;

import bl.service.PromotionBLService;
import other.PromotionType;
import vo.PromotionVO;


public class PromotionBLStub implements PromotionBLService {
	
	private PromotionVO promotionVO;
	
	public PromotionBLStub() {
		String promotionID = "00000";
		String promotionName = "";
		PromotionType promotionType = PromotionType.Discount;
		promotionVO = new PromotionVO(promotionID, promotionName, promotionType);
		promotionVO.setRankPromotion();
	}
	
	@Override
	public PromotionVO getPromotion(String promotionID) {
		System.out.println("获取促销策略成功");
		return promotionVO;
	}
	
	@Override
	public boolean addPromotion(PromotionVO promotion) {
		System.out.println("添加促销策略成功");
		return true;
	}
	
	@Override
	public boolean deletePromotion(String promotionID) {
		System.out.println("删除促销策略成功");
		return true;
	}
	
	@Override
	public boolean updatePromotion(String promotionID, PromotionVO promotion) {
		System.out.println("更新促销策略成功");
		return true;
	}
	
	@Override
	public ArrayList<PromotionVO> getHotelPromotionList(String hotelID) {
		System.out.println("获取酒店促销策略列表成功");
		ArrayList<PromotionVO> promotionList = new ArrayList<PromotionVO>();
		promotionList.add(promotionVO);
		return promotionList;
	}
	
	@Override
	public ArrayList<PromotionVO> getWebPromotionList() {
		System.out.println("获取网站促销策略列表成功");
		ArrayList<PromotionVO> promotionList = new ArrayList<PromotionVO>();
		promotionList.add(promotionVO);
		return promotionList;
	}
}
