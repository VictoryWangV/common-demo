package design.demo.filter.criteria;

import design.demo.filter.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Or操作
 */
public class OrCriteria implements Criteria {

    private final List<Criteria> criteriaList;

    public OrCriteria(Criteria... criteria) {
        this.criteriaList = Arrays.asList(criteria);
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Criteria criteria : criteriaList) {
            List<Person> list = criteria.meetCriteria(persons);
            for (Person person : list) {
                if (!result.contains(person)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}
