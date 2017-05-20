package fr.invocateam.keken.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Commentaire.
 */

@Document(collection = "commentaire")
public class Commentaire implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("biere_id")
    private String biereId;

    @Field("user_id")
    private String userId;

    @Field("note")
    private Float note;

    @Field("commentaire")
    private String commentaire;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBiereId() {
        return biereId;
    }

    public Commentaire biereId(String biereId) {
        this.biereId = biereId;
        return this;
    }

    public void setBiereId(String biereId) {
        this.biereId = biereId;
    }

    public String getUserId() {
        return userId;
    }

    public Commentaire userId(String userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Float getNote() {
        return note;
    }

    public Commentaire note(Float note) {
        this.note = note;
        return this;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Commentaire commentaire(String commentaire) {
        this.commentaire = commentaire;
        return this;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Commentaire commentaire = (Commentaire) o;
        if (commentaire.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), commentaire.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Commentaire{" +
            "id=" + getId() +
            ", biereId='" + getBiereId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", note='" + getNote() + "'" +
            ", commentaire='" + getCommentaire() + "'" +
            "}";
    }
}
