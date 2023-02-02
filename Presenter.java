package DZ5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Presenter {

  AttendanceService attendanceService;
  AttendanceView attendanceView;

  public Presenter(AttendanceService attendanceService, AttendanceView attendanceView) {
    this.attendanceService = attendanceService;
    this.attendanceView = attendanceView;
  }

  public void buttonClick() {
    int number = attendanceView.getActionNumber();
    if (number == 1) {
      attendanceView.PrintListAttendance(attendanceService);
    }else if (number == 2) {
      attendanceView.SortIncreaseListAttendance(attendanceService);
    }else  attendanceView.ListLowAttendance(attendanceService);
    }


}