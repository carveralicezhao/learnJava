package pojo;

/**
 * Created by carver on 17/3/14.
 */
public class User {
    private int id;

    private int userid;

    private int price;

    private String name;

    public User(){

    }

    public User(int id, int userid, int price, String name) {
        this.id = id;
        this.userid = userid;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userid=" + userid +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
