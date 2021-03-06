/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables.records;


import com.it.jooq.generated.tables.User;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record8<Integer, String, Integer, Integer, String, String, Date, Integer> {

    private static final long serialVersionUID = -1356679757;

    /**
     * Setter for <code>study.user.uid</code>. 用户id
     */
    public UserRecord setUid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.user.uid</code>. 用户id
     */
    public Integer getUid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>study.user.name</code>. 姓名
     */
    public UserRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.user.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>study.user.sex</code>. 性别
     */
    public UserRecord setSex(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.user.sex</code>. 性别
     */
    public Integer getSex() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>study.user.age</code>. 年龄
     */
    public UserRecord setAge(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.user.age</code>. 年龄
     */
    public Integer getAge() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>study.user.mobile</code>. 手机号码
     */
    public UserRecord setMobile(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>study.user.mobile</code>. 手机号码
     */
    public String getMobile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>study.user.password</code>. 密码
     */
    public UserRecord setPassword(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>study.user.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>study.user.register_time</code>. 注册时间
     */
    public UserRecord setRegisterTime(Date value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>study.user.register_time</code>. 注册时间
     */
    public Date getRegisterTime() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>study.user.order_sum</code>. ������
     */
    public UserRecord setOrderSum(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>study.user.order_sum</code>. ������
     */
    public Integer getOrderSum() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Integer, String, String, Date, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Integer, String, String, Date, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return User.USER.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return User.USER.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return User.USER.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return User.USER.REGISTER_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return User.USER.ORDER_SUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getRegisterTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOrderSum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(Integer value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(Date value) {
        setRegisterTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(Integer value) {
        setOrderSum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, String value6, Date value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer uid, String name, Integer sex, Integer age, String mobile, String password, Date registerTime, Integer orderSum) {
        super(User.USER);

        set(0, uid);
        set(1, name);
        set(2, sex);
        set(3, age);
        set(4, mobile);
        set(5, password);
        set(6, registerTime);
        set(7, orderSum);
    }
}
