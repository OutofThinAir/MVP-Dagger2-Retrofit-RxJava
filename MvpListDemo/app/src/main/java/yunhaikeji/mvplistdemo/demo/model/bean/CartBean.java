package yunhaikeji.mvplistdemo.demo.model.bean;

import java.util.List;

/**
 * Use:javaBean
 * Author:陈懿鹏
 * Data:2017/5/12.
 */

public class CartBean {


    /**
     * cartItemList : [{"colorID":0,"count":10,"id":269,"name":"超高回购率丨清爽平衡矿物黑面膜21片","pic":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","price":99.9,"productID":389,"repertory":899,"sizeID":0,"userID":26},{"colorID":0,"count":10,"id":270,"name":"清爽亮颜黑面膜套装21片","pic":"http://image.hmeili.com/yunifang/images/goods/772/goods_img/1608191429278479187604212.jpg","price":99.9,"productID":772,"repertory":899,"sizeID":0,"userID":26}]
     * response : cart
     */

    private String response;
    private List<CartItemListBean> cartItemList;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<CartItemListBean> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItemListBean> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public static class CartItemListBean {
        /**
         * colorID : 0
         * count : 10
         * id : 269
         * name : 超高回购率丨清爽平衡矿物黑面膜21片
         * pic : http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg
         * price : 99.9
         * productID : 389
         * repertory : 899
         * sizeID : 0
         * userID : 26
         */

        private int colorID;
        private int count;
        private int id;
        private String name;
        private String pic;
        private double price;
        private int productID;
        private int repertory;
        private int sizeID;
        private int userID;

        public int getColorID() {
            return colorID;
        }

        public void setColorID(int colorID) {
            this.colorID = colorID;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public int getRepertory() {
            return repertory;
        }

        public void setRepertory(int repertory) {
            this.repertory = repertory;
        }

        public int getSizeID() {
            return sizeID;
        }

        public void setSizeID(int sizeID) {
            this.sizeID = sizeID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }
    }
}
