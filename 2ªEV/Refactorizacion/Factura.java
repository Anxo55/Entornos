package Refactorizacion;

import java.util.Date;

class Cliente {
   String nombreCliente;
   String nifCliente;
   String dirCliente;
}

class Empresa {
   String cifEmpresa;
   String dirEmpresa;
}

class Articulo {
   String nombre;
   float precio;
}

public class Factura {
   String Numero;
   Date vencimiento;
   Articulo[] articulos;
   Empresa empresa;
   Cliente cliente;

   void imprime_factura_por_consola() {
       System.out.println(getDocumentoFactura());
   }

   void genearPdf() {
       // generadorPdf(getDocumentoFactura());
   }

   void enviarEmail() {
       // mail("gonzalezm.angel@gmail.com", "Envio factura", getDocumentoFactura())
   }

   StringBuilder getCabeceraDocumentoFactura(StringBuilder texto) {
       // Pintamos la cabecera
       texto.append("FACTURA n' " + Numero);
       texto.append("\n");
       texto.append("Fecha: " + new Date());
       texto.append("\n");
       return texto;
   }

   StringBuilder getDatosEmpresaDocumentoFactura(StringBuilder texto) {
       // Pintamos los datos de la empresa que genera la factura
       texto.append("CEBEM SL");
       texto.append("\n");
       texto.append("CIF: " + empresa.cifEmpresa);
       texto.append("\n");
       texto.append("Direcci'n" + empresa.dirEmpresa);
       texto.append("\n");
       texto.append("36204 Vigo (Pontevedra)");
       texto.append("\n");
       return texto;
   }

   StringBuilder getDatosClienteDocumentoFactura(StringBuilder texto) {

       // Pintamos los datos del cliente
       texto.append("CLIENTE:");
       texto.append("\n");
       texto.append("--------------------------");
       texto.append("\n");
       texto.append("Nombre:" + cliente.nombreCliente);
       texto.append("\n");
       texto.append("NIF: " + cliente.nifCliente);
       texto.append("\n");
       texto.append("Direcci'n" + cliente.dirCliente);
       texto.append("\n");
       texto.append("36204 Vigo (Pontevedra)");
       texto.append("\n");
       return texto;
   }

   StringBuilder getDatosArticulosDocumentoFactura(StringBuilder texto) {
       // Pintamos los datos de la factura
       texto.append("ARTICULOS:");
       texto.append("\n");
       texto.append("--------------------------");
       texto.append("\n");
       float total = 0;
       for (int i = 0; i < articulos.length; i++) {
           texto.append(articulos[i].nombre + "      " + articulos[i].precio);
           total = total + articulos[i].precio;
       }
       texto.append("                TOTAL:        " + total);
       texto.append("\n");
       return texto;

   }

   String getDocumentoFactura() {
       StringBuilder texto = new StringBuilder();

       texto = getCabeceraDocumentoFactura(texto);
       texto = getDatosEmpresaDocumentoFactura(texto);
       texto = getDatosClienteDocumentoFactura(texto);
       texto = getDatosArticulosDocumentoFactura(texto);

       // Pintamos el pie de la factura
       texto.append("Vencimiento: " + vencimiento.toString());
       return texto.toString();

   }
}

