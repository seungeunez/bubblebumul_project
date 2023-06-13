package com.example.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Reservation {
    private String no;

    private String cid;

    private Long mno;

    private Date rdate;

    private String rvdate;

    private String rvtime;

    private String state="예약 완료";
}
