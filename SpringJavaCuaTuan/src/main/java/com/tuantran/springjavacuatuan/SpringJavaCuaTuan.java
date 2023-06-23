/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tuantran.springjavacuatuan;

import com.tuantran.pojo.Category;
import com.tuantran.repository.ProductRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class SpringJavaCuaTuan {

    public static void main(String[] args) {
//       try (Session session = HibernateUltils.getFactory().openSession()) {
//           Query query = session.createQuery("FROM Category");
//           
//           List<Category> cates = query.getResultList();
//           
//           cates.forEach(c -> System.out.println(c.getName()));
//       }

        Map<String, String> params = new HashMap<>();
        params.put("price", "35000000");
        ProductRepository pre = new ProductRepository();
        pre.getProducts(params).forEach(p -> System.out.printf("%d - %s - %f\n", p.getId(), p.getName(), p.getPrice()));
    }
}
