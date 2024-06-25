package fr.diginamic.composite;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CompositeTest {

    @Test
    public void shouldReturnCorrectAmount() {
        List<IElement> elements = new ArrayList<>();
        elements.add(new Employee("null", "null", 2000));
        elements.add(new Employee("null", "null", 3400));
        elements.add(new Employee("null", "null", 1250));
        elements.add(new Service(null, List.of(
                new Employee(null, null, 1500),
                new Employee(null, null, 2200))));

        Service service = new Service("Chats !", elements);

        assertEquals(10_350, service.calcSalary(), 0.0001);
    }
}
