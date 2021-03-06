package hu.tb.init;

import hu.tb.product.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Tivadar Bocz on 2016.10.03..
 */
@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
/*
        Product shirt = new Product();
        shirt.setDescription("Spring Framework Guru Shirt");
        shirt.setPrice(new BigDecimal("18.95"));
        shirt.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setDescription("Spring Framework Guru Mug");
        mug.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_coffee_mug-r11e7694903c348e1a667dfd2f1474d95_x7j54_8byvr_512.jpg");
        mug.setProductId("168639393495335947");
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());


        User user = new User();
        user.setId(1);
        user.setUserName("user");
        user.setPassword("user");
        user.setEnabled(true);

        Set<User> userSet = new HashSet<>();
        userSet.add(user);

        Set<Role> roleSet = new HashSet<>();
        Role role = new Role();
        role.setId(1);
        role.setUsers(userSet);
        roleSet.add(role);
        user.setRoles(roleSet);*/
    }
}