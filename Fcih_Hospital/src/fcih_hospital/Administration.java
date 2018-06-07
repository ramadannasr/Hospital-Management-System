package fcih_hospital;

import Ihospital.Iprocessing;
import static fcih_hospital.Archive.archiveEmployee_data;
import static fcih_hospital.Cashier.cash_data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static fcih_hospital.Receptionist.recep_data;
import static fcih_hospital.Doctor.docter_data;
import static fcih_hospital.Nursing.nursing_data;
import static fcih_hospital.Patient.Patients_data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Administration extends Employees implements Iprocessing, Serializable {

    static ArrayList<Administration> admin_data = new ArrayList<>();

    public static boolean flag = true;

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
        } else if (Employees.getEmp_type().equals("Cashier")) {
            for (Cashier obj : cash_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return obj;
                }
            }
        } else if (Employees.getEmp_type().equals("ArchiveEmployee")) {
            for (Archive obj : archiveEmployee_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Pharmacist")) {
            for (Pharmacist obj : Pharmacist.Pharmacist_data) {
                fullName = obj.getFname() + obj.getLname() + obj.getFaname();
                if (fullName.equals(emp_name)) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override
    public void addData(Object o) {
        if (Employees.getEmp_type().equals("Receptionist")) {
            Receptionist obj1 = (Receptionist) o;
            obj1.writeData(o);

        } else if (Employees.getEmp_type().equals("Doctor")) {

            Doctor obj2 = (Doctor) o;
            obj2.writeData(o);

        } else if (Employees.getEmp_type().equals("Nurse")) {
            Nursing obj3 = (Nursing) o;
            obj3.writeData(o);
        } else if (Employees.getEmp_type().equals("Cashier")) {
            Cashier obj4 = (Cashier) o;
            obj4.writeData(o);
        } else if (Employees.getEmp_type().equals("ArchiveEmployee")) {
            Archive obj5 = (Archive) o;
            obj5.writeData(o);
        } else if (Employees.getEmp_type().equals("Pharmacist")) {
            Pharmacist obj6 = (Pharmacist) o;
            obj6.writeData(o);
        }

    }

    

    @Override
    public boolean editData(Object EditedData, int ID) {

        if (Employees.getEmp_type().equals("Receptionist")) {
            for (Receptionist obj : recep_data) {
                if (obj.getId() == ID) {
                    recep_data.remove(obj);
                    recep_data.add((Receptionist) EditedData);
                    return true;

                }
            }

        } else if (Employees.getEmp_type().equals("Doctor")) {
            for (Doctor obj : docter_data) {
                if (obj.getId() == ID) {
                    docter_data.remove(obj);
                    docter_data.add((Doctor) EditedData);
                    return true;

                }
            }

        } else if (Employees.getEmp_type().equals("Nurse")) {
            for (Nursing obj : nursing_data) {
                if (obj.getId() == ID) {
                    nursing_data.remove(obj);
                    nursing_data.add((Nursing) EditedData);
                    return true;

                }
            }
        } else if (Employees.getEmp_type().equals("Cashier")) {
            for (Cashier obj : cash_data) {
                if (obj.getId() == ID) {
                    cash_data.remove(obj);
                    cash_data.add((Cashier) EditedData);
                    return true;

                }
            }
        } else if (Employees.getEmp_type().equals("ArchiveEmployee")) {
            for (Archive obj : archiveEmployee_data) {
                if (obj.getId() == ID) {
                    archiveEmployee_data.remove(obj);
                    archiveEmployee_data.add((Archive) EditedData);
                    return true;

                }
            }
        } else if (Employees.getEmp_type().equals("Pharmacist")) {
            for (Pharmacist obj : Pharmacist.Pharmacist_data) {
                if (obj.getId() == ID) {
                    Pharmacist.Pharmacist_data.remove(obj);
                    Pharmacist.Pharmacist_data.add((Pharmacist) EditedData);
                    return true;

                }
            }
        }

        return false;

    }

    public static void loadAllData() {
        if (flag) {
            FileInputStream FIS;
            try {
                FIS = new FileInputStream("Admindata.bin");
                ObjectInputStream in = new ObjectInputStream(FIS);

                admin_data = (ArrayList<Administration>) (Object) in.readObject();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = false;
        }
    }

    public static void SaveAllData() {
        FileOutputStream FOS = null;
        try {
            FOS = new FileOutputStream("Admindata.bin");
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(admin_data);
            out.close();
            FOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Object> readData() {
        return (ArrayList<Object>) (Object) admin_data;
    }

    @Override
    public void writeData(Object o) {
        Administration obj = ((Administration) o);
        admin_data.add(obj);
    }

    @Override
    public Person Search(int Id) {
        if (Employees.getEmp_type().equals("Receptionist")) {

            for (Receptionist obj : recep_data) {

                if (obj.getId() == Id) {

                    return (Receptionist) obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Doctor")) {
            for (Doctor obj : docter_data) {
                if (obj.getId() == Id) {
                    return obj;

                }
            }
        } else if (Employees.getEmp_type().equals("Nurse")) {
            for (Nursing obj : nursing_data) {
                if (obj.getId() == Id) {
                    return (Nursing) obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Cashier")) {
            for (Cashier obj : cash_data) {
                if (obj.getId() == Id) {
                    return (Cashier) obj;
                }
            }
        } else if (Employees.getEmp_type().equals("Pharmacist")) {
            for (Pharmacist obj : Pharmacist.Pharmacist_data) {
                if (obj.getId() == Id) {
                    return (Pharmacist) obj;
                }
            }
        }

        return null;

    }

    @Override
    public boolean removeData(int id) {
        if (Employees.getEmp_type().equals("Patient")) {
            for (Patient p : Patients_data) {

                if (p.getId() == id) {
                    Patients_data.remove(p);
                    return true;
                }
            }
            return false;
        }
      else  if (Employees.getEmp_type().equals("Nurse")) {
            for (Nursing p : nursing_data) {

                if (p.getId() == id) {
                    nursing_data.remove(p);
                    
                    return true;
                }
            }
            return false;
        }
       else  if (Employees.getEmp_type().equals("Doctor")) {
            for (Doctor p : docter_data) {

                if (p.getId() == id) {
                    docter_data.remove(p);
                    return true;
                }
            }
            return false;
        }
         
         
      else   if (Employees.getEmp_type().equals("Receptionist")) {
            for (Receptionist p : recep_data) {

                if (p.getId() == id) {
                    recep_data.remove(p);
                    return true;
                }
            }
            return false;
        }
        
        

        return false;
    }
}
