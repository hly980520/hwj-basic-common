package com.hwj.basic.mybatis;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

/**
 * @Program: hwj-basic-common
 * @Description:
 * @author: peng.huang
 * @since: 2025-03-17 10:14:41
 */
public class DataPage<T> implements Serializable {

    private static final long serialVersionUID = 4041933337247740140L;

    //-- 公共变量 --//
    public static final String ASC = "asc";
    public static final String DESC = "desc";

    //-- 分页参数 --//
    private int pageNo = 1;

    private int pageSize = 20;
    //-- 排序参数 --//
    private String orderBy = null;

    private String order = null;

    //总数量
    private long totalCount = -1;
    //数据列表
    private List<T> dataList;

    public DataPage() {
    }

    public DataPage(int pageSize) {
        this.pageSize = pageSize;
    }

    public DataPage(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = Math.max(pageNo, 1);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        String lowcaseOrder = StringUtils.lowerCase(order);

        //检查order字符串的合法值
        String[] orders = StringUtils.split(lowcaseOrder, ',');
        if(orders==null){
            return;
        }
        for (String orderStr : orders) {
            if (!StringUtils.equals(DESC, orderStr) && !StringUtils.equals(ASC, orderStr)) {
                throw new IllegalArgumentException("排序方向" + orderStr + "不是合法值");
            }
        }

        this.order = lowcaseOrder;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    /**
     * 根据pageSize与totalCount计算总页数, 默认值为-1
     * @return long
     */
    public long getTotalPages() {
        if (totalCount < 0) {
            return -1;
        }

        long count = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            count++;
        }
        return count;
    }

    /**
     * 是否还有下一页
     * @return true or false
     */
    public boolean isHasNext() {
        return (pageNo + 1 <= getTotalPages());
    }

    /**
     * 是否还有上一页
     * @return true or false
     */
    public boolean isHasPrev() {
        return (pageNo - 1 >= 1);
    }

    /**
     * 取得下页的页号, 序号从1开始.
     * 当前页为尾页时仍返回尾页序号.
     */
    public int getNextPage() {
        if (isHasNext()) {
            return pageNo + 1;
        } else {
            return pageNo;
        }
    }

    /**
     * 取得上页的页号, 序号从1开始.
     * 当前页为首页时返回首页序号.
     */
    public int getPrevPage() {
        if (isHasPrev()) {
            return pageNo - 1;
        } else {
            return pageNo;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DataPage.class.getSimpleName() + "[", "]")
                .add("pageNo=" + pageNo)
                .add("pageSize=" + pageSize)
                .add("orderBy='" + orderBy + "'")
                .add("order='" + order + "'")
                .add("totalCount=" + totalCount)
                .add("dataList=" + dataList)
                .toString();
    }
}
