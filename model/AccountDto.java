package model;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AccountDto {
    private Long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDateTime transactionDate;
}
