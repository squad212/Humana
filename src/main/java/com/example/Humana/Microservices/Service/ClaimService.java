package com.example.Humana.Microservices.Service;

import com.example.Humana.Microservices.Response.ClaimDetails;


import java.util.ArrayList;

public class ClaimService {
    private ArrayList<ClaimDetails> claimDetails =new ArrayList<>();//Declaration

   private void createInitialList(){
       ClaimDetails claim1= ClaimDetails.builder()
               .claimId(100)
               .claimNumbers(23445)
               .claimAmount(111)
               .drugs("test drug")
               .claims(002)
               .build();
       claimDetails.add(claim1);
   }}
//   public ClaimDetails getClaimDetails(int id){
//       if(CollectionUtils.isEmpty(claimDetails())){
//           createInitialList();
//       }
//   }
//    ClaimDetails claimDetails = new ClaimDetails();
//    for (ClaimDetails claim: claimDetails){
//        if(claim.getClaimId() == id){
//            claimDetails = claim;
//        }
//    }
//    return claimDetails;
//
//    }
//
//    public int addClaimDetails(ClaimDetails claimDetails){
//        claimDetails.add(claimDetails);
//        return claimDetails.getClaimId();
//    }
//}