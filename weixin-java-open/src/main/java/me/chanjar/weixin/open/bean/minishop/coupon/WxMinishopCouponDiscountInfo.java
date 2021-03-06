package me.chanjar.weixin.open.bean.minishop.coupon;

import com.google.gson.JsonObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("小商店商品折扣券信息")
public class WxMinishopCouponDiscountInfo {

  @ApiModelProperty(value = "小商店商品折扣详情")
  private WxMinishopCouponDiscountCondition discountCondition;

  @ApiModelProperty(value = "满减金额", required = true)
  private Integer discountFee;

  @ApiModelProperty(value = "打折商品数量，满减券需填写")
  private Integer discountNum;

  public JsonObject toJsonObject() {
    JsonObject jsonObject = new JsonObject();
    jsonObject.add("discount_condition", discountCondition.toJsonObject());
    jsonObject.addProperty("discount_fee", discountFee);
    jsonObject.addProperty("discount_num", discountNum);
    return jsonObject;
  }
}
