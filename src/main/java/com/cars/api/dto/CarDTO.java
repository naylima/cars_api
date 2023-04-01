package com.cars.api.dto;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarDTO(
  @NotBlank
  String modelo, 

  @NotBlank
  String fabricante,

  @Past 
  Date dataFabricacao,

  @Digits(integer=6, fraction=2)
  BigDecimal valor,

  @NotNull
  int anoModelo
  ) {
  
}
