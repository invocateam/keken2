package fr.invocateam.keken.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A UserExtra.
 */

@Document(collection = "user_extra")
public class UserExtra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("biere_favorite_id")
    private String biereFavoriteId;

    @Field("user_id")
    private String userId;

    @Field("image")
    private String image;

    @Field("bieres_likes_id")
    private Set<String> biereLikesId = new LinkedHashSet<>();

    @Field("commentaires_id")
    private Set<String> commentairesId = new LinkedHashSet<>();

    @Field("amis_id")
    private Set<String> amisId = new LinkedHashSet<>();

    public Set<String> getBiereLikesId() {
        return this.biereLikesId;
    }

    public void setBiereLikesId(Set<String> biereLikesId) {
        this.biereLikesId = biereLikesId;
    }

    public UserExtra biereLikesId(Set<String> biereLikesId) {
        this.biereLikesId = biereLikesId;
        return this;
    }

    public UserExtra commentairesId(Set<String> commentairesId) {
        this.commentairesId = commentairesId;
        return this;
    }

    public Set<String> getCommentairesId() {
        return this.commentairesId;
    }

    public void setCommentairesId(Set<String> commentairesId) {
        this.commentairesId = commentairesId;
    }

    public Set<String> getAmisId() {
        return this.amisId;
    }

    public void setAmisId(Set<String> amisId) {
        this.amisId = amisId;
    }

    public UserExtra amisId(Set<String> amisId) {
        this.amisId = amisId;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBiereFavoriteId() {
        return biereFavoriteId;
    }

    public UserExtra biereFavoriteId(String biereFavoriteId) {
        this.biereFavoriteId = biereFavoriteId;
        return this;
    }

    public void setBiereFavoriteId(String biereFavoriteId) {
        this.biereFavoriteId = biereFavoriteId;
    }

    public String getUserId() {
        return userId;
    }

    public UserExtra userId(String userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImage() {
        return image;
    }

    public UserExtra image(String image) {
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
        UserExtra userExtra = (UserExtra) o;
        if (userExtra.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userExtra.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserExtra{" +
            "id=" + getId() +
            ", biereFavoriteId='" + getBiereFavoriteId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", image='" + getImage() + "'" +
            "}";
    }
}
