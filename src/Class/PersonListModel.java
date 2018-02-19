/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author bortu
 */
public class PersonListModel extends AbstractListModel{
    
    private ArrayList<Persons> personList = new ArrayList();

   

    @Override
    public int getSize() {
        return this.personList.size();
    }

    @Override
    public Object getElementAt(int index) {
        return personList.get(index);
    }
    
    public void addPerson(Persons person){
        this.personList.add(person);
        this.fireIntervalAdded(this, this.getSize(), this.getSize()+1);
    }
    
    public void removePerson(int index){
        this.personList.remove(index);
        this.fireIntervalRemoved(this, this.getSize(), this.getSize()+1);
    }
    
    
}
