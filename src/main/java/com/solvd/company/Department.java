package com.solvd.company;

import com.solvd.Exceptions.CleaningCompanyBuildingException;
import com.solvd.employees.Cleaner;
import com.solvd.employees.Manager;
import com.solvd.employees.Worker;
import com.solvd.money.Expense;
import com.solvd.money.Invoice;
import com.solvd.resource.Client;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

public class Department {

    private String departmentName;
    private Manager manager = new Manager();
    private ArrayList<Worker> workers = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private Expense expense = new Expense();
    private Cleaner cleaner = new Cleaner();
    private Invoice invoice = new Invoice();

//    protected static final Logger logger = LogManager.getLogger();
//    logger.info("check!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    // add clients to the file etc.

    public void createInvoice(int invoiceNumber, int idClient){
            invoice.createInvoice(invoiceNumber, clients.get(idClient));

    }

    public void checkCosts(){
        System.out.println(expense.costs(workers,manager,cleaner));
    }

    public void checkProfit(){
        System.out.println(expense.profit(clients));
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void hireCleaner(Cleaner cleaner){
        this.cleaner = cleaner;
    }


    public void cleanBuilding(){
        try {
            Calendar c = Calendar.getInstance();
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != 6) {
                throw new CleaningCompanyBuildingException("Today is not friday, we are cleaning at the end of the week ");
            }
            else{
                cleaner.cleanBuilding();
            }
        }
        catch (CleaningCompanyBuildingException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void hireWorker(Worker worker){

        workers.add(worker);

    }

    public void fireManager(){
        manager.fireEmployee();
        this.manager = null;
    }

    public void fireWorker(int id_worker){

        workers.remove(id_worker);

    }

    public void hireManager(Manager manager){
        this.manager = manager;
    }
    public Manager printManager(){
        return manager;
    }

    public void checkManagerPaycheck(){
        System.out.println(manager.getPaycheck());
    }

    public void addClient(Client client){

        clients.add(client);

    }

    public void printClients(){

        for(int i = 0; i< clients.size(); i++){
            System.out.println(clients.get(i));
        }
    }

    public void printWorkers(){

        for(int i = 0; i< workers.size(); i++){
            System.out.println(workers.get(i));
        }
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    File clientsTXT = new File("C:\\Users\\Hubi\\Desktop\\test automation course\\building_company\\src\\main\\resources\\clients.txt");

    public void writeClientsToTXT() throws IOException{
        try{
//            FileOutputStream fileOutputStream = new FileOutputStream(clientsTXT);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(clients.get(1));
//            objectOutputStream.flush();
//            objectOutputStream.close();

            for (int i = 0; i<clients.size();i++){
                String name = clients.get(i).getName();
                String surname = clients.get(i).getSurname();
                String address = clients.get(i).getAddress();
                FileUtils.writeStringToFile(clientsTXT,name + System.lineSeparator(), "UTF-8", true);
                FileUtils.writeStringToFile(clientsTXT,surname + System.lineSeparator(), "UTF-8", true);
                FileUtils.writeStringToFile(clientsTXT,address + System.lineSeparator(), "UTF-8", true);

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) && Objects.equals(manager, that.manager) && Objects.equals(expense, that.expense);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(departmentName, manager, expense);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", manager=" + manager +
                '}';
    }
}
