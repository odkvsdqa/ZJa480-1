public class DateOne {
    private int year = 2025;
    private int month = 1;
    private int day = 1;

    public DateOne(){}
    public DateOne(int y, int m,int d){
        this.setDate(y, m, d);
    }
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

      public String getDate(){
        if(day == 0 ||month == 0 || year ==0){
            return "日期未設定!";
        }
        return year + "/" +  month + "/"+day;
      }
    public boolean setDate(int year,int month,int day){
        if(year<2000||year>2030){
            return false;
        }
        if(month <1||month >12){
            return false;
        }
        int days = calDaysInMonth(year, month);
        if(day<1||day>days){
            return false;
        }
        this.year = year;
        this.month = month;
        this.day = day;
        return true;
    }

    private int calDaysInMonth(int y,int m){
        if(y > 0 &&m >=1 && m <13){
             if((y % 4 == 0 & y % 100 != 0) || y % 400 == 0 &m ==2){

                    return 29;
                }
            }
            else if(y % 4 == 0 & y % 100 == 0 & y % 400 != 0){
                    return 28;
                }

            else if(y % 4 == 0){
                return 29;
                }  
            else{
                    return 28;
                }
            if(m == 1 || m == 3|| m == 5|| m == 7|| m == 8|| m == 10|| m == 12){
                return 31;
            }
            else if((m == 4 || m == 6|| m == 9|| m == 11))
            {
                return 30;
            }
            else{
                System.out.println("錯誤日期");
            }
            return 0;
    }
    // private int calDaysInMonth(int y,int m){
    //     switch (m) {
    //         case 1:
    //         case 3:
    //         case 5:
    //         case 7:
    //         case 8:
    //         case 10:
    //         case 12:
    //         System.out.println("有進來18");
    //            return 31;
    //         case 4:
    //         case 6:
    //         case 9:
    //         case 11:
    //         System.out.println("有進來19");
    //            return 30;
    //         case 2:
    //         System.out.println("有進來20");
    //         if((y % 4 == 0 && y%100 !=0) || y % 400 == 0 ){
    //             return 29;
    //         }
    //         else{
    //             System.out.println("有進來21");
    //             return 28;
    //         }
    //         default:
    //             return 0;
    //     }
    // }
}


