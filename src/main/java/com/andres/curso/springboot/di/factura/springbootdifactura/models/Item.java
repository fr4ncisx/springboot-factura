package com.andres.curso.springboot.di.factura.springbootdifactura.models;

public class Item {

  private Product product;
  private int quantity;

  public Item() {}

  public Item(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getImporte() {
    return quantity * product.getPrice();
  }
}
