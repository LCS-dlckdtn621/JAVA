package review.first;

public class OrderInfo {
    public String number;
    public String phoneNumber;
    public String address;
    public String date;
    public String dateTime;
    public int price;
    public String menuNumber;

    public OrderInfo(String number, String phoneNumber, String address, String date,
                     String dateTime, int price, String menuNumber){
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.dateTime = dateTime;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public void showOrderInfo(){
        System.out.println("주문 접수 번호 : "+this.number);
        System.out.println("주문 핸드폰 번호 : "+this.phoneNumber);
        System.out.println("주문 집 주소 : "+this.address);
        System.out.println("주문 날짜 : "+this.date);
        System.out.println("주문 시간 : "+this.dateTime);
        System.out.println("주문 가격 : "+this.price);
        System.out.println("메뉴 번호 : "+this.menuNumber);
    }

}
