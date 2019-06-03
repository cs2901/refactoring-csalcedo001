class PizzaDelivery {
  // ...
  int getRating() {
  	boolean moreThanFiveLateDeliveries = numberOfLateDeliveries > 5;

    return moreThanFiveLateDeliveries ? 2 : 1;
  }
}
