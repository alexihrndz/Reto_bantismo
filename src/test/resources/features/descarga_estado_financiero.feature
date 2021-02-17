#language: es
Característica: descargar estado financiero
  Yo como usuario de aerocivil requiero descargar un estado financiero

  @descargaEstadoFinanciero
  Escenario: Descarga de estado financiero
    Dado que yo como usuario quiero descargar el estado financiero
      | estadoFinanciero                                         |
      | Estado de Situacion Financiera a 30 de noviembre de 2020 |
    Cuando realice la descarga del estado financiero
    Entonces puedo ver el estado financiero solicitado

