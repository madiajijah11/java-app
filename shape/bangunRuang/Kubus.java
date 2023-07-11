package shape.bangunRuang;

import shape.bangunDatar.Persegi;

/*
 * INHERITANCE: PEWARISAN SUATU CLASS KE CLASS LAINNYA
 * 2 KEYWORDS
 * 1. EXTENDS: pewarisan yg dilakukan untuk jenis class yg sama, class - class atau interface - interface
 * 2. IMPLEMENTS: pewarisan yg dilakukan dari interface - class
 */
public class Kubus extends Persegi implements BangunRuang {

  @Override
  public String getShapeName() {
    return "=== KUBUS ===";
  }

  @Override
  public Double getVolume() {
    return super.getLuas() * super.getSisi();
  }

  @Override
  public void getInformation() {
    super.getInformation();
    System.out.println("Volume: " + this.getVolume());
  }

}
