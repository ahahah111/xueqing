package com.xueqing.dto;

import com.xueqing.entity.Attendance;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StuDto {

    private List<Attendance> attendanceList = new ArrayList<>();
}
