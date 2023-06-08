package com.example.demo.service;

import java.util.*;
import java.lang.*;
import java.io.*;


public class DistanceCalculator {
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") + " Miles\n"); // 두 지점의 위도(latitude)와 경도(longitude), 단위 : mile
        System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n"); // 단위 : kilometers
        System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n"); // 단위 : 해리(Nautical Mile)
    }

    private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) { // 더 정확한 위치 정보를 얻기 위해 double 타입으로 지정
        if ((lat1 == lat2) && (lon1 == lon2)) {  // 같은 위치일 경우 두 지점 간의 거리 0 리턴
            return 0;
        }
        else {
            double theta = lon1 - lon2; // 두 지점 간 거리를 구하기 위해 경도 차이를 구함
            // 구면 상의 두 지점 구하는 방법 : 코사인 법칙을 이용해 구함
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);     // 라디안 값으로 거리를 반환
            dist = Math.toDegrees(dist); // 위에서 구한 라디안을 도 단위로 변환
            dist = dist * 60 * 1.1515;   // 미국에서 사용하는 거리 단위인 마일(Mile)로 기본 설정이 되어있음
            if (unit.equals("K")) {      // 원하는 거리 단위(km, 해리)로 변환 해줌
                dist = dist * 1.609344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }
}
