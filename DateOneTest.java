public class DateOneTest {
    public static void main(String[] args) {
        DateOne d = new DateOne(2024,2,29);
        System.out.println("日期為:" +d.getDate());
        DateOne d2 = new DateOne(2025,9,30);
        System.out.println("日期為:" +d2.getDate());
        System.out.println(d.setDate(2025, 2, 30)?"日期修改成功!":"日期修改失敗!");
        System.out.println("日期為:"+d2.getDate());
    }
}
