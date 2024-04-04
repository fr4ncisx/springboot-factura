package com.andres.curso.springboot.di.factura.springbootdifactura;

import com.andres.curso.springboot.di.factura.springbootdifactura.models.Item;
import com.andres.curso.springboot.di.factura.springbootdifactura.models.Product;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

  @Bean("default")
  List<Item> itemsInvoice() {
    Product p1 = new Product("Camara Sony", 800);
    Product p2 = new Product("Bicicleta Santacruz", 1200);
    return Arrays.asList(
        new Item(p1, 2), new Item(p2, 4));
  }

  @Bean
  List<Item> itemsInvoiceOffice() {
    Product p1 = new Product("Camara Nikzon", 800);
    Product p2 = new Product("Bicicleta Santacruz", 1200);
    Product p3 = new Product("PlayStation 5", 750);
    Product p4 = new Product("Notebook Asus ROG", 2499);
    return Arrays.asList(
      new Item(p1, 12),
      new Item(p2, 7),
      new Item(p3, 1),
      new Item(p4, 2)
    );
  }
}
