class PizzaDelivery {
  // ...
  boolean moreThanFiveLateDeliveries() {
    return numberOfLateDeliveries > 5;
  }
  int getRating() {
    return moreThanFiveLateDeliveries() ? 2 : 1;
  }
}
