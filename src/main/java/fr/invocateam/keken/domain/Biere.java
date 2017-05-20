package fr.invocateam.keken.domain;

import fr.invocateam.keken.domain.enumeration.TypeBiere;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Biere.
 */

@Document(collection = "biere")
public class Biere implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("nom")
    private String nom;

    @Field("type")
    private TypeBiere type;

    @Field("degree_alc")
    private Float degreeAlc;

    @Field("brasseur")
    private String brasseur;

    @Field("pays")
    private String pays;

    @Field("ville")
    private String ville;

    @Field("image")
    private String image;

    @Field("commentaires")
    private Set<String> commentaires = new LinkedHashSet<>();

    public Set<String> getCommentaires() {
        return this.commentaires;
    }

    public void setCommentaires(Set<String> commentaires) {
        this.commentaires = commentaires;
    }

    public Biere commentaires(Set<String> commentaires) {
        this.commentaires = commentaires;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public Biere nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeBiere getType() {
        return type;
    }

    public Biere type(TypeBiere type) {
        this.type = type;
        return this;
    }

    public void setType(TypeBiere type) {
        this.type = type;
    }

    public Float getDegreeAlc() {
        return degreeAlc;
    }

    public Biere degreeAlc(Float degreeAlc) {
        this.degreeAlc = degreeAlc;
        return this;
    }

    public void setDegreeAlc(Float degreeAlc) {
        this.degreeAlc = degreeAlc;
    }

    public String getBrasseur() {
        return brasseur;
    }

    public Biere brasseur(String brasseur) {
        this.brasseur = brasseur;
        return this;
    }

    public void setBrasseur(String brasseur) {
        this.brasseur = brasseur;
    }

    public String getPays() {
        return pays;
    }

    public Biere pays(String pays) {
        this.pays = pays;
        return this;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public Biere ville(String ville) {
        this.ville = ville;
        return this;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getImage() {
        return image;
    }

    public Biere image(String image) {
        this.image = image;
        return this;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Biere biere = (Biere) o;
        if (biere.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), biere.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Biere{" +
            "id=" + getId() +
            ", nom='" + getNom() + "'" +
            ", type='" + getType() + "'" +
            ", degreeAlc='" + getDegreeAlc() + "'" +
            ", brasseur='" + getBrasseur() + "'" +
            ", pays='" + getPays() + "'" +
            ", ville='" + getVille() + "'" +
            ", image='" + getImage() + "'" +
            "}";
    }
}
