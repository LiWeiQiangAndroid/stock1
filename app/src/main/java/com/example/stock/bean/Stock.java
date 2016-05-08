package com.example.stock.bean;

import java.util.List;

/**
 * 作者：LiWeiQiang on 2016/4/25 09:00
 * 邮箱：lwqldsyzx@126.com
 */

/**
 * 股票
 */
public class Stock {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data":{"buyFive":"34600","buyFivePri":"16.010","buyFour":"16900","buyFourPri":"16.020","buyOne":"20390","buyOnePri":"16.050","buyThree":"34900","buyThreePri":"16.030","buyTwo":"23000","buyTwoPri":"16.040","competitivePri":"16.050","date":"2016-04-22","gid":"sh601009","increPer":"0.69","increase":"0.110","name":"南京银行","nowPri":"16.050","reservePri":"16.060","sellFive":"199357","sellFivePri":"16.100","sellFour":"41900","sellFourPri":"16.090","sellOne":"89900","sellOnePri":"16.060","sellThree":"6500","sellThreePri":"16.080","sellTwo":"25800","sellTwoPri":"16.070","time":"15:00:00","todayMax":"16.130","todayMin":"15.830","todayStartPri":"15.860","traAmount":"124834381.000","traNumber":"77918","yestodEndPri":"15.940"},"dapandata":{"dot":"16.050","name":"南京银行","nowPic":"0.110","rate":"0.69","traAmount":"12483","traNumber":"77918"},"gopicture":{"minurl":"http://image.sinajs.cn/newchart/min/n/sh601009.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sh601009.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sh601009.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sh601009.gif"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    /**
     * data : {"buyFive":"34600","buyFivePri":"16.010","buyFour":"16900","buyFourPri":"16.020","buyOne":"20390","buyOnePri":"16.050","buyThree":"34900","buyThreePri":"16.030","buyTwo":"23000","buyTwoPri":"16.040","competitivePri":"16.050","date":"2016-04-22","gid":"sh601009","increPer":"0.69","increase":"0.110","name":"南京银行","nowPri":"16.050","reservePri":"16.060","sellFive":"199357","sellFivePri":"16.100","sellFour":"41900","sellFourPri":"16.090","sellOne":"89900","sellOnePri":"16.060","sellThree":"6500","sellThreePri":"16.080","sellTwo":"25800","sellTwoPri":"16.070","time":"15:00:00","todayMax":"16.130","todayMin":"15.830","todayStartPri":"15.860","traAmount":"124834381.000","traNumber":"77918","yestodEndPri":"15.940"}
     * dapandata : {"dot":"16.050","name":"南京银行","nowPic":"0.110","rate":"0.69","traAmount":"12483","traNumber":"77918"}
     * gopicture : {"minurl":"http://image.sinajs.cn/newchart/min/n/sh601009.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sh601009.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sh601009.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sh601009.gif"}
     */

    private List<Result> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Result {


        private Data data;
        /**
         * dot : 16.050
         * name : 南京银行
         * nowPic : 0.110
         * rate : 0.69
         * traAmount : 12483
         * traNumber : 77918
         */

        private Dapandata dapandata;
        /**
         * minurl : http://image.sinajs.cn/newchart/min/n/sh601009.gif
         * dayurl : http://image.sinajs.cn/newchart/daily/n/sh601009.gif
         * weekurl : http://image.sinajs.cn/newchart/weekly/n/sh601009.gif
         * monthurl : http://image.sinajs.cn/newchart/monthly/n/sh601009.gif
         */

        private Gopicture gopicture;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public Dapandata getDapandata() {
            return dapandata;
        }

        public void setDapandata(Dapandata dapandata) {
            this.dapandata = dapandata;
        }

        public Gopicture getGopicture() {
            return gopicture;
        }

        public void setGopicture(Gopicture gopicture) {
            this.gopicture = gopicture;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "data=" + data +
                    ", dapandata=" + dapandata +
                    ", gopicture=" + gopicture +
                    '}';
        }
        /**
         * buyFive : 34600
         * buyFivePri : 16.010
         * buyFour : 16900
         * buyFourPri : 16.020
         * buyOne : 20390
         * buyOnePri : 16.050
         * buyThree : 34900
         * buyThreePri : 16.030
         * buyTwo : 23000
         * buyTwoPri : 16.040
         * competitivePri : 16.050
         * date : 2016-04-22
         * gid : sh601009
         * increPer : 0.69
         * increase : 0.110
         * name : 南京银行
         * nowPri : 16.050
         * reservePri : 16.060
         * sellFive : 199357
         * sellFivePri : 16.100
         * sellFour : 41900
         * sellFourPri : 16.090
         * sellOne : 89900
         * sellOnePri : 16.060
         * sellThree : 6500
         * sellThreePri : 16.080
         * sellTwo : 25800
         * sellTwoPri : 16.070
         * time : 15:00:00
         * todayMax : 16.130
         * todayMin : 15.830
         * todayStartPri : 15.860
         * traAmount : 124834381.000
         * traNumber : 77918
         * yestodEndPri : 15.940
         */
        public class Data {
            private String buyFive;
            private String buyFivePri;
            private String buyFour;
            private String buyFourPri;
            private String buyOne;
            private String buyOnePri;
            private String buyThree;
            private String buyThreePri;
            private String buyTwo;
            private String buyTwoPri;
            private String competitivePri;
            private String date;
            private String gid;
            private String increPer;
            private String increase;
            private String name;
            private String nowPri;
            private String reservePri;
            private String sellFive;
            private String sellFivePri;
            private String sellFour;
            private String sellFourPri;
            private String sellOne;
            private String sellOnePri;
            private String sellThree;
            private String sellThreePri;
            private String sellTwo;
            private String sellTwoPri;
            private String time;
            private String todayMax;
            private String todayMin;
            private String todayStartPri;
            private String traAmount;
            private String traNumber;
            private String yestodEndPri;

            public String getBuyFive() {
                return buyFive;
            }

            public void setBuyFive(String buyFive) {
                this.buyFive = buyFive;
            }

            public String getBuyFivePri() {
                return buyFivePri;
            }

            public void setBuyFivePri(String buyFivePri) {
                this.buyFivePri = buyFivePri;
            }

            public String getBuyFour() {
                return buyFour;
            }

            public void setBuyFour(String buyFour) {
                this.buyFour = buyFour;
            }

            public String getBuyFourPri() {
                return buyFourPri;
            }

            public void setBuyFourPri(String buyFourPri) {
                this.buyFourPri = buyFourPri;
            }

            public String getBuyOne() {
                return buyOne;
            }

            public void setBuyOne(String buyOne) {
                this.buyOne = buyOne;
            }

            public String getBuyOnePri() {
                return buyOnePri;
            }

            public void setBuyOnePri(String buyOnePri) {
                this.buyOnePri = buyOnePri;
            }

            public String getBuyThree() {
                return buyThree;
            }

            public void setBuyThree(String buyThree) {
                this.buyThree = buyThree;
            }

            public String getBuyThreePri() {
                return buyThreePri;
            }

            public void setBuyThreePri(String buyThreePri) {
                this.buyThreePri = buyThreePri;
            }

            public String getBuyTwo() {
                return buyTwo;
            }

            public void setBuyTwo(String buyTwo) {
                this.buyTwo = buyTwo;
            }

            public String getBuyTwoPri() {
                return buyTwoPri;
            }

            public void setBuyTwoPri(String buyTwoPri) {
                this.buyTwoPri = buyTwoPri;
            }

            public String getCompetitivePri() {
                return competitivePri;
            }

            public void setCompetitivePri(String competitivePri) {
                this.competitivePri = competitivePri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getIncrePer() {
                return increPer;
            }

            public void setIncrePer(String increPer) {
                this.increPer = increPer;
            }

            public String getIncrease() {
                return increase;
            }

            public void setIncrease(String increase) {
                this.increase = increase;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPri() {
                return nowPri;
            }

            public void setNowPri(String nowPri) {
                this.nowPri = nowPri;
            }

            public String getReservePri() {
                return reservePri;
            }

            public void setReservePri(String reservePri) {
                this.reservePri = reservePri;
            }

            public String getSellFive() {
                return sellFive;
            }

            public void setSellFive(String sellFive) {
                this.sellFive = sellFive;
            }

            public String getSellFivePri() {
                return sellFivePri;
            }

            public void setSellFivePri(String sellFivePri) {
                this.sellFivePri = sellFivePri;
            }

            public String getSellFour() {
                return sellFour;
            }

            public void setSellFour(String sellFour) {
                this.sellFour = sellFour;
            }

            public String getSellFourPri() {
                return sellFourPri;
            }

            public void setSellFourPri(String sellFourPri) {
                this.sellFourPri = sellFourPri;
            }

            public String getSellOne() {
                return sellOne;
            }

            public void setSellOne(String sellOne) {
                this.sellOne = sellOne;
            }

            public String getSellOnePri() {
                return sellOnePri;
            }

            public void setSellOnePri(String sellOnePri) {
                this.sellOnePri = sellOnePri;
            }

            public String getSellThree() {
                return sellThree;
            }

            public void setSellThree(String sellThree) {
                this.sellThree = sellThree;
            }

            public String getSellThreePri() {
                return sellThreePri;
            }

            public void setSellThreePri(String sellThreePri) {
                this.sellThreePri = sellThreePri;
            }

            public String getSellTwo() {
                return sellTwo;
            }

            public void setSellTwo(String sellTwo) {
                this.sellTwo = sellTwo;
            }

            public String getSellTwoPri() {
                return sellTwoPri;
            }

            public void setSellTwoPri(String sellTwoPri) {
                this.sellTwoPri = sellTwoPri;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTodayMax() {
                return todayMax;
            }

            public void setTodayMax(String todayMax) {
                this.todayMax = todayMax;
            }

            public String getTodayMin() {
                return todayMin;
            }

            public void setTodayMin(String todayMin) {
                this.todayMin = todayMin;
            }

            public String getTodayStartPri() {
                return todayStartPri;
            }

            public void setTodayStartPri(String todayStartPri) {
                this.todayStartPri = todayStartPri;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }

            public String getYestodEndPri() {
                return yestodEndPri;
            }

            public void setYestodEndPri(String yestodEndPri) {
                this.yestodEndPri = yestodEndPri;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "buyFive='" + buyFive + '\'' +
                        ", buyFivePri='" + buyFivePri + '\'' +
                        ", buyFour='" + buyFour + '\'' +
                        ", buyFourPri='" + buyFourPri + '\'' +
                        ", buyOne='" + buyOne + '\'' +
                        ", buyOnePri='" + buyOnePri + '\'' +
                        ", buyThree='" + buyThree + '\'' +
                        ", buyThreePri='" + buyThreePri + '\'' +
                        ", buyTwo='" + buyTwo + '\'' +
                        ", buyTwoPri='" + buyTwoPri + '\'' +
                        ", competitivePri='" + competitivePri + '\'' +
                        ", date='" + date + '\'' +
                        ", gid='" + gid + '\'' +
                        ", increPer='" + increPer + '\'' +
                        ", increase='" + increase + '\'' +
                        ", name='" + name + '\'' +
                        ", nowPri='" + nowPri + '\'' +
                        ", reservePri='" + reservePri + '\'' +
                        ", sellFive='" + sellFive + '\'' +
                        ", sellFivePri='" + sellFivePri + '\'' +
                        ", sellFour='" + sellFour + '\'' +
                        ", sellFourPri='" + sellFourPri + '\'' +
                        ", sellOne='" + sellOne + '\'' +
                        ", sellOnePri='" + sellOnePri + '\'' +
                        ", sellThree='" + sellThree + '\'' +
                        ", sellThreePri='" + sellThreePri + '\'' +
                        ", sellTwo='" + sellTwo + '\'' +
                        ", sellTwoPri='" + sellTwoPri + '\'' +
                        ", time='" + time + '\'' +
                        ", todayMax='" + todayMax + '\'' +
                        ", todayMin='" + todayMin + '\'' +
                        ", todayStartPri='" + todayStartPri + '\'' +
                        ", traAmount='" + traAmount + '\'' +
                        ", traNumber='" + traNumber + '\'' +
                        ", yestodEndPri='" + yestodEndPri + '\'' +
                        '}';
            }
        }

        public static class Dapandata {
            private String dot;
            private String name;
            private String nowPic;
            private String rate;
            private String traAmount;
            private String traNumber;

            public String getDot() {
                return dot;
            }

            public void setDot(String dot) {
                this.dot = dot;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPic() {
                return nowPic;
            }

            public void setNowPic(String nowPic) {
                this.nowPic = nowPic;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }

            @Override
            public String toString() {
                return "Dapandata{" +
                        "dot='" + dot + '\'' +
                        ", name='" + name + '\'' +
                        ", nowPic='" + nowPic + '\'' +
                        ", rate='" + rate + '\'' +
                        ", traAmount='" + traAmount + '\'' +
                        ", traNumber='" + traNumber + '\'' +
                        '}';
            }
        }

        public static class Gopicture {
            private String minurl;
            private String dayurl;
            private String weekurl;
            private String monthurl;

            public String getMinurl() {
                return minurl;
            }

            public void setMinurl(String minurl) {
                this.minurl = minurl;
            }

            public String getDayurl() {
                return dayurl;
            }

            public void setDayurl(String dayurl) {
                this.dayurl = dayurl;
            }

            public String getWeekurl() {
                return weekurl;
            }

            public void setWeekurl(String weekurl) {
                this.weekurl = weekurl;
            }

            public String getMonthurl() {
                return monthurl;
            }

            public void setMonthurl(String monthurl) {
                this.monthurl = monthurl;
            }

            @Override
            public String toString() {
                return "Gopicture{" +
                        "minurl='" + minurl + '\'' +
                        ", dayurl='" + dayurl + '\'' +
                        ", weekurl='" + weekurl + '\'' +
                        ", monthurl='" + monthurl + '\'' +
                        '}';
            }
        }
    }
}
