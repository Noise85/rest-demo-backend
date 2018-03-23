package ch.adesso.edms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PUBLISHER")
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_PUB")
	@SequenceGenerator(sequenceName="SEQ_PUB", initialValue=1, name = "SEQ_PUB")
	private Integer id;
	private String name;
	
	public Publisher(String name) {
		this.id=null;
		this.name = name;
	}
	
	public Publisher() {
		this(null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
