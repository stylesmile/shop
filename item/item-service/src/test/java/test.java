import com.shop.entity.Category;
import com.shop.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author StyleSmile
 * @date 2019/01/24
 */
public class test {

    @Autowired
    CategoryService categoryService;

    @Test
    public void test() {
        Category category = new Category();
        category.setName("1");
        category.setParentId(0L);
        categoryService.save(category);
    }

}
