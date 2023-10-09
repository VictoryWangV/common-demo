package design.demo.filter.criteria;

import design.demo.filter.model.MaritalStatus;
import design.demo.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出单身狗
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (MaritalStatus.Single.equals(person.getMaritalStatus())) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
