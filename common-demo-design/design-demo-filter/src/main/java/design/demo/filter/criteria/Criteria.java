package design.demo.filter.criteria;

import design.demo.filter.model.Person;

import java.util.List;

/**
 * 过滤准则（标准）
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
