package tasks.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
    private Trader trader;//has A Relationship
    private int year;
    private int value;
}
