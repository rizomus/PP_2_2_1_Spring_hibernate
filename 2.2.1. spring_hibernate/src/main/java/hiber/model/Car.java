package hiber.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private long carId;

    @Column
    private String model;

    @Column
    private int series;


    @OneToOne(mappedBy = "car")
    User user;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString () {
        return this.model + " " + this.series;
    }

    public void setId(Long id) {
        this.carId = id;
    }

    public Long getId() {
        return carId;
    }
}
