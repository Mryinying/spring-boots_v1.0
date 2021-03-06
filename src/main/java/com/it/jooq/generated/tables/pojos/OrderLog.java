/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;


/**
 * 订单状态变化表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderLog implements Serializable {

    private static final long serialVersionUID = -1396108482;

    private Integer id;
    private Integer orderId;
    private Integer status;
    private Date    changeTime;

    public OrderLog() {}

    public OrderLog(OrderLog value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.status = value.status;
        this.changeTime = value.changeTime;
    }

    public OrderLog(
        Integer id,
        Integer orderId,
        Integer status,
        Date    changeTime
    ) {
        this.id = id;
        this.orderId = orderId;
        this.status = status;
        this.changeTime = changeTime;
    }

    public Integer getId() {
        return this.id;
    }

    public OrderLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public OrderLog setOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public OrderLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getChangeTime() {
        return this.changeTime;
    }

    public OrderLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OrderLog other = (OrderLog) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!orderId.equals(other.orderId))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (changeTime == null) {
            if (other.changeTime != null)
                return false;
        }
        else if (!changeTime.equals(other.changeTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((changeTime == null) ? 0 : changeTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderLog (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(status);
        sb.append(", ").append(changeTime);

        sb.append(")");
        return sb.toString();
    }
}
