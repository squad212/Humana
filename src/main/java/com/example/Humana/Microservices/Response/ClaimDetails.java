package com.example.Humana.Microservices.Response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class ClaimDetails {
    private int claims;
    private long claimNumbers;
    private int claimAmount;
    private String drugs;
    private int claimId;
}
