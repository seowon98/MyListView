package com.techtown.listview;
//걸그룹 정보를 담아두는 메서드, 자바 파일
public class Singeritem {

    String name;
    String mobile;

    public Singeritem(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
 //변수를 직접 접근하는 것 보다 get, set 메서드 사용
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
 //객체 안의 데이터 확인하는 내용을 출력하는 메서드
    @Override
    public String toString() {
        return "Singeritem{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

