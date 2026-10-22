package service;

import java.rmi.Naming;

public class ClientRMI {

    public static void main(String[] args) {
        try {
            EBanqueRemote stub = (EBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
            System.out.println(stub.conversion(1000));
            System.out.println(stub.GetServeurDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}