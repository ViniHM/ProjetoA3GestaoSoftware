package com.atividadeA3.sd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadeA3.sd.entities.OrderItem;
import com.atividadeA3.sd.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}