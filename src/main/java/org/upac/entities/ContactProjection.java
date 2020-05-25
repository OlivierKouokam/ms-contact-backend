package org.upac.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Contact.class)
public interface ContactProjection {
	public String getNom();
	public String getEmail();
	public Long getTel();
}
