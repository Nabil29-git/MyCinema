package ma.emsi.cinema.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "p1",types = {ma.emsi.cinema.entities.Projection.class})
public interface ProjectionProj {

	public Long getId();
	public double getPrix();
	public Date getDateProjection();
	public Film getFilm();
	public Salle getSalle();
	public Seance getSeance();
	public List<Ticket> getTickets();
}
