package samples.datetime;
import java.util.Calendar;

public class MonthlyCalendar {
  private int year;

  private int month;

  private int[][] calendarMatrix = new int[6][7];

  private int startDay;

  private int lastDate;
  /**
   * �J�����_�[�\�I�u�W�F�N�g���쐬���܂��B
   * @param year ����N(..., 2005, 2006, 2007, ...)
   * @param month ��(1, 2, 3, ..., 10, 11, 12)
   */
  public MonthlyCalendar(int year, int month) {
    this.year = year;
    this.month = month;
    calcFields();
  }

  private void calcFields() {
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    // ���̏��߂̗j�������߂܂��B
    calendar.set(year, month - 1, 1); // ����: 1��: 0, 2��: 1, ...
    startDay = calendar.get(Calendar.DAY_OF_WEEK);
    // �����̓��t�����߂܂��B
    calendar.add(Calendar.MONTH, 1);
    calendar.add(Calendar.DATE, -1);
    lastDate = calendar.get(Calendar.DATE);
    // �J�����_�[�\���쐬���܂��B
    int row = 0;
    int column = startDay - 1; // startDay: ���j�� = 1, ���j�� = 2, ...
    for (int date = 1; date <= lastDate; date++) {
      calendarMatrix[row][column] = date;
      if (column == 6) {
        row++;
        column = 0;
      } else {
        column++;
      }
    }
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    loop: for (int i = 0; i < calendarMatrix.length; i++) {
      for (int j = 0; j < calendarMatrix[i].length; j++) {
        int day = calendarMatrix[i][j];
        if (day == 0) {
          if (i != 0) {
            // �J�����_�[�\���̌����ȍ~�̃Z���ɓ��B
            break loop;
          }
          sb.append("   ");
        } else if (day < 10) {
          sb.append("  ").append(day);
        } else {
          sb.append(" ").append(day);
        }
      }
      sb.append("\r\n");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    for (int month = 1; month <= 12; month++) {
      System.out.println(currentYear + "�N" + month + "��");
      System.out.println(new MonthlyCalendar(currentYear, month));
    }
  }
}