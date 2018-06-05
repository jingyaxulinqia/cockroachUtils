package com.linqia.spring.utils.cockroachUtils.entity;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;


@Entity
@Table(name = "conversion_pixel_hourly")
public class ConversionPixelHourly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "day_hour", nullable = false)
    private DateTime dayHour;

    @Column(name = "referer", nullable = false)
    private String referer;

    @Column(name = "total_clicks", nullable = false)
    private int totalClicks;

    @Column(name = "bot_clicks", nullable = false)
    private int botClicks;

    @Column(name = "valid_clicks", nullable = false)
    private int validClicks;

    @Column(name = "is_new", nullable = false)
    private Boolean isNew;

    @Column(name = "create_at", nullable = false)
    private DateTime createAt;

    @Column(name = "update_at", nullable = false)
    private DateTime updateAt;

    public ConversionPixelHourly() {
    }

    public ConversionPixelHourly(String url, DateTime dayHour, String referer, int totalClicks, int botClicks, int validClicks, Boolean isNew, DateTime createAt, DateTime updateAt) {
        this.url = url;
        this.dayHour = dayHour;
        this.referer = referer;
        this.totalClicks = totalClicks;
        this.botClicks = botClicks;
        this.validClicks = validClicks;
        this.isNew = isNew;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DateTime getDayHour() {
        return dayHour;
    }

    public void setDayHour(DateTime dayHour) {
        this.dayHour = dayHour;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public int getTotalClicks() {
        return totalClicks;
    }

    public void setTotalClicks(int totalClicks) {
        this.totalClicks = totalClicks;
    }

    public int getBotClicks() {
        return botClicks;
    }

    public void setBotClicks(int botClicks) {
        this.botClicks = botClicks;
    }

    public int getValidClicks() {
        return validClicks;
    }

    public void setValidClicks(int validClicks) {
        this.validClicks = validClicks;
    }

    public DateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(DateTime createAt) {
        this.createAt = createAt;
    }

    public DateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(DateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "ConversionPixelHourly{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", dayHour=" + dayHour +
                ", referer='" + referer + '\'' +
                ", totalClicks=" + totalClicks +
                ", botClicks=" + botClicks +
                ", validClicks=" + validClicks +
                ", isNew=" + isNew +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
