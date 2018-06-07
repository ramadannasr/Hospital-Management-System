package fcih_hospital;

import Ihospital.Iprocessing;
import static fcih_hospital.Administration.admin_data;
import static fcih_hospital.Cashier.cash_data;
import static fcih_hospital.Doctor.docter_data;
import static fcih_hospital.Nursing.nursing_data;
import static fcih_hospital.Receptionist.recep_data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuperAdmin extends Employees implements Iprocessing, Serializable {

    static ArrayList<SuperAdmin> super_data = new ArrayList<>();
    
    public static boolean flag = true;

    @Override
    public void addData(Object o) {
        if (Employees.getEmp_type().equals("Administrator")) {
            Administration obj1 = (Administration) o;
            obj1.writeData(o);

        } else if (Employees.getEmp_type().equals("SuperAdministrator")) {

            SuperAdmin obj2 = (SuperAdmin) o;
            obj2.writeData(o);

        }
    }

    @Override
    public Object viewData(Object Name) {
        String emp_name = (String) Name;
        String fullName;
        if (Employees.getEmp_type().equals("Receptionist")) {
            for (Receptionist obj : recep_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Receptionist) obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Doctor")) {
            for (Doctor obj : docter_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Doctor) obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Nurse")) {
            for (Nursing obj : nursing_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Nursing) obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Administrator")) {
            for (Administration obj : admin_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Administration) obj;
                }
            }

        }else if (Employees.getEmp_type().equals("SuperAdministrator")) {
            for (SuperAdmin obj : super_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (SuperAdmin) obj;
                }
            }

        }else if (Employees.getEmp_type().equals("Cashier")) {
            for (Cashier obj : cash_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Cashier) obj;
                }
            }

        }
        else if (Employees.getEmp_type().equals("ArchiveEmployee")) {
            for (Archive obj : Archive.archiveEmployee_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Archive) obj;
                }
            }

        }else if (Employees.getEmp_type().equals("Pharmacist")) {
            for (Pharmacist obj : Pharmacist.Pharmacist_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return (Pharmacist) obj;
                }
            }

        }
        return null;
    }

    @Override
    public Object Search(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editData(Object EditedData, int ID) {
        if (Employees.getEmp_type().equals("Administrator")) {
            for (Administration obj : admin_data) {
                if (obj.getId() == ID) {
                    admin_data.remove(obj);
                    admin_data.add((Administration) EditedData);
                    return true;

                }
            }
        } else if (Employees.getEmp_type().equals("SuperAdministrator")) {
            for (SuperAdmin obj : super_data) {
                if (obj.getId() == ID) {
                    super_data.remove(obj);
                    super_data.add((SuperAdmin) EditedData);
                    return true;
                }
                }
            }
        return false;
    }

    
    public static void loadAllData() {
        if(flag){
        FileInputStream FIS;
        try {
            FIS = new FileInputStream("Superdata.bin");
            ObjectInputStream in = new ObjectInputStream(FIS);

            super_data = (ArrayList<SuperAdmin>) (Object) in.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = false;
    }
    }

    
    public static void SaveAllData() {
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Superdata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(super_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) super_data;
    }

    @Override
    public void writeData(Object o
    ) {
        SuperAdmin obj = ((SuperAdmin) o);
        super_data.add(obj);
    }
    @Override
        public  boolean removeData(int id) {
      if (Employees.getEmp_type().equals("Receptionist")) {
            for (Administration obj : Administration.admin_data) {

                if (obj.getId() == id) {
                   
                    recep_data.remove(obj);

                    return true;
                }
            }

        }
        
        return false;
    }
    }


