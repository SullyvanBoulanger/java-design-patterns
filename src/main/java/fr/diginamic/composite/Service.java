package fr.diginamic.composite;

import java.util.List;

public class Service implements IElement {

    private String name;
    private List<IElement> elements;

    public Service(String name, List<IElement> elements) {
        this.name = name;
        this.elements = elements;
    }

    @Override
    public double calcSalary() {
        return elements.stream().mapToDouble(IElement::calcSalary).sum();
    }
    
}
