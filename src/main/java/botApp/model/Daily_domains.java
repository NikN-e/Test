package botApp.model;


import javax.persistence.*;

@Entity
@Table(name = "daily_domains")
public class Daily_domains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String damain_name;

    @Column(nullable = false)
    Integer hotness;

    @Column(nullable = false)
    Integer price;

    @Column(nullable = false)
    Integer x_value;

    @Column(nullable = false)
    Integer yandex_tic;

    @Column(nullable = false)
    Integer links;

    @Column(nullable = false)
    Integer visitors;

    @Column(nullable = false)
    String registrar;

    @Column(nullable = false)
    Integer old;

    @Column(nullable = false)
    String delete_date;

    @Column(nullable = false)
    Boolean rkn;

    @Column(nullable = false)
    Boolean judicial;

    @Column(nullable = false)
    Boolean block;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDamain_name() {
        return damain_name;
    }

    public void setDamain_name(String damain_name) {
        this.damain_name = damain_name;
    }

    public Integer getHotness() {
        return hotness;
    }

    public void setHotness(Integer hotness) {
        this.hotness = hotness;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getX_value() {
        return x_value;
    }

    public void setX_value(Integer x_value) {
        this.x_value = x_value;
    }

    public Integer getYandex_tic() {
        return yandex_tic;
    }

    public void setYandex_tic(Integer yandex_tic) {
        this.yandex_tic = yandex_tic;
    }

    public Integer getLinks() {
        return links;
    }

    public void setLinks(Integer links) {
        this.links = links;
    }

    public Integer getVisitors() {
        return visitors;
    }

    public void setVisitors(Integer visitors) {
        this.visitors = visitors;
    }

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public String getDelete_date() {
        return delete_date;
    }

    public void setDelete_date(String delete_date) {
        this.delete_date = delete_date;
    }

    public Boolean getRkn() {
        return rkn;
    }

    public void setRkn(Boolean rkn) {
        this.rkn = rkn;
    }

    public Boolean getJudicial() {
        return judicial;
    }

    public void setJudicial(Boolean judicial) {
        this.judicial = judicial;
    }

    public Boolean getBlock() {
        return block;
    }

    public void setBlock(Boolean block) {
        this.block = block;
    }
}
