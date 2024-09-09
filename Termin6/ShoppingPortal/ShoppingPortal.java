import java.util.List;

public record ShoppingPortal(String user, List<Product> products,
    ShoppingCart<Product> shoppingCart) {

  public void addProductToShoppingCart(Product product, int amount) {
    shoppingCart.addItem(product, amount);
  }

  public void clearShoppingCart() {
    shoppingCart.items().clear();
  }

  public void removeProductFromShoppingCart(Product product) {
    shoppingCart.removeItem(product);
  }

}
