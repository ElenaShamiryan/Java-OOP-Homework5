
package DZ5;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    AttendanceService as = new AttendanceService();
    AttendanceView av = new AttendanceView();

    Presenter pr = new Presenter(as, av);

    List att1 = new ArrayList<>();
    
    List att2 = new ArrayList<>();
    att2.add(new Attendance(LocalDate.of(2023, 01, 16), true));
    att2.add(new Attendance(LocalDate.of(2022, 12, 19), true));
    att2.add(new Attendance(LocalDate.of(2022, 12, 25), true));
    att2.add(new Attendance(LocalDate.of(2022, 12, 20), false));
    
    List att3 = new ArrayList<>();
    att3.add(new Attendance(LocalDate.of(2023, 01, 16), false));
    att3.add(new Attendance(LocalDate.of(2022, 12, 19), true));
    att3.add(new Attendance(LocalDate.of(2022, 12, 25), false));
    att3.add(new Attendance(LocalDate.of(2022, 12, 20), false));
    
    att1.add(new Attendance(LocalDate.of(2023, 01, 16), false));
    att1.add(new Attendance(LocalDate.of(2022, 12, 19), true));
    att1.add(new Attendance(LocalDate.of(2022, 12, 25), false));
    att1.add(new Attendance(LocalDate.of(2022, 12, 20), false));

    Student student1 = new Student("Иван", "Иванов", 5, att1);
    Student student2 = new Student("Кристина", "Смирнова", 5, att2);
    Student student3 = new Student("Тамара", "Петрова", 5, att3);

    as.addUser(student1);
    as.addUser(student2);
    as.addUser(student3);

    pr.buttonClick();

  }

}