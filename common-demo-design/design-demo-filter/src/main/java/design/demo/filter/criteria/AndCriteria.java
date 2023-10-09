package design.demo.filter.criteria;

import design.demo.filter.model.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * And操作
 */
public class AndCriteria implements Criteria {

    private final List<Criteria> criteriaList;

    public AndCriteria(Criteria... criteria) {
        criteriaList = Arrays.asList(criteria);
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        Iterator<Criteria> iterator = criteriaList.iterator();
        while (iterator.hasNext()) {
            persons = iterator.next().meetCriteria(persons);
        }
        return persons;
    }
}
