package cl.cokke.Viajes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@SpringJUnitConfig(ViajesApplication.class)
@SpringBootTest
class ViajesApplicationTests implements Specification {

	def 'Prueba de ejemplo'() {
		given:
		def a = 2
		def b = 3

		when:
		def result = a + b

		then:
		result == 5
	}

	@Override
	public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
		return null;
	}

	@Override
	public Specification and(Specification other) {
		return Specification.super.and(other);
	}

	@Override
	public Specification or(Specification other) {
		return Specification.super.or(other);
	}
}
