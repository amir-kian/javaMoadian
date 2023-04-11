/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author programmer 6
 */
public class Mavenproject1 {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
      ApiConfig apiConfig = new ApiConfig().signatory(new 
InMemorySignatory(PRIVATE_KEY, null));
TransferApi transferApi = new ObjectTransferApiImpl(apiConfig);
TaxApi taxApi = new DefaultTaxApiClient(transferApi, CLIENT_ID);
this.taxApi.getServerInformation();
taxApi.requestToken();
InvoiceDto invoiceDto = new InvoiceDto();
taxApi.sendInvoices(Collections.singletonList(invoiceDto));

    }
}
