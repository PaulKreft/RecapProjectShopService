import de.neuefische.PaulKreft.OrderMapRepo;
import de.neuefische.PaulKreft.ShopService;

public class Main {
    OrderMapRepo orderMapRepo = new OrderMapRepo();

    ShopService shopService = new ShopService(orderMapRepo);
}
