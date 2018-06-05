package com.linqia.spring.utils.cockroachUtils.entity;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
//import org.jadira.usertype.dateandtime.joda.PersistentDateTime;
import javax.persistence.*;

@Entity
@Table(name = "conversion_pixel_daily")
public class ConversionPixelDaily {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "day", nullable = false)
    private DateTime day;

    @Column(name = "referer", nullable = false)
    private String referer;

    @Column(name = "total_clicks", nullable = false)
    private long totalClicks;

    @Column(name = "bot_clicks", nullable = false)
    private long botClicks;

    @Column(name = "valid_clicks", nullable = false)
    private long validClicks;

    @Column(name = "ranking", nullable = false)
    private int rank;

    @Column(name = "create_at", nullable = false)
    private DateTime createAt;

    @Column(name = "update_at", nullable = false)
    private DateTime updateAt;

    public ConversionPixelDaily() {
    }

    public ConversionPixelDaily(String url, DateTime day, String referer, long totalClicks, long botClicks, long validClicks, int rank, DateTime createAt, DateTime updateAt) {
        this.url = url;
        this.day = day;
        this.referer = referer;
        this.totalClicks = totalClicks;
        this.botClicks = botClicks;
        this.validClicks = validClicks;
        this.rank = rank;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
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

    public DateTime getDay() {
        return day;
    }

    public void setDay(DateTime day) {
        this.day = day;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public long getTotalClicks() {
        return totalClicks;
    }

    public void setTotalClicks(long totalClicks) {
        this.totalClicks = totalClicks;
    }

    public long getBotClicks() {
        return botClicks;
    }

    public void setBotClicks(long botClicks) {
        this.botClicks = botClicks;
    }

    public long getValidClicks() {
        return validClicks;
    }

    public void setValidClicks(long validClicks) {
        this.validClicks = validClicks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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
        return "ConversionPixelDaily{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", day=" + day +
                ", referer='" + referer + '\'' +
                ", totalClicks=" + totalClicks +
                ", botClicks=" + botClicks +
                ", validClicks=" + validClicks +
                ", rank=" + rank +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
