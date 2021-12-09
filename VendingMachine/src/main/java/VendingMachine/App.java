/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;

import Controller.VendingMachineController;
import Service.VendingMachineServiceImpl;
import UI.UserIO;
import UI.UserIOConsoleImpl;
import UI.VendingMachineView;
import VendingDao.VendingMachineDao;
import VendingDao.VendingMachineDaoFileImpl;

/**
 *
 * @author Nur
 */
public class App {
        public static void main(String[] args) {
        
       UserIO io = new UserIOConsoleImpl();
      VendingMachineView view = new VendingMachineView(io);
       VendingMachineDao dao = new VendingMachineDaoFileImpl();
      VendingMachineServiceImpl service = new VendingMachineServiceImpl(dao);
      VendingMachineController controller = new VendingMachineController (view, service);
       controller.run();
}
}