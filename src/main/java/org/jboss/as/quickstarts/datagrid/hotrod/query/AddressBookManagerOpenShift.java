package org.jboss.as.quickstarts.datagrid.hotrod.query;

public class AddressBookManagerOpenShift {

   public static void main(String[] args) throws Exception {
      AddressBookManager manager = new AddressBookManager();

      manager.clearCache();
      manager.addLotsOfPeopleInLots(1, 10000, 100);
      manager.queryLotsOfPeople(100);

      manager.stop();
   }
}
