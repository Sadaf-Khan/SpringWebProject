package com.dao;

import java.util.List;

import com.component.PaginationResult;
import com.model.CartInfo;
import com.model.OrderDetailInfo;
import com.model.OrderInfo;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
   
    public OrderInfo getOrderInfo(String orderId);
   
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}