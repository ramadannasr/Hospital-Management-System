/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcih_hospital;

import static fcih_hospital.Administration.admin_data;
import static fcih_hospital.Archive.archiveEmployee_data;
import static fcih_hospital.Cashier.cash_data;
import static fcih_hospital.Doctor.docter_data;
import static fcih_hospital.Patient.Patients_data;
import static fcih_hospital.Receptionist.recep_data;
import static fcih_hospital.SuperAdmin.super_data;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author romyo
 */
public class hosp_System implements Serializable{
    
     public static ArrayList<Patient> PatientWhoCheckupDateSoon(myExceptions Valid) {
        int res;
        ArrayList<Patient> list= new ArrayList<>();
        for (Patient obj : Patients_data) {
            res = Valid.isValidDate(obj.getCheckup_date());
            if (res == 1 || res == 2) {
                list.add(obj);
            }
        }
        if(!list.isEmpty())
            return list;
        else return null;
    }
     
     
     
      public static int generateUId(String IdType) {
        int Id;
        switch (IdType) {
            case "Patient":
                Id = 20140000;

                if (Patients_data.isEmpty()) {
                    return Id;
                } else {
                    Id = Patients_data.get(Patients_data.size() - 1).getId();
                    return ++Id;
                }

            case "Receptionist":
                Id = 200;

                if (recep_data.isEmpty()) {
                    return Id;
                } else {
                    Id = recep_data.get(recep_data.size() - 1).getId();
                    return ++Id;

                }

            case "Doctor":
                Id = 3000;

                if (docter_data.isEmpty()) {
                    return Id;
                } else {
                    Id = docter_data.get(docter_data.size() - 1).getId();
                    return ++Id;
                }

            case "Administrator":
                Id = 4000;

                if (admin_data.isEmpty()) {
                    return Id;
                } else {
                    Id = admin_data.get(admin_data.size() - 1).getId();
                    return ++Id;
                }
            case "SuperAdministrator":
                Id = 10000;

                if (super_data.isEmpty()) {
                    return Id;
                } else {
                    Id = super_data.get(super_data.size() - 1).getId();
                    return ++Id;
                }
            case "Cashier":
                Id = 20000;

                if (cash_data.isEmpty()) {
                    return Id;
                } else {
                    Id = cash_data.get(cash_data.size() - 1).getId();
                    return ++Id;
                }
            case "ArchiveEmployee":
                Id = 100000;

                if (archiveEmployee_data.isEmpty()) {
                    return Id;
                } else {
                    Id = archiveEmployee_data.get(archiveEmployee_data.size() - 1).getId();
                    return ++Id;
                }
            case "Nurse":
                Id = 200000;

                if (Nursing.nursing_data.isEmpty()) {
                    return Id;
                } else {
                    Id = Nursing.nursing_data.get(Nursing.nursing_data.size() - 1).getId();
                    return ++Id;
                }
            case "Pharmacist":
                Id = 300000;

                if (Pharmacist.Pharmacist_data.isEmpty()) {
                    return Id;
                } else {
                    Id = Pharmacist.Pharmacist_data.get(Pharmacist.Pharmacist_data.size() - 1).getId();
                    return ++Id;
                }

        }
        return -1;
    }
    
}
