package model;
import javafx.scene.chart.PieChart;
import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Income {
    private int id;
    private Date date;
    private Time time;
    private int amount;
    private String remarks;
    private String category;
    private String paymentMode;

    @ToString.Exclude
    private int userId;


}
