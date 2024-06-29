package ppawlina.jaz_s27084_nbp;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.time.*;

import java.util.Date;

@Schema

@Entity
public class NBP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(example = "1", required = true)
    private int id;
    @Schema(example = "PLN", required = true)
    private String currency;
    @Schema(example = "2008-09-12", required = true)
    private Date datestart;
    @Schema(example = "2008-09-15", required = true)
    private Date dateend;
    @Schema(example = "4,32", required = true)
    private double value;
    @Schema(example = "2008-09-15-9:38", required = true)
    private LocalDateTime querydate;


    public NBP() {
    }

    public NBP(int id, String currency, Date datestart, Date dateend, double value, LocalDateTime querydate) {
        this.id = id;
        this.currency = currency;
        this.datestart = datestart;
        this.dateend = dateend;
        this.value = value;
        this.querydate = querydate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDateTime getQuerydate() {
        return querydate;
    }

    public void setQuerydate(LocalDateTime querydate) {
        this.querydate = querydate;
    }
}
