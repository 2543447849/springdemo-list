package com.gaussic.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;

/**
 * Created by dzkan on 2016/3/8.
 */
@Entity
@Table(name = "admin_specis", schema = "test", catalog = "")
public class SpeciEntity {
    private int id;
    private String name;
    private String nickname;
    private String introduction;
    private String place;
    private Date create_time;
    private Date modify_time;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 45)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "introduction", nullable = false, length = 45)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "place", nullable = false, length = 45)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Basic
    @Column(name = "create_time", nullable = false, length = 45)
    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Basic
    @Column(name = "modify_time", nullable = false, length = 45)
    public Date getModify_time() {
        return modify_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpeciEntity)) return false;

        SpeciEntity that = (SpeciEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (create_time != null ? !create_time.equals(that.create_time) : that.create_time != null) return false;
        return modify_time != null ? modify_time.equals(that.modify_time) : that.modify_time == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (create_time != null ? create_time.hashCode() : 0);
        result = 31 * result + (modify_time != null ? modify_time.hashCode() : 0);
        return result;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;


    }
}
