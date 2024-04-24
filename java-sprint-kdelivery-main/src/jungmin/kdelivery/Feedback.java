package jungmin.kdelivery;

public class Feedback {
  private String customerName;
  private String shopName;
  private String foodName;
  private int grade;

  /**
   * @Feedback() : 정보를 저장합니다
   */

  public Feedback() {
    this.customerName = customerName;
    this.shopName = shopName;
    this.foodName = foodName;
    this.grade = grade;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getShopName() {
    return shopName;
  }

  public String getFoodName() {
    return foodName;
  }

  public int getGrade() {
    return grade;
  }

  /**
   * @getStars() : 사용자가 입력한 점수가 별점으로 전환
   */
  public void getStars() {
    int star = getGrade();
    if (star == 1) {
      System.out.println("★");
    } else if (star == 2) {
      System.out.println("★★");
    } else if (star == 3) {
      System.out.println("★★★");
    } else if (star == 4) {
      System.out.println("★★★★");
    } else {
      System.out.println("★★★★★");
    }
  }



  /**
   * @printInfo() : 출력
   */

}
