package in.psk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.psk.entitys.ProductCategory;
@RepositoryRestResource(path="product-category",collectionResourceRel="productCategory")
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

}
