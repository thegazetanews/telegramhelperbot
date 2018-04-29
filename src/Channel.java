

public class Channel {

    private String title;
    private String cat;
    private String desc;
    private String logo;
    private String link;
    private long vote;
    private long timeStamp;
    private int rate;

    public Channel(String title, String cat, String desc, String logo, String link, long vote, long timeStamp, int rate) {
        this.title = title;
        this.cat = cat;
        this.desc = desc;
        this.logo = logo;
        this.link = link;
        this.vote = vote;
        this.timeStamp = timeStamp;
        this.rate = rate;
    }

    public Channel() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getVote() {
        return vote;
    }

    public void setVote(long vote) {
        this.vote = vote;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
