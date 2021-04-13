package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class ConnectionEvent {
    static class Calendars {
        private int month;
        private int day;
        private int DOW;

        public Calendars(int month, int day, int DOW) {
            this.month = month;
            this.day = day;
            this.DOW = DOW;
        }

        public int getMonth() {
            return month;
        }
        public int getDay() {
            return day;
        }
        public int getDOW() {
            return DOW;
        }
    }

    static int solution(String start_date, String end_date, String[] login_dates) {
        int answer = 0;
        String[] DOWs = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int[] lastDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayWeekCount = 0;
        List<Calendars> loginDates = new ArrayList<>();

        // 시작 날짜
        String[] start = start_date.split(" ");
        String startDays = start[0];
        int startMonth = Integer.parseInt(startDays.split("/")[0]);
        int startDay = Integer.parseInt(startDays.split("/")[1]);
        String startDOW = start[1];

        Calendars startDate = new Calendars(startMonth, startDay, Arrays.binarySearch(DOWs, startDOW));

        for(String s : login_dates) {
            String[] sSplit = s.split("/");
            int m = Integer.parseInt(sSplit[0]);
            int d = Integer.parseInt(sSplit[1]);
            int dayDOW;

            if(startDate.getMonth() == m) {
                dayDOW = ((d - startDate.getDay()) % 7) - startDate.getDOW();
            } else {
                dayDOW = ((d + lastDays[d] - startDate.getDay()) % 7) - startDate.getDOW();
            }

            Calendars cal = new Calendars(m, d,dayDOW);
            loginDates.add(cal);
        }

        loginDates = loginDates.stream().sorted(Comparator.comparing(Calendars::getMonth).thenComparing(Calendars::getDay)).collect(Collectors.toList());


        for(int i = 0; i < loginDates.size() - 1; i++) {
            if(loginDates.get(i).getDOW() >= 0 && loginDates.get(i).getDOW() <= 4) {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String start_date = "05/04 MON";
        String end_date = "05/30";
        String[] login_dates = {"05/26", "05/25", "05/27", "05/10", "05/11", "05/23", "05/22", "05/21", "05/06", "05/09", "05/07", "05/08"};
        System.out.println(solution(start_date, end_date, login_dates));
    }
}
