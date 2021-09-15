package com.example.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogControl implements Serializable {
	private static final long serialVersionUID = 4656918403008673643L;
	private String transaccion;
    private String fechaTransaccion;
    private String horaTransaccion;
    private String idCanal;
    private String idUsuario;
    private String direccionIp;
    private String op;
}
