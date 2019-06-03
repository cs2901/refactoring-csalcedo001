double disabilityAmount() {
  if (seniority < 2 || monthsDisables > 12 || isPartTime) {
    return 0;
  }
  // Compute the disability amount.
  // ...
}
