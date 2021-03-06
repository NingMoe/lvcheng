package com.lvoutcity.model;

import java.math.BigDecimal;

import com.lvoutcity.core.util.Constants;
import com.lvoutcity.core.util.LvoutcityUtils;
import com.lvoutcity.model.base.BaseUserWallet;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class UserWallet extends BaseUserWallet<UserWallet> {
	public static final UserWallet dao = new UserWallet();
	
	public static UserWallet createWallet(String userId){
		UserWallet uw = new UserWallet();
		uw.setMoney(new BigDecimal(0));
		uw.setUserId(userId);
		uw.setId(LvoutcityUtils.getUUID());
		uw.save();
		return uw;
	}
	
	public static void createUserWallet(String userId){
		UserWallet uw = new UserWallet();
		uw.setMoney(new BigDecimal(0));
		uw.setUserId(userId);
		uw.setId(userId);
		boolean a =uw.save();
		System.out.println(a);
	}
	
	
	public String getCold(String userId){
	UserWallet uw = dao.findByUserId(userId);
	  if(uw==null){
		  return "";
	  }
	  return uw.getMoney().toString();
	}

	public UserWallet findByUserId(String userId){
		UserWallet uw = UserWallet.dao.findFirst("select * from t_user_wallet where user_id ='"+userId+"'");
		if(uw==null)
			uw = createWallet(userId);
		return uw;
	}
	


	public void doRealCharge(BigDecimal money, String userId,String orderId){
		if(Wallet.dao.findByOrderIdStatus(orderId,Constants.WALLET.STATUS_OUT)!=null)
			return;
		
		UserWallet uw = dao.findByUserId(userId);
		uw.deduct(money);
		uw.update();
		BigDecimal m = uw.getMoney();
		Wallet w = new Wallet();
		w.setMoney(money);
		w.setUserId(userId);
		w.setCreateUser(userId);
		w.setOrderId(orderId);
		w.setId(LvoutcityUtils.getUUID());
		w.setStatus(Constants.WALLET.STATUS_OUT);
		w.setSubject("消费抵扣");
		w.setBalance(uw.getMoney());
		w.save();
	}
	
	/**
	 * 从余额里扣除,并返回余额
	 * @param amount
	 */
	public BigDecimal deduct(BigDecimal amount){
		setMoney(getMoney().subtract(amount));
		return getMoney();
	}
	
	/**
	 * 增加余额,并返回余额
	 * @param amount
	 */
	public BigDecimal add(BigDecimal amount){
		setMoney(getMoney().add(amount));
		return getMoney();
	}
	
}
