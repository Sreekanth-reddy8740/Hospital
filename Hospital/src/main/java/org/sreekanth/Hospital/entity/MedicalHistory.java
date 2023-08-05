package org.sreekanth.Hospital.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "patient_name")
	private String patientName;
	@OneToOne
	@JoinColumn
	@Column(nullable = false)
	private Person person;
	@OneToMany
	private List<MedicalObservation> medicalObservations;
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<MedicalObservation> getMedicalObservations() {
		return medicalObservations;
	}
	public void setMedicalObservations(List<MedicalObservation> medicalObservations) {
		this.medicalObservations = medicalObservations;
	}
	
}
