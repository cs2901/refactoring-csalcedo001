final boolean found_MAC = platform.toUpperCase().indexOf("MAC") > -1;
final boolean found_IE= browser.toUpperCase().indexOf("IE") > -1;

void renderBanner() {
  if (found_MAC && found_IE && wasInitialized() && resize > 0 )
  {
    // do something
  }
}
