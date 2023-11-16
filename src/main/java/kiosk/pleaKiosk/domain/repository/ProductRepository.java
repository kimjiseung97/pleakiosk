package kiosk.pleaKiosk.domain.repository;

import kiosk.pleaKiosk.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long>,ProductCustom {

}
