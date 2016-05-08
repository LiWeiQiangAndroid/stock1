package com.example.stock.bean;

import java.util.List;

/**
 * 作者：LiWeiQiang on 2016/5/7 15:05
 * 邮箱：lwqldsyzx@126.com
 */
public class News {

    /**
     * OK : 0
     * obj : {"list":[{"id":"8005285","tour":{"id":"87962435","title":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","foreword":"","startdate":"2016-04-28","cntP":"102","days":"1","tags":"","picdomain":"http://img.117go.com/timg/","coverpic":"160428/4HQTLN7VhJS74MTF.jpg","pcolor":"8683905","subtype":"2","cntcmt":"65","timestamp":"2016-04-28 17:52:01","cntFav":"913","isPrivate":"0","cntMember":"1","isTeam":"0","likeCnt":"913","mtime":"14626050532208","recmtime":"14626049946669","UUID":"","dispCities":[],"owner":{"nickname":"刘小妞大侠","userid":"40575909","gender":"","avatar":"160429/4HRcAvHwrR9ZQNUS.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"},"isCurrTrip":false,"isMyFav":false,"isLiked":false,"viewCnt":"16627","metadata_avgExpense":"","cmt":[{"cmtid":"19802595","user":{"nickname":"穗言穗语","userid":"332234","gender":"f","avatar":"160108/4FgbyKvX81RJNEhe.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"},"words":"👍","timestamp":"2016-05-07 15:10:53","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802539","user":{"nickname":"MrChosen","userid":"580039","gender":"m","avatar":"160310/4GeYKHT4E7mbXPkU.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"哈哈哈","timestamp":"2016-05-07 14:46:46","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802525","user":{"nickname":"帅帅陈_4FRZgHfW2Jt2janB","userid":"40461700","gender":"","avatar":"default2.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"😁","timestamp":"2016-05-07 14:45:48","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802455","user":{"nickname":"飞翔的BB","userid":"35837971","gender":"m","avatar":"150905/4DiphFqhXNkFQ4QM.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":0,"countryCode":""},"words":"不错哦","timestamp":"2016-05-07 14:27:59","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802413","user":{"nickname":"周毅67","userid":"1382822","gender":"","avatar":"140607/a2fc7da950.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"美丽","timestamp":"2016-05-07 14:11:58","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false}]}}],"banners":[]}
     */

    private int OK;
    private ObjBean obj;

    public int getOK() {
        return OK;
    }

    public void setOK(int OK) {
        this.OK = OK;
    }

    public ObjBean getObj() {
        return obj;
    }

    public void setObj(ObjBean obj) {
        this.obj = obj;
    }

    public static class ObjBean {
        /**
         * id : 8005285
         * tour : {"id":"87962435","title":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","foreword":"","startdate":"2016-04-28","cntP":"102","days":"1","tags":"","picdomain":"http://img.117go.com/timg/","coverpic":"160428/4HQTLN7VhJS74MTF.jpg","pcolor":"8683905","subtype":"2","cntcmt":"65","timestamp":"2016-04-28 17:52:01","cntFav":"913","isPrivate":"0","cntMember":"1","isTeam":"0","likeCnt":"913","mtime":"14626050532208","recmtime":"14626049946669","UUID":"","dispCities":[],"owner":{"nickname":"刘小妞大侠","userid":"40575909","gender":"","avatar":"160429/4HRcAvHwrR9ZQNUS.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"},"isCurrTrip":false,"isMyFav":false,"isLiked":false,"viewCnt":"16627","metadata_avgExpense":"","cmt":[{"cmtid":"19802595","user":{"nickname":"穗言穗语","userid":"332234","gender":"f","avatar":"160108/4FgbyKvX81RJNEhe.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"},"words":"👍","timestamp":"2016-05-07 15:10:53","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802539","user":{"nickname":"MrChosen","userid":"580039","gender":"m","avatar":"160310/4GeYKHT4E7mbXPkU.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"哈哈哈","timestamp":"2016-05-07 14:46:46","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802525","user":{"nickname":"帅帅陈_4FRZgHfW2Jt2janB","userid":"40461700","gender":"","avatar":"default2.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"😁","timestamp":"2016-05-07 14:45:48","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802455","user":{"nickname":"飞翔的BB","userid":"35837971","gender":"m","avatar":"150905/4DiphFqhXNkFQ4QM.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":0,"countryCode":""},"words":"不错哦","timestamp":"2016-05-07 14:27:59","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802413","user":{"nickname":"周毅67","userid":"1382822","gender":"","avatar":"140607/a2fc7da950.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"美丽","timestamp":"2016-05-07 14:11:58","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false}]}
         */

        private List<ListBean> list;
        private List<?> banners;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<?> getBanners() {
            return banners;
        }

        public void setBanners(List<?> banners) {
            this.banners = banners;
        }

        public static class ListBean {
            private String id;
            /**
             * id : 87962435
             * title : 一个与风花雪月有关的地方——大理6天自驾旅拍
             * foreword :
             * startdate : 2016-04-28
             * cntP : 102
             * days : 1
             * tags :
             * picdomain : http://img.117go.com/timg/
             * coverpic : 160428/4HQTLN7VhJS74MTF.jpg
             * pcolor : 8683905
             * subtype : 2
             * cntcmt : 65
             * timestamp : 2016-04-28 17:52:01
             * cntFav : 913
             * isPrivate : 0
             * cntMember : 1
             * isTeam : 0
             * likeCnt : 913
             * mtime : 14626050532208
             * recmtime : 14626049946669
             * UUID :
             * dispCities : []
             * owner : {"nickname":"刘小妞大侠","userid":"40575909","gender":"","avatar":"160429/4HRcAvHwrR9ZQNUS.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"}
             * isCurrTrip : false
             * isMyFav : false
             * isLiked : false
             * viewCnt : 16627
             * metadata_avgExpense :
             * cmt : [{"cmtid":"19802595","user":{"nickname":"穗言穗语","userid":"332234","gender":"f","avatar":"160108/4FgbyKvX81RJNEhe.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"},"words":"👍","timestamp":"2016-05-07 15:10:53","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802539","user":{"nickname":"MrChosen","userid":"580039","gender":"m","avatar":"160310/4GeYKHT4E7mbXPkU.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"哈哈哈","timestamp":"2016-05-07 14:46:46","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802525","user":{"nickname":"帅帅陈_4FRZgHfW2Jt2janB","userid":"40461700","gender":"","avatar":"default2.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"😁","timestamp":"2016-05-07 14:45:48","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802455","user":{"nickname":"飞翔的BB","userid":"35837971","gender":"m","avatar":"150905/4DiphFqhXNkFQ4QM.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":0,"countryCode":""},"words":"不错哦","timestamp":"2016-05-07 14:27:59","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false},{"cmtid":"19802413","user":{"nickname":"周毅67","userid":"1382822","gender":"","avatar":"140607/a2fc7da950.jpg","picdomain":"http://img.117go.com/timg/","badge":"0","phonecode":86,"countryCode":"CN"},"words":"美丽","timestamp":"2016-05-07 14:11:58","onitemid":"87962435","onitemtype":"4","replycmtid":"0","ontext":"一个与风花雪月有关的地方\u2014\u2014大理6天自驾旅拍","rootreplyid":"0","rootitemid":"87962435","star":"0.0","likeCnt":"0","isLiked":false}]
             */

            private TourBean tour;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public TourBean getTour() {
                return tour;
            }

            public void setTour(TourBean tour) {
                this.tour = tour;
            }

            public static class TourBean {
                private String id;
                private String title;
                private String foreword;
                private String startdate;
                private String cntP;
                private String days;
                private String tags;
                private String picdomain;
                private String coverpic;
                private String pcolor;
                private String subtype;
                private String cntcmt;
                private String timestamp;
                private String cntFav;
                private String isPrivate;
                private String cntMember;
                private String isTeam;
                private String likeCnt;
                private String mtime;
                private String recmtime;
                private String UUID;
                /**
                 * nickname : 刘小妞大侠
                 * userid : 40575909
                 * gender :
                 * avatar : 160429/4HRcAvHwrR9ZQNUS.jpg
                 * picdomain : http://img.117go.com/timg/
                 * badge : 2
                 * phonecode : 86
                 * countryCode : CN
                 */

                private OwnerBean owner;
                private boolean isCurrTrip;
                private boolean isMyFav;
                private boolean isLiked;
                private String viewCnt;
                private String metadata_avgExpense;
                private List<?> dispCities;
                /**
                 * cmtid : 19802595
                 * user : {"nickname":"穗言穗语","userid":"332234","gender":"f","avatar":"160108/4FgbyKvX81RJNEhe.jpg","picdomain":"http://img.117go.com/timg/","badge":"2","phonecode":86,"countryCode":"CN"}
                 * words : 👍
                 * timestamp : 2016-05-07 15:10:53
                 * onitemid : 87962435
                 * onitemtype : 4
                 * replycmtid : 0
                 * ontext : 一个与风花雪月有关的地方——大理6天自驾旅拍
                 * rootreplyid : 0
                 * rootitemid : 87962435
                 * star : 0.0
                 * likeCnt : 0
                 * isLiked : false
                 */

                private List<CmtBean> cmt;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getForeword() {
                    return foreword;
                }

                public void setForeword(String foreword) {
                    this.foreword = foreword;
                }

                public String getStartdate() {
                    return startdate;
                }

                public void setStartdate(String startdate) {
                    this.startdate = startdate;
                }

                public String getCntP() {
                    return cntP;
                }

                public void setCntP(String cntP) {
                    this.cntP = cntP;
                }

                public String getDays() {
                    return days;
                }

                public void setDays(String days) {
                    this.days = days;
                }

                public String getTags() {
                    return tags;
                }

                public void setTags(String tags) {
                    this.tags = tags;
                }

                public String getPicdomain() {
                    return picdomain;
                }

                public void setPicdomain(String picdomain) {
                    this.picdomain = picdomain;
                }

                public String getCoverpic() {
                    return coverpic;
                }

                public void setCoverpic(String coverpic) {
                    this.coverpic = coverpic;
                }

                public String getPcolor() {
                    return pcolor;
                }

                public void setPcolor(String pcolor) {
                    this.pcolor = pcolor;
                }

                public String getSubtype() {
                    return subtype;
                }

                public void setSubtype(String subtype) {
                    this.subtype = subtype;
                }

                public String getCntcmt() {
                    return cntcmt;
                }

                public void setCntcmt(String cntcmt) {
                    this.cntcmt = cntcmt;
                }

                public String getTimestamp() {
                    return timestamp;
                }

                public void setTimestamp(String timestamp) {
                    this.timestamp = timestamp;
                }

                public String getCntFav() {
                    return cntFav;
                }

                public void setCntFav(String cntFav) {
                    this.cntFav = cntFav;
                }

                public String getIsPrivate() {
                    return isPrivate;
                }

                public void setIsPrivate(String isPrivate) {
                    this.isPrivate = isPrivate;
                }

                public String getCntMember() {
                    return cntMember;
                }

                public void setCntMember(String cntMember) {
                    this.cntMember = cntMember;
                }

                public String getIsTeam() {
                    return isTeam;
                }

                public void setIsTeam(String isTeam) {
                    this.isTeam = isTeam;
                }

                public String getLikeCnt() {
                    return likeCnt;
                }

                public void setLikeCnt(String likeCnt) {
                    this.likeCnt = likeCnt;
                }

                public String getMtime() {
                    return mtime;
                }

                public void setMtime(String mtime) {
                    this.mtime = mtime;
                }

                public String getRecmtime() {
                    return recmtime;
                }

                public void setRecmtime(String recmtime) {
                    this.recmtime = recmtime;
                }

                public String getUUID() {
                    return UUID;
                }

                public void setUUID(String UUID) {
                    this.UUID = UUID;
                }

                public OwnerBean getOwner() {
                    return owner;
                }

                public void setOwner(OwnerBean owner) {
                    this.owner = owner;
                }

                public boolean isIsCurrTrip() {
                    return isCurrTrip;
                }

                public void setIsCurrTrip(boolean isCurrTrip) {
                    this.isCurrTrip = isCurrTrip;
                }

                public boolean isIsMyFav() {
                    return isMyFav;
                }

                public void setIsMyFav(boolean isMyFav) {
                    this.isMyFav = isMyFav;
                }

                public boolean isIsLiked() {
                    return isLiked;
                }

                public void setIsLiked(boolean isLiked) {
                    this.isLiked = isLiked;
                }

                public String getViewCnt() {
                    return viewCnt;
                }

                public void setViewCnt(String viewCnt) {
                    this.viewCnt = viewCnt;
                }

                public String getMetadata_avgExpense() {
                    return metadata_avgExpense;
                }

                public void setMetadata_avgExpense(String metadata_avgExpense) {
                    this.metadata_avgExpense = metadata_avgExpense;
                }

                public List<?> getDispCities() {
                    return dispCities;
                }

                public void setDispCities(List<?> dispCities) {
                    this.dispCities = dispCities;
                }

                public List<CmtBean> getCmt() {
                    return cmt;
                }

                public void setCmt(List<CmtBean> cmt) {
                    this.cmt = cmt;
                }

                public static class OwnerBean {
                    private String nickname;
                    private String userid;
                    private String gender;
                    private String avatar;
                    private String picdomain;
                    private String badge;
                    private int phonecode;
                    private String countryCode;

                    public String getNickname() {
                        return nickname;
                    }

                    public void setNickname(String nickname) {
                        this.nickname = nickname;
                    }

                    public String getUserid() {
                        return userid;
                    }

                    public void setUserid(String userid) {
                        this.userid = userid;
                    }

                    public String getGender() {
                        return gender;
                    }

                    public void setGender(String gender) {
                        this.gender = gender;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public String getPicdomain() {
                        return picdomain;
                    }

                    public void setPicdomain(String picdomain) {
                        this.picdomain = picdomain;
                    }

                    public String getBadge() {
                        return badge;
                    }

                    public void setBadge(String badge) {
                        this.badge = badge;
                    }

                    public int getPhonecode() {
                        return phonecode;
                    }

                    public void setPhonecode(int phonecode) {
                        this.phonecode = phonecode;
                    }

                    public String getCountryCode() {
                        return countryCode;
                    }

                    public void setCountryCode(String countryCode) {
                        this.countryCode = countryCode;
                    }
                }

                public static class CmtBean {
                    private String cmtid;
                    /**
                     * nickname : 穗言穗语
                     * userid : 332234
                     * gender : f
                     * avatar : 160108/4FgbyKvX81RJNEhe.jpg
                     * picdomain : http://img.117go.com/timg/
                     * badge : 2
                     * phonecode : 86
                     * countryCode : CN
                     */

                    private UserBean user;
                    private String words;
                    private String timestamp;
                    private String onitemid;
                    private String onitemtype;
                    private String replycmtid;
                    private String ontext;
                    private String rootreplyid;
                    private String rootitemid;
                    private String star;
                    private String likeCnt;
                    private boolean isLiked;

                    public String getCmtid() {
                        return cmtid;
                    }

                    public void setCmtid(String cmtid) {
                        this.cmtid = cmtid;
                    }

                    public UserBean getUser() {
                        return user;
                    }

                    public void setUser(UserBean user) {
                        this.user = user;
                    }

                    public String getWords() {
                        return words;
                    }

                    public void setWords(String words) {
                        this.words = words;
                    }

                    public String getTimestamp() {
                        return timestamp;
                    }

                    public void setTimestamp(String timestamp) {
                        this.timestamp = timestamp;
                    }

                    public String getOnitemid() {
                        return onitemid;
                    }

                    public void setOnitemid(String onitemid) {
                        this.onitemid = onitemid;
                    }

                    public String getOnitemtype() {
                        return onitemtype;
                    }

                    public void setOnitemtype(String onitemtype) {
                        this.onitemtype = onitemtype;
                    }

                    public String getReplycmtid() {
                        return replycmtid;
                    }

                    public void setReplycmtid(String replycmtid) {
                        this.replycmtid = replycmtid;
                    }

                    public String getOntext() {
                        return ontext;
                    }

                    public void setOntext(String ontext) {
                        this.ontext = ontext;
                    }

                    public String getRootreplyid() {
                        return rootreplyid;
                    }

                    public void setRootreplyid(String rootreplyid) {
                        this.rootreplyid = rootreplyid;
                    }

                    public String getRootitemid() {
                        return rootitemid;
                    }

                    public void setRootitemid(String rootitemid) {
                        this.rootitemid = rootitemid;
                    }

                    public String getStar() {
                        return star;
                    }

                    public void setStar(String star) {
                        this.star = star;
                    }

                    public String getLikeCnt() {
                        return likeCnt;
                    }

                    public void setLikeCnt(String likeCnt) {
                        this.likeCnt = likeCnt;
                    }

                    public boolean isIsLiked() {
                        return isLiked;
                    }

                    public void setIsLiked(boolean isLiked) {
                        this.isLiked = isLiked;
                    }

                    public static class UserBean {
                        private String nickname;
                        private String userid;
                        private String gender;
                        private String avatar;
                        private String picdomain;
                        private String badge;
                        private int phonecode;
                        private String countryCode;

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }

                        public String getUserid() {
                            return userid;
                        }

                        public void setUserid(String userid) {
                            this.userid = userid;
                        }

                        public String getGender() {
                            return gender;
                        }

                        public void setGender(String gender) {
                            this.gender = gender;
                        }

                        public String getAvatar() {
                            return avatar;
                        }

                        public void setAvatar(String avatar) {
                            this.avatar = avatar;
                        }

                        public String getPicdomain() {
                            return picdomain;
                        }

                        public void setPicdomain(String picdomain) {
                            this.picdomain = picdomain;
                        }

                        public String getBadge() {
                            return badge;
                        }

                        public void setBadge(String badge) {
                            this.badge = badge;
                        }

                        public int getPhonecode() {
                            return phonecode;
                        }

                        public void setPhonecode(int phonecode) {
                            this.phonecode = phonecode;
                        }

                        public String getCountryCode() {
                            return countryCode;
                        }

                        public void setCountryCode(String countryCode) {
                            this.countryCode = countryCode;
                        }
                    }
                }
            }
        }
    }
}
