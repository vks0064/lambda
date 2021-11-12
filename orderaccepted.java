import java.util.Arrays;
import java.util.List;
public class orderaccepted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Orders> orders=Arrays.asList(
                new Orders(12345),
                new Orders(15000),
                new Orders(54666),
                new Orders(7000));
        orders.stream()
                .filter(t->t.getPrice()>10000)
                .forEach(t -> System.out.println("order is accepted:"+t));

    }
}
class Orders{
    int price;

    public Orders(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                '}';
    }


	}


