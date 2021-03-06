/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables.records;


import com.it.jooq.generated.tables.OrderLog;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OrderLogRecord extends UpdatableRecordImpl<OrderLogRecord> implements Record4<Integer, Integer, Integer, Date> {

    private static final long serialVersionUID = -1191688338;

    /**
     * Setter for <code>study.order_log.id</code>.
     */
    public OrderLogRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.order_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>study.order_log.order_id</code>.
     */
    public OrderLogRecord setOrderId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.order_log.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>study.order_log.status</code>.
     */
    public OrderLogRecord setStatus(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.order_log.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>study.order_log.change_time</code>. 变化时间
     */
    public OrderLogRecord setChangeTime(Date value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.order_log.change_time</code>. 变化时间
     */
    public Date getChangeTime() {
        return (Date) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Date> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Date> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OrderLog.ORDER_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OrderLog.ORDER_LOG.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OrderLog.ORDER_LOG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return OrderLog.ORDER_LOG.CHANGE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getChangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLogRecord value2(Integer value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLogRecord value3(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLogRecord value4(Date value) {
        setChangeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderLogRecord values(Integer value1, Integer value2, Integer value3, Date value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderLogRecord
     */
    public OrderLogRecord() {
        super(OrderLog.ORDER_LOG);
    }

    /**
     * Create a detached, initialised OrderLogRecord
     */
    public OrderLogRecord(Integer id, Integer orderId, Integer status, Date changeTime) {
        super(OrderLog.ORDER_LOG);

        set(0, id);
        set(1, orderId);
        set(2, status);
        set(3, changeTime);
    }
}
