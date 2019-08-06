package com.felixlabs.fboxapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "BUG_ID_SEQ", sequenceName = "BUG_ID_SEQ", allocationSize = 1)
public class Bug {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BUG_ID_SEQ")
	private Integer _id;
	
	private String dominio;
	private String qaProjeto;
	private String projeto;
	private String id;
	private String status;
	private String responsible;
	private String environmentType;
	private String priority;
	private String severity;
	private String sistemaCorrecao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bug", cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<Comment>();
	
	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String getDominio() {
		return dominio;
	}
	
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	public String getQaProjeto() {
		return qaProjeto;
	}
	
	public void setQaProjeto(String qaProjeto) {
		this.qaProjeto = qaProjeto;
	}
	
	public String getProjeto() {
		return projeto;
	}
	
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getResponsible() {
		return responsible;
	}
	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
	
	public String getEnvironmentType() {
		return environmentType;
	}
	
	public void setEnvironmentType(String environmentType) {
		this.environmentType = environmentType;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String getSeverity() {
		return severity;
	}
	
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	public String getSistemaCorrecao() {
		return sistemaCorrecao;
	}
	
	public void setSistemaCorrecao(String sistemaCorrecao) {
		this.sistemaCorrecao = sistemaCorrecao;
	}
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bug other = (Bug) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
