package bl.service;

import java.util.ArrayList;

import vo.PromotionVO;

/**
 * Promotion模块bl层和ui层之间的接口
 * @author CROFF
 * @version 2016-11-30
 */
public interface PromotionBLService {
	
	public PromotionVO getPromotion(String promotionID);	//获得营销策略信息
	public boolean addPromotion(PromotionVO promotionVO);	//添加营销策略
	public boolean deletePromotion(String promotionID);	//删除营销策略
	public boolean updatePromotion(PromotionVO promotionVO);	//更新营销策略信息
	public ArrayList<PromotionVO> getHotelPromotionList(String hotelID);	//获得酒店营销策略列表
	public ArrayList<PromotionVO> getWebPromotionList();	//获得网站营销策略列表
	public ArrayList<PromotionVO> getDistrictPromotionList();	//获得商圈营销策略列表
	public ArrayList<PromotionVO> getHotelDatePromotionList();	//获得酒店的特定日期营销策略列表
	public ArrayList<PromotionVO> getWebDatePromotionList();	//获得网站的特定日期营销策略列表
	public ArrayList<PromotionVO> getEnterprisePromotionList();	//获得合作企业促销列表
	
	public ArrayList<PromotionVO> getAvailablePromotionList(String memberID, String hotelID, int numberOfRoom);	//根据条件获取可用促销策略列表
}
